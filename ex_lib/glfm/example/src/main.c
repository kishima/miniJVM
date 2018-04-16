// Example app that draws a triangle. The triangle can be moved via touch or keyboard arrow keys.
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "glfm.h"


#define FILE_COMPAT_ANDROID_ACTIVITY glfmAndroidGetActivity()

#include "file_compat.h"
#include "../../../mini_jvm/utils/tinycthread.h"
#include "../../../mini_jvm/jvm/jvm.h"
#include "../../../mini_jvm/jvm/garbage.h"

#ifdef NDEBUG
#define LOG_DEBUG(...) do { } while (0)
#else
#if defined(GLFM_PLATFORM_ANDROID)
#define LOG_DEBUG(...) __android_log_print(ANDROID_LOG_INFO, "GLFM", __VA_ARGS__)
#else
#define LOG_DEBUG(...) do { } while (0)
#endif
#endif


typedef struct {
    thrd_t _jvm_thread;//jvm线程
    GLuint program;
    GLuint vertexBuffer;

    double lastTouchX;
    double lastTouchY;

    double offsetX;
    double offsetY;
} ExampleApp;

static void onFrame(GLFMDisplay *display, double frameTime);

static void onSurfaceCreated(GLFMDisplay *display, int width, int height);

static void onSurfaceDestroyed(GLFMDisplay *display);

static bool onTouch(GLFMDisplay *display, int touch, GLFMTouchPhase phase, double x, double y);

static bool onKey(GLFMDisplay *display, GLFMKey keyCode, GLFMKeyAction action, int modifiers);

int jvm_thrd_func(void *para);

extern void JNI_OnLoad(JniEnv *env);
static thrd_t _jvm_thread;//jvm线程
static GLFMDisplay *glfm_display;
static Runtime *runtime;

// Main entry point
void glfmMain(GLFMDisplay *display) {
    glfm_display=display;
    
//    ExampleApp *app = calloc(1, sizeof(ExampleApp));
//
    glfmSetDisplayConfig(display,
                         GLFMRenderingAPIOpenGLES2,
                         GLFMColorFormatRGBA8888,
                         GLFMDepthFormatNone,
                         GLFMStencilFormatNone,
                         GLFMMultisampleNone);
//    glfmSetUserData(display, app);
//    glfmSetSurfaceCreatedFunc(display, onSurfaceCreated);
//    glfmSetSurfaceResizedFunc(display, onSurfaceCreated);
//    glfmSetSurfaceDestroyedFunc(display, onSurfaceDestroyed);
//    glfmSetMainLoopFunc(display, onFrame);
//    glfmSetTouchFunc(display, onTouch);
//    glfmSetKeyFunc(display, onKey);
    //gladLoadGLLoader((GLADloadproc) glfwGetProcAddress);

    Utf8String *classpath = utf8_create();
    utf8_append_c(classpath, glfmGetResRoot());
    utf8_append_c(classpath, "/minijvm_rt.jar;");
    utf8_append_c(classpath, glfmGetResRoot());
    utf8_append_c(classpath, "/glfm_gui.jar;");
    jvm_printf("%s\n",utf8_cstr(classpath));

    runtime=runtime_create(NULL);
    jvm_init(utf8_cstr(classpath), JNI_OnLoad);
    utf8_destory(classpath);
    c8* p_classname="app/GlfmMain";
    c8* p_methodname="glinit";
    c8* p_methodtype="(J)V";
    push_long(runtime->stack,(intptr_t)display);
    call_method_c(p_classname,p_methodname,p_methodtype,runtime);
    //thrd_create(&_jvm_thread, jvm_thrd_func, NULL);
}

//int jvm_thrd_func(void *para) {
//    s32 ret;
//
//  char *p_classname = NULL;
//    ArrayList *java_para = arraylist_create(0);
//    //add display para
//    Utf8String *dis_str=utf8_create();
//    utf8_append_s64(dis_str, (intptr_t)glfm_display, 16);
//    arraylist_push_back(java_para, utf8_cstr(dis_str));
//
//    java_debug = 0;
//
//
//
//    p_classname = "app/GlfmMain";
//    c8 *p_methodname = "main";
//    c8 *p_methodtype = "([Ljava/lang/String;)V";
//
//
//    ret = execute_jvm_main(p_classname,p_methodname, p_methodtype,java_para );
////    ret = execute_jvm(utf8_cstr(classpath), main_name, java_para);
//    arraylist_destory(java_para);
//    utf8_destory(dis_str);
//    LOG_DEBUG("mini_jvm execute success.");
//    return ret;
//}


static bool onTouch(GLFMDisplay *display, int touch, GLFMTouchPhase phase, double x, double y) {
    if (phase == GLFMTouchPhaseHover) {
        return false;
    }
    ExampleApp *app = glfmGetUserData(display);
    if (phase != GLFMTouchPhaseBegan) {
        int width, height;
        glfmGetDisplaySize(display, &width, &height);
        app->offsetX += 2 * (x - app->lastTouchX) / width;
        app->offsetY -= 2 * (y - app->lastTouchY) / height;
    }
    app->lastTouchX = x;
    app->lastTouchY = y;
    return true;
}

static bool onKey(GLFMDisplay *display, GLFMKey keyCode, GLFMKeyAction action, int modifiers) {
    bool handled = false;
    if (action == GLFMKeyActionPressed) {
        ExampleApp *app = glfmGetUserData(display);
        switch (keyCode) {
            case GLFMKeyLeft:
                app->offsetX -= 0.1f;
                handled = true;
                break;
            case GLFMKeyRight:
                app->offsetX += 0.1f;
                handled = true;
                break;
            case GLFMKeyUp:
                app->offsetY += 0.1f;
                handled = true;
                break;
            case GLFMKeyDown:
                app->offsetY -= 0.1f;
                handled = true;
                break;
            default:
                break;
        }
    }
    return handled;
}

static void onSurfaceCreated(GLFMDisplay *display, int width, int height) {
    glViewport(0, 0, width, height);

    GLFMRenderingAPI api = glfmGetRenderingAPI(display);
    printf("Hello from GLFM! Using OpenGL %s\n",
           api == GLFMRenderingAPIOpenGLES32 ? "ES 3.2" :
           api == GLFMRenderingAPIOpenGLES31 ? "ES 3.1" :
           api == GLFMRenderingAPIOpenGLES3 ? "ES 3.0" : "ES 2.0");
}

static void onSurfaceDestroyed(GLFMDisplay *display) {
    // When the surface is destroyed, all existing GL resources are no longer valid.
    ExampleApp *app = glfmGetUserData(display);
    app->program = 0;
    app->vertexBuffer = 0;
}

static GLuint compileShader(GLenum type, const char *shaderName) {
    char fullPath[PATH_MAX];
    fc_resdir(fullPath, sizeof(fullPath));
    strncat(fullPath, shaderName, sizeof(fullPath) - strlen(fullPath) - 1);

    // Get shader string
    char *shaderString = NULL;
    FILE *shaderFile = fopen(fullPath, "rb");
    if (shaderFile) {
        fseek(shaderFile, 0, SEEK_END);
        long length = ftell(shaderFile);
        fseek(shaderFile, 0, SEEK_SET);

        shaderString = malloc(length + 1);
        if (shaderString) {
            fread(shaderString, length, 1, shaderFile);
            shaderString[length] = 0;
        }
        fclose(shaderFile);
    }
    if (!shaderString) {
        printf("Couldn't read file: %s\n", fullPath);
        return 0;
    }

    // Compile
    const char *constChaderString = shaderString;
    GLuint shader = glCreateShader(type);
    glShaderSource(shader, 1, &constChaderString, NULL);
    glCompileShader(shader);
    free(shaderString);

    // Check compile status
    GLint status;
    glGetShaderiv(shader, GL_COMPILE_STATUS, &status);
    if (status == 0) {
        printf("Couldn't compile shader: %s\n", shaderName);
        GLint logLength;
        glGetShaderiv(shader, GL_INFO_LOG_LENGTH, &logLength);
        if (logLength > 0) {
            GLchar *log = malloc(logLength);
            glGetShaderInfoLog(shader, logLength, &logLength, log);
            if (log[0] != 0) {
                printf("Shader log: %s\n", log);
            }
            free(log);
        }
        glDeleteShader(shader);
        shader = 0;
    }
    return shader;
}

static void onFrame(GLFMDisplay *display, double frameTime) {
    ExampleApp *app = glfmGetUserData(display);
    //jvm_printf("=========================================================\n");
    // Draw background
    glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    glClear(GL_COLOR_BUFFER_BIT);

    // Draw triangle
    if (app->program == 0) {
        GLuint vertShader = compileShader(GL_VERTEX_SHADER, "simple.vert");
        GLuint fragShader = compileShader(GL_FRAGMENT_SHADER, "simple.frag");
        if (vertShader == 0 || fragShader == 0) {
            glfmSetMainLoopFunc(display, NULL);
            return;
        }
        app->program = glCreateProgram();

        glAttachShader(app->program, vertShader);
        glAttachShader(app->program, fragShader);

        glBindAttribLocation(app->program, 0, "a_position");
        glBindAttribLocation(app->program, 1, "a_color");

        glLinkProgram(app->program);

        glDeleteShader(vertShader);
        glDeleteShader(fragShader);
    }
    glUseProgram(app->program);
    if (app->vertexBuffer == 0) {
        glGenBuffers(1, &app->vertexBuffer);
    }
    glBindBuffer(GL_ARRAY_BUFFER, app->vertexBuffer);
    const size_t stride = sizeof(GLfloat) * 6;
    glEnableVertexAttribArray(0);
    glVertexAttribPointer(0, 3, GL_FLOAT, GL_FALSE, stride, (void *) 0);
    glEnableVertexAttribArray(1);
    glVertexAttribPointer(1, 3, GL_FLOAT, GL_FALSE, stride, (void *) (sizeof(GLfloat) * 3));

    const GLfloat vertices[] = {
            // x,y,z, r,g,b
            app->offsetX + 0.0f, app->offsetY + 0.5f, 0.0, 1.0, 0.0, 0.0,
            app->offsetX - 0.5f, app->offsetY - 0.5f, 0.0, 0.0, 1.0, 0.0,
            app->offsetX + 0.5f, app->offsetY - 0.5f, 0.0, 0.0, 0.0, 1.0,
    };

    glBufferData(GL_ARRAY_BUFFER, sizeof(vertices), vertices, GL_STATIC_DRAW);
    glDrawArrays(GL_TRIANGLES, 0, 3);
}
