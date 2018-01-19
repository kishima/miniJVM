package org.mini.gl;

public class GL {
    public static final int GL_DEPTH_BUFFER_BIT = 0x00000100;
    public static final int GL_STENCIL_BUFFER_BIT = 0x00000400;
    public static final int GL_COLOR_BUFFER_BIT = 0x00004000;
    public static final int GL_FALSE = 0;
    public static final int GL_TRUE = 1;
    public static final int GL_POINTS = 0x0000;
    public static final int GL_LINES = 0x0001;
    public static final int GL_LINE_LOOP = 0x0002;
    public static final int GL_LINE_STRIP = 0x0003;
    public static final int GL_TRIANGLES = 0x0004;
    public static final int GL_TRIANGLE_STRIP = 0x0005;
    public static final int GL_TRIANGLE_FAN = 0x0006;
    public static final int GL_QUADS = 0x0007;
    public static final int GL_NEVER = 0x0200;
    public static final int GL_LESS = 0x0201;
    public static final int GL_EQUAL = 0x0202;
    public static final int GL_LEQUAL = 0x0203;
    public static final int GL_GREATER = 0x0204;
    public static final int GL_NOTEQUAL = 0x0205;
    public static final int GL_GEQUAL = 0x0206;
    public static final int GL_ALWAYS = 0x0207;
    public static final int GL_ZERO = 0;
    public static final int GL_ONE = 1;
    public static final int GL_SRC_COLOR = 0x0300;
    public static final int GL_ONE_MINUS_SRC_COLOR = 0x0301;
    public static final int GL_SRC_ALPHA = 0x0302;
    public static final int GL_ONE_MINUS_SRC_ALPHA = 0x0303;
    public static final int GL_DST_ALPHA = 0x0304;
    public static final int GL_ONE_MINUS_DST_ALPHA = 0x0305;
    public static final int GL_DST_COLOR = 0x0306;
    public static final int GL_ONE_MINUS_DST_COLOR = 0x0307;
    public static final int GL_SRC_ALPHA_SATURATE = 0x0308;
    public static final int GL_NONE = 0;
    public static final int GL_FRONT_LEFT = 0x0400;
    public static final int GL_FRONT_RIGHT = 0x0401;
    public static final int GL_BACK_LEFT = 0x0402;
    public static final int GL_BACK_RIGHT = 0x0403;
    public static final int GL_FRONT = 0x0404;
    public static final int GL_BACK = 0x0405;
    public static final int GL_LEFT = 0x0406;
    public static final int GL_RIGHT = 0x0407;
    public static final int GL_FRONT_AND_BACK = 0x0408;
    public static final int GL_NO_ERROR = 0;
    public static final int GL_INVALID_ENUM = 0x0500;
    public static final int GL_INVALID_VALUE = 0x0501;
    public static final int GL_INVALID_OPERATION = 0x0502;
    public static final int GL_OUT_OF_MEMORY = 0x0505;
    public static final int GL_CW = 0x0900;
    public static final int GL_CCW = 0x0901;
    public static final int GL_POINT_SIZE = 0x0B11;
    public static final int GL_POINT_SIZE_RANGE = 0x0B12;
    public static final int GL_POINT_SIZE_GRANULARITY = 0x0B13;
    public static final int GL_LINE_SMOOTH = 0x0B20;
    public static final int GL_LINE_WIDTH = 0x0B21;
    public static final int GL_LINE_WIDTH_RANGE = 0x0B22;
    public static final int GL_LINE_WIDTH_GRANULARITY = 0x0B23;
    public static final int GL_POLYGON_MODE = 0x0B40;
    public static final int GL_POLYGON_SMOOTH = 0x0B41;
    public static final int GL_CULL_FACE = 0x0B44;
    public static final int GL_CULL_FACE_MODE = 0x0B45;
    public static final int GL_FRONT_FACE = 0x0B46;
    public static final int GL_DEPTH_RANGE = 0x0B70;
    public static final int GL_DEPTH_TEST = 0x0B71;
    public static final int GL_DEPTH_WRITEMASK = 0x0B72;
    public static final int GL_DEPTH_CLEAR_VALUE = 0x0B73;
    public static final int GL_DEPTH_FUNC = 0x0B74;
    public static final int GL_STENCIL_TEST = 0x0B90;
    public static final int GL_STENCIL_CLEAR_VALUE = 0x0B91;
    public static final int GL_STENCIL_FUNC = 0x0B92;
    public static final int GL_STENCIL_VALUE_MASK = 0x0B93;
    public static final int GL_STENCIL_FAIL = 0x0B94;
    public static final int GL_STENCIL_PASS_DEPTH_FAIL = 0x0B95;
    public static final int GL_STENCIL_PASS_DEPTH_PASS = 0x0B96;
    public static final int GL_STENCIL_REF = 0x0B97;
    public static final int GL_STENCIL_WRITEMASK = 0x0B98;
    public static final int GL_VIEWPORT = 0x0BA2;
    public static final int GL_DITHER = 0x0BD0;
    public static final int GL_BLEND_DST = 0x0BE0;
    public static final int GL_BLEND_SRC = 0x0BE1;
    public static final int GL_BLEND = 0x0BE2;
    public static final int GL_LOGIC_OP_MODE = 0x0BF0;
    public static final int GL_COLOR_LOGIC_OP = 0x0BF2;
    public static final int GL_DRAW_BUFFER = 0x0C01;
    public static final int GL_READ_BUFFER = 0x0C02;
    public static final int GL_SCISSOR_BOX = 0x0C10;
    public static final int GL_SCISSOR_TEST = 0x0C11;
    public static final int GL_COLOR_CLEAR_VALUE = 0x0C22;
    public static final int GL_COLOR_WRITEMASK = 0x0C23;
    public static final int GL_DOUBLEBUFFER = 0x0C32;
    public static final int GL_STEREO = 0x0C33;
    public static final int GL_LINE_SMOOTH_HINT = 0x0C52;
    public static final int GL_POLYGON_SMOOTH_HINT = 0x0C53;
    public static final int GL_UNPACK_SWAP_BYTES = 0x0CF0;
    public static final int GL_UNPACK_LSB_FIRST = 0x0CF1;
    public static final int GL_UNPACK_ROW_LENGTH = 0x0CF2;
    public static final int GL_UNPACK_SKIP_ROWS = 0x0CF3;
    public static final int GL_UNPACK_SKIP_PIXELS = 0x0CF4;
    public static final int GL_UNPACK_ALIGNMENT = 0x0CF5;
    public static final int GL_PACK_SWAP_BYTES = 0x0D00;
    public static final int GL_PACK_LSB_FIRST = 0x0D01;
    public static final int GL_PACK_ROW_LENGTH = 0x0D02;
    public static final int GL_PACK_SKIP_ROWS = 0x0D03;
    public static final int GL_PACK_SKIP_PIXELS = 0x0D04;
    public static final int GL_PACK_ALIGNMENT = 0x0D05;
    public static final int GL_MAX_TEXTURE_SIZE = 0x0D33;
    public static final int GL_MAX_VIEWPORT_DIMS = 0x0D3A;
    public static final int GL_SUBPIXEL_BITS = 0x0D50;
    public static final int GL_TEXTURE_1D = 0x0DE0;
    public static final int GL_TEXTURE_2D = 0x0DE1;
    public static final int GL_POLYGON_OFFSET_UNITS = 0x2A00;
    public static final int GL_POLYGON_OFFSET_POINT = 0x2A01;
    public static final int GL_POLYGON_OFFSET_LINE = 0x2A02;
    public static final int GL_POLYGON_OFFSET_FILL = 0x8037;
    public static final int GL_POLYGON_OFFSET_FACTOR = 0x8038;
    public static final int GL_TEXTURE_BINDING_1D = 0x8068;
    public static final int GL_TEXTURE_BINDING_2D = 0x8069;
    public static final int GL_TEXTURE_WIDTH = 0x1000;
    public static final int GL_TEXTURE_HEIGHT = 0x1001;
    public static final int GL_TEXTURE_INTERNAL_FORMAT = 0x1003;
    public static final int GL_TEXTURE_BORDER_COLOR = 0x1004;
    public static final int GL_TEXTURE_RED_SIZE = 0x805C;
    public static final int GL_TEXTURE_GREEN_SIZE = 0x805D;
    public static final int GL_TEXTURE_BLUE_SIZE = 0x805E;
    public static final int GL_TEXTURE_ALPHA_SIZE = 0x805F;
    public static final int GL_DONT_CARE = 0x1100;
    public static final int GL_FASTEST = 0x1101;
    public static final int GL_NICEST = 0x1102;
    public static final int GL_BYTE = 0x1400;
    public static final int GL_UNSIGNED_BYTE = 0x1401;
    public static final int GL_SHORT = 0x1402;
    public static final int GL_UNSIGNED_SHORT = 0x1403;
    public static final int GL_INT = 0x1404;
    public static final int GL_UNSIGNED_INT = 0x1405;
    public static final int GL_FLOAT = 0x1406;
    public static final int GL_DOUBLE = 0x140A;
    public static final int GL_STACK_OVERFLOW = 0x0503;
    public static final int GL_STACK_UNDERFLOW = 0x0504;
    public static final int GL_CLEAR = 0x1500;
    public static final int GL_AND = 0x1501;
    public static final int GL_AND_REVERSE = 0x1502;
    public static final int GL_COPY = 0x1503;
    public static final int GL_AND_INVERTED = 0x1504;
    public static final int GL_NOOP = 0x1505;
    public static final int GL_XOR = 0x1506;
    public static final int GL_OR = 0x1507;
    public static final int GL_NOR = 0x1508;
    public static final int GL_EQUIV = 0x1509;
    public static final int GL_INVERT = 0x150A;
    public static final int GL_OR_REVERSE = 0x150B;
    public static final int GL_COPY_INVERTED = 0x150C;
    public static final int GL_OR_INVERTED = 0x150D;
    public static final int GL_NAND = 0x150E;
    public static final int GL_SET = 0x150F;
    public static final int GL_TEXTURE = 0x1702;
    public static final int GL_COLOR = 0x1800;
    public static final int GL_DEPTH = 0x1801;
    public static final int GL_STENCIL = 0x1802;
    public static final int GL_STENCIL_INDEX = 0x1901;
    public static final int GL_DEPTH_COMPONENT = 0x1902;
    public static final int GL_RED = 0x1903;
    public static final int GL_GREEN = 0x1904;
    public static final int GL_BLUE = 0x1905;
    public static final int GL_ALPHA = 0x1906;
    public static final int GL_RGB = 0x1907;
    public static final int GL_RGBA = 0x1908;
    public static final int GL_POINT = 0x1B00;
    public static final int GL_LINE = 0x1B01;
    public static final int GL_FILL = 0x1B02;
    public static final int GL_KEEP = 0x1E00;
    public static final int GL_REPLACE = 0x1E01;
    public static final int GL_INCR = 0x1E02;
    public static final int GL_DECR = 0x1E03;
    public static final int GL_VENDOR = 0x1F00;
    public static final int GL_RENDERER = 0x1F01;
    public static final int GL_VERSION = 0x1F02;
    public static final int GL_EXTENSIONS = 0x1F03;
    public static final int GL_NEAREST = 0x2600;
    public static final int GL_LINEAR = 0x2601;
    public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;
    public static final int GL_LINEAR_MIPMAP_NEAREST = 0x2701;
    public static final int GL_NEAREST_MIPMAP_LINEAR = 0x2702;
    public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;
    public static final int GL_TEXTURE_MAG_FILTER = 0x2800;
    public static final int GL_TEXTURE_MIN_FILTER = 0x2801;
    public static final int GL_TEXTURE_WRAP_S = 0x2802;
    public static final int GL_TEXTURE_WRAP_T = 0x2803;
    public static final int GL_PROXY_TEXTURE_1D = 0x8063;
    public static final int GL_PROXY_TEXTURE_2D = 0x8064;
    public static final int GL_REPEAT = 0x2901;
    public static final int GL_R3_G3_B2 = 0x2A10;
    public static final int GL_RGB4 = 0x804F;
    public static final int GL_RGB5 = 0x8050;
    public static final int GL_RGB8 = 0x8051;
    public static final int GL_RGB10 = 0x8052;
    public static final int GL_RGB12 = 0x8053;
    public static final int GL_RGB16 = 0x8054;
    public static final int GL_RGBA2 = 0x8055;
    public static final int GL_RGBA4 = 0x8056;
    public static final int GL_RGB5_A1 = 0x8057;
    public static final int GL_RGBA8 = 0x8058;
    public static final int GL_RGB10_A2 = 0x8059;
    public static final int GL_RGBA12 = 0x805A;
    public static final int GL_RGBA16 = 0x805B;
    public static final int GL_CURRENT_BIT = 0x00000001;
    public static final int GL_POINT_BIT = 0x00000002;
    public static final int GL_LINE_BIT = 0x00000004;
    public static final int GL_POLYGON_BIT = 0x00000008;
    public static final int GL_POLYGON_STIPPLE_BIT = 0x00000010;
    public static final int GL_PIXEL_MODE_BIT = 0x00000020;
    public static final int GL_LIGHTING_BIT = 0x00000040;
    public static final int GL_FOG_BIT = 0x00000080;
    public static final int GL_ACCUM_BUFFER_BIT = 0x00000200;
    public static final int GL_VIEWPORT_BIT = 0x00000800;
    public static final int GL_TRANSFORM_BIT = 0x00001000;
    public static final int GL_ENABLE_BIT = 0x00002000;
    public static final int GL_HINT_BIT = 0x00008000;
    public static final int GL_EVAL_BIT = 0x00010000;
    public static final int GL_LIST_BIT = 0x00020000;
    public static final int GL_TEXTURE_BIT = 0x00040000;
    public static final int GL_SCISSOR_BIT = 0x00080000;
    public static final long GL_ALL_ATTRIB_BITS = 0xFFFFFFFFL;
    public static final int GL_CLIENT_PIXEL_STORE_BIT = 0x00000001;
    public static final int GL_CLIENT_VERTEX_ARRAY_BIT = 0x00000002;
    public static final long GL_CLIENT_ALL_ATTRIB_BITS = 0xFFFFFFFFL;
    public static final int GL_QUAD_STRIP = 0x0008;
    public static final int GL_POLYGON = 0x0009;
    public static final int GL_ACCUM = 0x0100;
    public static final int GL_LOAD = 0x0101;
    public static final int GL_RETURN = 0x0102;
    public static final int GL_MULT = 0x0103;
    public static final int GL_ADD = 0x0104;
    public static final int GL_AUX0 = 0x0409;
    public static final int GL_AUX1 = 0x040A;
    public static final int GL_AUX2 = 0x040B;
    public static final int GL_AUX3 = 0x040C;
    public static final int GL_2D = 0x0600;
    public static final int GL_3D = 0x0601;
    public static final int GL_3D_COLOR = 0x0602;
    public static final int GL_3D_COLOR_TEXTURE = 0x0603;
    public static final int GL_4D_COLOR_TEXTURE = 0x0604;
    public static final int GL_PASS_THROUGH_TOKEN = 0x0700;
    public static final int GL_POINT_TOKEN = 0x0701;
    public static final int GL_LINE_TOKEN = 0x0702;
    public static final int GL_POLYGON_TOKEN = 0x0703;
    public static final int GL_BITMAP_TOKEN = 0x0704;
    public static final int GL_DRAW_PIXEL_TOKEN = 0x0705;
    public static final int GL_COPY_PIXEL_TOKEN = 0x0706;
    public static final int GL_LINE_RESET_TOKEN = 0x0707;
    public static final int GL_EXP = 0x0800;
    public static final int GL_EXP2 = 0x0801;
    public static final int GL_COEFF = 0x0A00;
    public static final int GL_ORDER = 0x0A01;
    public static final int GL_DOMAIN = 0x0A02;
    public static final int GL_PIXEL_MAP_I_TO_I = 0x0C70;
    public static final int GL_PIXEL_MAP_S_TO_S = 0x0C71;
    public static final int GL_PIXEL_MAP_I_TO_R = 0x0C72;
    public static final int GL_PIXEL_MAP_I_TO_G = 0x0C73;
    public static final int GL_PIXEL_MAP_I_TO_B = 0x0C74;
    public static final int GL_PIXEL_MAP_I_TO_A = 0x0C75;
    public static final int GL_PIXEL_MAP_R_TO_R = 0x0C76;
    public static final int GL_PIXEL_MAP_G_TO_G = 0x0C77;
    public static final int GL_PIXEL_MAP_B_TO_B = 0x0C78;
    public static final int GL_PIXEL_MAP_A_TO_A = 0x0C79;
    public static final int GL_VERTEX_ARRAY_POINTER = 0x808E;
    public static final int GL_NORMAL_ARRAY_POINTER = 0x808F;
    public static final int GL_COLOR_ARRAY_POINTER = 0x8090;
    public static final int GL_INDEX_ARRAY_POINTER = 0x8091;
    public static final int GL_TEXTURE_COORD_ARRAY_POINTER = 0x8092;
    public static final int GL_EDGE_FLAG_ARRAY_POINTER = 0x8093;
    public static final int GL_FEEDBACK_BUFFER_POINTER = 0x0DF0;
    public static final int GL_SELECTION_BUFFER_POINTER = 0x0DF3;
    public static final int GL_CURRENT_COLOR = 0x0B00;
    public static final int GL_CURRENT_INDEX = 0x0B01;
    public static final int GL_CURRENT_NORMAL = 0x0B02;
    public static final int GL_CURRENT_TEXTURE_COORDS = 0x0B03;
    public static final int GL_CURRENT_RASTER_COLOR = 0x0B04;
    public static final int GL_CURRENT_RASTER_INDEX = 0x0B05;
    public static final int GL_CURRENT_RASTER_TEXTURE_COORDS = 0x0B06;
    public static final int GL_CURRENT_RASTER_POSITION = 0x0B07;
    public static final int GL_CURRENT_RASTER_POSITION_VALID = 0x0B08;
    public static final int GL_CURRENT_RASTER_DISTANCE = 0x0B09;
    public static final int GL_POINT_SMOOTH = 0x0B10;
    public static final int GL_LINE_STIPPLE = 0x0B24;
    public static final int GL_LINE_STIPPLE_PATTERN = 0x0B25;
    public static final int GL_LINE_STIPPLE_REPEAT = 0x0B26;
    public static final int GL_LIST_MODE = 0x0B30;
    public static final int GL_MAX_LIST_NESTING = 0x0B31;
    public static final int GL_LIST_BASE = 0x0B32;
    public static final int GL_LIST_INDEX = 0x0B33;
    public static final int GL_POLYGON_STIPPLE = 0x0B42;
    public static final int GL_EDGE_FLAG = 0x0B43;
    public static final int GL_LIGHTING = 0x0B50;
    public static final int GL_LIGHT_MODEL_LOCAL_VIEWER = 0x0B51;
    public static final int GL_LIGHT_MODEL_TWO_SIDE = 0x0B52;
    public static final int GL_LIGHT_MODEL_AMBIENT = 0x0B53;
    public static final int GL_SHADE_MODEL = 0x0B54;
    public static final int GL_COLOR_MATERIAL_FACE = 0x0B55;
    public static final int GL_COLOR_MATERIAL_PARAMETER = 0x0B56;
    public static final int GL_COLOR_MATERIAL = 0x0B57;
    public static final int GL_FOG = 0x0B60;
    public static final int GL_FOG_INDEX = 0x0B61;
    public static final int GL_FOG_DENSITY = 0x0B62;
    public static final int GL_FOG_START = 0x0B63;
    public static final int GL_FOG_END = 0x0B64;
    public static final int GL_FOG_MODE = 0x0B65;
    public static final int GL_FOG_COLOR = 0x0B66;
    public static final int GL_ACCUM_CLEAR_VALUE = 0x0B80;
    public static final int GL_MATRIX_MODE = 0x0BA0;
    public static final int GL_NORMALIZE = 0x0BA1;
    public static final int GL_MODELVIEW_STACK_DEPTH = 0x0BA3;
    public static final int GL_PROJECTION_STACK_DEPTH = 0x0BA4;
    public static final int GL_TEXTURE_STACK_DEPTH = 0x0BA5;
    public static final int GL_MODELVIEW_MATRIX = 0x0BA6;
    public static final int GL_PROJECTION_MATRIX = 0x0BA7;
    public static final int GL_TEXTURE_MATRIX = 0x0BA8;
    public static final int GL_ATTRIB_STACK_DEPTH = 0x0BB0;
    public static final int GL_CLIENT_ATTRIB_STACK_DEPTH = 0x0BB1;
    public static final int GL_ALPHA_TEST = 0x0BC0;
    public static final int GL_ALPHA_TEST_FUNC = 0x0BC1;
    public static final int GL_ALPHA_TEST_REF = 0x0BC2;
    public static final int GL_INDEX_LOGIC_OP = 0x0BF1;
    public static final int GL_LOGIC_OP = 0x0BF1;
    public static final int GL_AUX_BUFFERS = 0x0C00;
    public static final int GL_INDEX_CLEAR_VALUE = 0x0C20;
    public static final int GL_INDEX_WRITEMASK = 0x0C21;
    public static final int GL_INDEX_MODE = 0x0C30;
    public static final int GL_RGBA_MODE = 0x0C31;
    public static final int GL_RENDER_MODE = 0x0C40;
    public static final int GL_PERSPECTIVE_CORRECTION_HINT = 0x0C50;
    public static final int GL_POINT_SMOOTH_HINT = 0x0C51;
    public static final int GL_FOG_HINT = 0x0C54;
    public static final int GL_TEXTURE_GEN_S = 0x0C60;
    public static final int GL_TEXTURE_GEN_T = 0x0C61;
    public static final int GL_TEXTURE_GEN_R = 0x0C62;
    public static final int GL_TEXTURE_GEN_Q = 0x0C63;
    public static final int GL_PIXEL_MAP_I_TO_I_SIZE = 0x0CB0;
    public static final int GL_PIXEL_MAP_S_TO_S_SIZE = 0x0CB1;
    public static final int GL_PIXEL_MAP_I_TO_R_SIZE = 0x0CB2;
    public static final int GL_PIXEL_MAP_I_TO_G_SIZE = 0x0CB3;
    public static final int GL_PIXEL_MAP_I_TO_B_SIZE = 0x0CB4;
    public static final int GL_PIXEL_MAP_I_TO_A_SIZE = 0x0CB5;
    public static final int GL_PIXEL_MAP_R_TO_R_SIZE = 0x0CB6;
    public static final int GL_PIXEL_MAP_G_TO_G_SIZE = 0x0CB7;
    public static final int GL_PIXEL_MAP_B_TO_B_SIZE = 0x0CB8;
    public static final int GL_PIXEL_MAP_A_TO_A_SIZE = 0x0CB9;
    public static final int GL_MAP_COLOR = 0x0D10;
    public static final int GL_MAP_STENCIL = 0x0D11;
    public static final int GL_INDEX_SHIFT = 0x0D12;
    public static final int GL_INDEX_OFFSET = 0x0D13;
    public static final int GL_RED_SCALE = 0x0D14;
    public static final int GL_RED_BIAS = 0x0D15;
    public static final int GL_ZOOM_X = 0x0D16;
    public static final int GL_ZOOM_Y = 0x0D17;
    public static final int GL_GREEN_SCALE = 0x0D18;
    public static final int GL_GREEN_BIAS = 0x0D19;
    public static final int GL_BLUE_SCALE = 0x0D1A;
    public static final int GL_BLUE_BIAS = 0x0D1B;
    public static final int GL_ALPHA_SCALE = 0x0D1C;
    public static final int GL_ALPHA_BIAS = 0x0D1D;
    public static final int GL_DEPTH_SCALE = 0x0D1E;
    public static final int GL_DEPTH_BIAS = 0x0D1F;
    public static final int GL_MAX_EVAL_ORDER = 0x0D30;
    public static final int GL_MAX_LIGHTS = 0x0D31;
    public static final int GL_MAX_CLIP_PLANES = 0x0D32;
    public static final int GL_MAX_PIXEL_MAP_TABLE = 0x0D34;
    public static final int GL_MAX_ATTRIB_STACK_DEPTH = 0x0D35;
    public static final int GL_MAX_MODELVIEW_STACK_DEPTH = 0x0D36;
    public static final int GL_MAX_NAME_STACK_DEPTH = 0x0D37;
    public static final int GL_MAX_PROJECTION_STACK_DEPTH = 0x0D38;
    public static final int GL_MAX_TEXTURE_STACK_DEPTH = 0x0D39;
    public static final int GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = 0x0D3B;
    public static final int GL_INDEX_BITS = 0x0D51;
    public static final int GL_RED_BITS = 0x0D52;
    public static final int GL_GREEN_BITS = 0x0D53;
    public static final int GL_BLUE_BITS = 0x0D54;
    public static final int GL_ALPHA_BITS = 0x0D55;
    public static final int GL_DEPTH_BITS = 0x0D56;
    public static final int GL_STENCIL_BITS = 0x0D57;
    public static final int GL_ACCUM_RED_BITS = 0x0D58;
    public static final int GL_ACCUM_GREEN_BITS = 0x0D59;
    public static final int GL_ACCUM_BLUE_BITS = 0x0D5A;
    public static final int GL_ACCUM_ALPHA_BITS = 0x0D5B;
    public static final int GL_NAME_STACK_DEPTH = 0x0D70;
    public static final int GL_AUTO_NORMAL = 0x0D80;
    public static final int GL_MAP1_COLOR_4 = 0x0D90;
    public static final int GL_MAP1_INDEX = 0x0D91;
    public static final int GL_MAP1_NORMAL = 0x0D92;
    public static final int GL_MAP1_TEXTURE_COORD_1 = 0x0D93;
    public static final int GL_MAP1_TEXTURE_COORD_2 = 0x0D94;
    public static final int GL_MAP1_TEXTURE_COORD_3 = 0x0D95;
    public static final int GL_MAP1_TEXTURE_COORD_4 = 0x0D96;
    public static final int GL_MAP1_VERTEX_3 = 0x0D97;
    public static final int GL_MAP1_VERTEX_4 = 0x0D98;
    public static final int GL_MAP2_COLOR_4 = 0x0DB0;
    public static final int GL_MAP2_INDEX = 0x0DB1;
    public static final int GL_MAP2_NORMAL = 0x0DB2;
    public static final int GL_MAP2_TEXTURE_COORD_1 = 0x0DB3;
    public static final int GL_MAP2_TEXTURE_COORD_2 = 0x0DB4;
    public static final int GL_MAP2_TEXTURE_COORD_3 = 0x0DB5;
    public static final int GL_MAP2_TEXTURE_COORD_4 = 0x0DB6;
    public static final int GL_MAP2_VERTEX_3 = 0x0DB7;
    public static final int GL_MAP2_VERTEX_4 = 0x0DB8;
    public static final int GL_MAP1_GRID_DOMAIN = 0x0DD0;
    public static final int GL_MAP1_GRID_SEGMENTS = 0x0DD1;
    public static final int GL_MAP2_GRID_DOMAIN = 0x0DD2;
    public static final int GL_MAP2_GRID_SEGMENTS = 0x0DD3;
    public static final int GL_FEEDBACK_BUFFER_SIZE = 0x0DF1;
    public static final int GL_FEEDBACK_BUFFER_TYPE = 0x0DF2;
    public static final int GL_SELECTION_BUFFER_SIZE = 0x0DF4;
    public static final int GL_VERTEX_ARRAY = 0x8074;
    public static final int GL_NORMAL_ARRAY = 0x8075;
    public static final int GL_COLOR_ARRAY = 0x8076;
    public static final int GL_INDEX_ARRAY = 0x8077;
    public static final int GL_TEXTURE_COORD_ARRAY = 0x8078;
    public static final int GL_EDGE_FLAG_ARRAY = 0x8079;
    public static final int GL_VERTEX_ARRAY_SIZE = 0x807A;
    public static final int GL_VERTEX_ARRAY_TYPE = 0x807B;
    public static final int GL_VERTEX_ARRAY_STRIDE = 0x807C;
    public static final int GL_NORMAL_ARRAY_TYPE = 0x807E;
    public static final int GL_NORMAL_ARRAY_STRIDE = 0x807F;
    public static final int GL_COLOR_ARRAY_SIZE = 0x8081;
    public static final int GL_COLOR_ARRAY_TYPE = 0x8082;
    public static final int GL_COLOR_ARRAY_STRIDE = 0x8083;
    public static final int GL_INDEX_ARRAY_TYPE = 0x8085;
    public static final int GL_INDEX_ARRAY_STRIDE = 0x8086;
    public static final int GL_TEXTURE_COORD_ARRAY_SIZE = 0x8088;
    public static final int GL_TEXTURE_COORD_ARRAY_TYPE = 0x8089;
    public static final int GL_TEXTURE_COORD_ARRAY_STRIDE = 0x808A;
    public static final int GL_EDGE_FLAG_ARRAY_STRIDE = 0x808C;
    public static final int GL_TEXTURE_COMPONENTS = 0x1003;
    public static final int GL_TEXTURE_BORDER = 0x1005;
    public static final int GL_TEXTURE_LUMINANCE_SIZE = 0x8060;
    public static final int GL_TEXTURE_INTENSITY_SIZE = 0x8061;
    public static final int GL_TEXTURE_PRIORITY = 0x8066;
    public static final int GL_TEXTURE_RESIDENT = 0x8067;
    public static final int GL_AMBIENT = 0x1200;
    public static final int GL_DIFFUSE = 0x1201;
    public static final int GL_SPECULAR = 0x1202;
    public static final int GL_POSITION = 0x1203;
    public static final int GL_SPOT_DIRECTION = 0x1204;
    public static final int GL_SPOT_EXPONENT = 0x1205;
    public static final int GL_SPOT_CUTOFF = 0x1206;
    public static final int GL_CONSTANT_ATTENUATION = 0x1207;
    public static final int GL_LINEAR_ATTENUATION = 0x1208;
    public static final int GL_QUADRATIC_ATTENUATION = 0x1209;
    public static final int GL_COMPILE = 0x1300;
    public static final int GL_COMPILE_AND_EXECUTE = 0x1301;
    public static final int GL_2_BYTES = 0x1407;
    public static final int GL_3_BYTES = 0x1408;
    public static final int GL_4_BYTES = 0x1409;
    public static final int GL_EMISSION = 0x1600;
    public static final int GL_SHININESS = 0x1601;
    public static final int GL_AMBIENT_AND_DIFFUSE = 0x1602;
    public static final int GL_COLOR_INDEXES = 0x1603;
    public static final int GL_MODELVIEW = 0x1700;
    public static final int GL_PROJECTION = 0x1701;
    public static final int GL_COLOR_INDEX = 0x1900;
    public static final int GL_LUMINANCE = 0x1909;
    public static final int GL_LUMINANCE_ALPHA = 0x190A;
    public static final int GL_BITMAP = 0x1A00;
    public static final int GL_RENDER = 0x1C00;
    public static final int GL_FEEDBACK = 0x1C01;
    public static final int GL_SELECT = 0x1C02;
    public static final int GL_FLAT = 0x1D00;
    public static final int GL_SMOOTH = 0x1D01;
    public static final int GL_S = 0x2000;
    public static final int GL_T = 0x2001;
    public static final int GL_R = 0x2002;
    public static final int GL_Q = 0x2003;
    public static final int GL_MODULATE = 0x2100;
    public static final int GL_DECAL = 0x2101;
    public static final int GL_TEXTURE_ENV_MODE = 0x2200;
    public static final int GL_TEXTURE_ENV_COLOR = 0x2201;
    public static final int GL_TEXTURE_ENV = 0x2300;
    public static final int GL_EYE_LINEAR = 0x2400;
    public static final int GL_OBJECT_LINEAR = 0x2401;
    public static final int GL_SPHERE_MAP = 0x2402;
    public static final int GL_TEXTURE_GEN_MODE = 0x2500;
    public static final int GL_OBJECT_PLANE = 0x2501;
    public static final int GL_EYE_PLANE = 0x2502;
    public static final int GL_CLAMP = 0x2900;
    public static final int GL_ALPHA4 = 0x803B;
    public static final int GL_ALPHA8 = 0x803C;
    public static final int GL_ALPHA12 = 0x803D;
    public static final int GL_ALPHA16 = 0x803E;
    public static final int GL_LUMINANCE4 = 0x803F;
    public static final int GL_LUMINANCE8 = 0x8040;
    public static final int GL_LUMINANCE12 = 0x8041;
    public static final int GL_LUMINANCE16 = 0x8042;
    public static final int GL_LUMINANCE4_ALPHA4 = 0x8043;
    public static final int GL_LUMINANCE6_ALPHA2 = 0x8044;
    public static final int GL_LUMINANCE8_ALPHA8 = 0x8045;
    public static final int GL_LUMINANCE12_ALPHA4 = 0x8046;
    public static final int GL_LUMINANCE12_ALPHA12 = 0x8047;
    public static final int GL_LUMINANCE16_ALPHA16 = 0x8048;
    public static final int GL_INTENSITY = 0x8049;
    public static final int GL_INTENSITY4 = 0x804A;
    public static final int GL_INTENSITY8 = 0x804B;
    public static final int GL_INTENSITY12 = 0x804C;
    public static final int GL_INTENSITY16 = 0x804D;
    public static final int GL_V2F = 0x2A20;
    public static final int GL_V3F = 0x2A21;
    public static final int GL_C4UB_V2F = 0x2A22;
    public static final int GL_C4UB_V3F = 0x2A23;
    public static final int GL_C3F_V3F = 0x2A24;
    public static final int GL_N3F_V3F = 0x2A25;
    public static final int GL_C4F_N3F_V3F = 0x2A26;
    public static final int GL_T2F_V3F = 0x2A27;
    public static final int GL_T4F_V4F = 0x2A28;
    public static final int GL_T2F_C4UB_V3F = 0x2A29;
    public static final int GL_T2F_C3F_V3F = 0x2A2A;
    public static final int GL_T2F_N3F_V3F = 0x2A2B;
    public static final int GL_T2F_C4F_N3F_V3F = 0x2A2C;
    public static final int GL_T4F_C4F_N3F_V4F = 0x2A2D;
    public static final int GL_CLIP_PLANE0 = 0x3000;
    public static final int GL_CLIP_PLANE1 = 0x3001;
    public static final int GL_CLIP_PLANE2 = 0x3002;
    public static final int GL_CLIP_PLANE3 = 0x3003;
    public static final int GL_CLIP_PLANE4 = 0x3004;
    public static final int GL_CLIP_PLANE5 = 0x3005;
    public static final int GL_LIGHT0 = 0x4000;
    public static final int GL_LIGHT1 = 0x4001;
    public static final int GL_LIGHT2 = 0x4002;
    public static final int GL_LIGHT3 = 0x4003;
    public static final int GL_LIGHT4 = 0x4004;
    public static final int GL_LIGHT5 = 0x4005;
    public static final int GL_LIGHT6 = 0x4006;
    public static final int GL_LIGHT7 = 0x4007;
    public static final int GL_UNSIGNED_BYTE_3_3_2 = 0x8032;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 0x8033;
    public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 0x8034;
    public static final int GL_UNSIGNED_INT_8_8_8_8 = 0x8035;
    public static final int GL_UNSIGNED_INT_10_10_10_2 = 0x8036;
    public static final int GL_TEXTURE_BINDING_3D = 0x806A;
    public static final int GL_PACK_SKIP_IMAGES = 0x806B;
    public static final int GL_PACK_IMAGE_HEIGHT = 0x806C;
    public static final int GL_UNPACK_SKIP_IMAGES = 0x806D;
    public static final int GL_UNPACK_IMAGE_HEIGHT = 0x806E;
    public static final int GL_TEXTURE_3D = 0x806F;
    public static final int GL_PROXY_TEXTURE_3D = 0x8070;
    public static final int GL_TEXTURE_DEPTH = 0x8071;
    public static final int GL_TEXTURE_WRAP_R = 0x8072;
    public static final int GL_MAX_3D_TEXTURE_SIZE = 0x8073;
    public static final int GL_UNSIGNED_BYTE_2_3_3_REV = 0x8362;
    public static final int GL_UNSIGNED_SHORT_5_6_5 = 0x8363;
    public static final int GL_UNSIGNED_SHORT_5_6_5_REV = 0x8364;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4_REV = 0x8365;
    public static final int GL_UNSIGNED_SHORT_1_5_5_5_REV = 0x8366;
    public static final int GL_UNSIGNED_INT_8_8_8_8_REV = 0x8367;
    public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;
    public static final int GL_BGR = 0x80E0;
    public static final int GL_BGRA = 0x80E1;
    public static final int GL_MAX_ELEMENTS_VERTICES = 0x80E8;
    public static final int GL_MAX_ELEMENTS_INDICES = 0x80E9;
    public static final int GL_CLAMP_TO_EDGE = 0x812F;
    public static final int GL_TEXTURE_MIN_LOD = 0x813A;
    public static final int GL_TEXTURE_MAX_LOD = 0x813B;
    public static final int GL_TEXTURE_BASE_LEVEL = 0x813C;
    public static final int GL_TEXTURE_MAX_LEVEL = 0x813D;
    public static final int GL_SMOOTH_POINT_SIZE_RANGE = 0x0B12;
    public static final int GL_SMOOTH_POINT_SIZE_GRANULARITY = 0x0B13;
    public static final int GL_SMOOTH_LINE_WIDTH_RANGE = 0x0B22;
    public static final int GL_SMOOTH_LINE_WIDTH_GRANULARITY = 0x0B23;
    public static final int GL_ALIASED_LINE_WIDTH_RANGE = 0x846E;
    public static final int GL_RESCALE_NORMAL = 0x803A;
    public static final int GL_LIGHT_MODEL_COLOR_CONTROL = 0x81F8;
    public static final int GL_SINGLE_COLOR = 0x81F9;
    public static final int GL_SEPARATE_SPECULAR_COLOR = 0x81FA;
    public static final int GL_ALIASED_POINT_SIZE_RANGE = 0x846D;
    public static final int GL_TEXTURE0 = 0x84C0;
    public static final int GL_TEXTURE1 = 0x84C1;
    public static final int GL_TEXTURE2 = 0x84C2;
    public static final int GL_TEXTURE3 = 0x84C3;
    public static final int GL_TEXTURE4 = 0x84C4;
    public static final int GL_TEXTURE5 = 0x84C5;
    public static final int GL_TEXTURE6 = 0x84C6;
    public static final int GL_TEXTURE7 = 0x84C7;
    public static final int GL_TEXTURE8 = 0x84C8;
    public static final int GL_TEXTURE9 = 0x84C9;
    public static final int GL_TEXTURE10 = 0x84CA;
    public static final int GL_TEXTURE11 = 0x84CB;
    public static final int GL_TEXTURE12 = 0x84CC;
    public static final int GL_TEXTURE13 = 0x84CD;
    public static final int GL_TEXTURE14 = 0x84CE;
    public static final int GL_TEXTURE15 = 0x84CF;
    public static final int GL_TEXTURE16 = 0x84D0;
    public static final int GL_TEXTURE17 = 0x84D1;
    public static final int GL_TEXTURE18 = 0x84D2;
    public static final int GL_TEXTURE19 = 0x84D3;
    public static final int GL_TEXTURE20 = 0x84D4;
    public static final int GL_TEXTURE21 = 0x84D5;
    public static final int GL_TEXTURE22 = 0x84D6;
    public static final int GL_TEXTURE23 = 0x84D7;
    public static final int GL_TEXTURE24 = 0x84D8;
    public static final int GL_TEXTURE25 = 0x84D9;
    public static final int GL_TEXTURE26 = 0x84DA;
    public static final int GL_TEXTURE27 = 0x84DB;
    public static final int GL_TEXTURE28 = 0x84DC;
    public static final int GL_TEXTURE29 = 0x84DD;
    public static final int GL_TEXTURE30 = 0x84DE;
    public static final int GL_TEXTURE31 = 0x84DF;
    public static final int GL_ACTIVE_TEXTURE = 0x84E0;
    public static final int GL_MULTISAMPLE = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE = 0x809F;
    public static final int GL_SAMPLE_COVERAGE = 0x80A0;
    public static final int GL_SAMPLE_BUFFERS = 0x80A8;
    public static final int GL_SAMPLES = 0x80A9;
    public static final int GL_SAMPLE_COVERAGE_VALUE = 0x80AA;
    public static final int GL_SAMPLE_COVERAGE_INVERT = 0x80AB;
    public static final int GL_TEXTURE_CUBE_MAP = 0x8513;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;
    public static final int GL_PROXY_TEXTURE_CUBE_MAP = 0x851B;
    public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;
    public static final int GL_COMPRESSED_RGB = 0x84ED;
    public static final int GL_COMPRESSED_RGBA = 0x84EE;
    public static final int GL_TEXTURE_COMPRESSION_HINT = 0x84EF;
    public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0;
    public static final int GL_TEXTURE_COMPRESSED = 0x86A1;
    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;
    public static final int GL_COMPRESSED_TEXTURE_FORMATS = 0x86A3;
    public static final int GL_CLAMP_TO_BORDER = 0x812D;
    public static final int GL_CLIENT_ACTIVE_TEXTURE = 0x84E1;
    public static final int GL_MAX_TEXTURE_UNITS = 0x84E2;
    public static final int GL_TRANSPOSE_MODELVIEW_MATRIX = 0x84E3;
    public static final int GL_TRANSPOSE_PROJECTION_MATRIX = 0x84E4;
    public static final int GL_TRANSPOSE_TEXTURE_MATRIX = 0x84E5;
    public static final int GL_TRANSPOSE_COLOR_MATRIX = 0x84E6;
    public static final int GL_MULTISAMPLE_BIT = 0x20000000;
    public static final int GL_NORMAL_MAP = 0x8511;
    public static final int GL_REFLECTION_MAP = 0x8512;
    public static final int GL_COMPRESSED_ALPHA = 0x84E9;
    public static final int GL_COMPRESSED_LUMINANCE = 0x84EA;
    public static final int GL_COMPRESSED_LUMINANCE_ALPHA = 0x84EB;
    public static final int GL_COMPRESSED_INTENSITY = 0x84EC;
    public static final int GL_COMBINE = 0x8570;
    public static final int GL_COMBINE_RGB = 0x8571;
    public static final int GL_COMBINE_ALPHA = 0x8572;
    public static final int GL_SOURCE0_RGB = 0x8580;
    public static final int GL_SOURCE1_RGB = 0x8581;
    public static final int GL_SOURCE2_RGB = 0x8582;
    public static final int GL_SOURCE0_ALPHA = 0x8588;
    public static final int GL_SOURCE1_ALPHA = 0x8589;
    public static final int GL_SOURCE2_ALPHA = 0x858A;
    public static final int GL_OPERAND0_RGB = 0x8590;
    public static final int GL_OPERAND1_RGB = 0x8591;
    public static final int GL_OPERAND2_RGB = 0x8592;
    public static final int GL_OPERAND0_ALPHA = 0x8598;
    public static final int GL_OPERAND1_ALPHA = 0x8599;
    public static final int GL_OPERAND2_ALPHA = 0x859A;
    public static final int GL_RGB_SCALE = 0x8573;
    public static final int GL_ADD_SIGNED = 0x8574;
    public static final int GL_INTERPOLATE = 0x8575;
    public static final int GL_SUBTRACT = 0x84E7;
    public static final int GL_CONSTANT = 0x8576;
    public static final int GL_PRIMARY_COLOR = 0x8577;
    public static final int GL_PREVIOUS = 0x8578;
    public static final int GL_DOT3_RGB = 0x86AE;
    public static final int GL_DOT3_RGBA = 0x86AF;
    public static final int GL_BLEND_DST_RGB = 0x80C8;
    public static final int GL_BLEND_SRC_RGB = 0x80C9;
    public static final int GL_BLEND_DST_ALPHA = 0x80CA;
    public static final int GL_BLEND_SRC_ALPHA = 0x80CB;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE = 0x8128;
    public static final int GL_DEPTH_COMPONENT16 = 0x81A5;
    public static final int GL_DEPTH_COMPONENT24 = 0x81A6;
    public static final int GL_DEPTH_COMPONENT32 = 0x81A7;
    public static final int GL_MIRRORED_REPEAT = 0x8370;
    public static final int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;
    public static final int GL_TEXTURE_LOD_BIAS = 0x8501;
    public static final int GL_INCR_WRAP = 0x8507;
    public static final int GL_DECR_WRAP = 0x8508;
    public static final int GL_TEXTURE_DEPTH_SIZE = 0x884A;
    public static final int GL_TEXTURE_COMPARE_MODE = 0x884C;
    public static final int GL_TEXTURE_COMPARE_FUNC = 0x884D;
    public static final int GL_POINT_SIZE_MIN = 0x8126;
    public static final int GL_POINT_SIZE_MAX = 0x8127;
    public static final int GL_POINT_DISTANCE_ATTENUATION = 0x8129;
    public static final int GL_GENERATE_MIPMAP = 0x8191;
    public static final int GL_GENERATE_MIPMAP_HINT = 0x8192;
    public static final int GL_FOG_COORDINATE_SOURCE = 0x8450;
    public static final int GL_FOG_COORDINATE = 0x8451;
    public static final int GL_FRAGMENT_DEPTH = 0x8452;
    public static final int GL_CURRENT_FOG_COORDINATE = 0x8453;
    public static final int GL_FOG_COORDINATE_ARRAY_TYPE = 0x8454;
    public static final int GL_FOG_COORDINATE_ARRAY_STRIDE = 0x8455;
    public static final int GL_FOG_COORDINATE_ARRAY_POINTER = 0x8456;
    public static final int GL_FOG_COORDINATE_ARRAY = 0x8457;
    public static final int GL_COLOR_SUM = 0x8458;
    public static final int GL_CURRENT_SECONDARY_COLOR = 0x8459;
    public static final int GL_SECONDARY_COLOR_ARRAY_SIZE = 0x845A;
    public static final int GL_SECONDARY_COLOR_ARRAY_TYPE = 0x845B;
    public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE = 0x845C;
    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER = 0x845D;
    public static final int GL_SECONDARY_COLOR_ARRAY = 0x845E;
    public static final int GL_TEXTURE_FILTER_CONTROL = 0x8500;
    public static final int GL_DEPTH_TEXTURE_MODE = 0x884B;
    public static final int GL_COMPARE_R_TO_TEXTURE = 0x884E;
    public static final int GL_FUNC_ADD = 0x8006;
    public static final int GL_FUNC_SUBTRACT = 0x800A;
    public static final int GL_FUNC_REVERSE_SUBTRACT = 0x800B;
    public static final int GL_MIN = 0x8007;
    public static final int GL_MAX = 0x8008;
    public static final int GL_CONSTANT_COLOR = 0x8001;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR = 0x8002;
    public static final int GL_CONSTANT_ALPHA = 0x8003;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;
    public static final int GL_BUFFER_SIZE = 0x8764;
    public static final int GL_BUFFER_USAGE = 0x8765;
    public static final int GL_QUERY_COUNTER_BITS = 0x8864;
    public static final int GL_CURRENT_QUERY = 0x8865;
    public static final int GL_QUERY_RESULT = 0x8866;
    public static final int GL_QUERY_RESULT_AVAILABLE = 0x8867;
    public static final int GL_ARRAY_BUFFER = 0x8892;
    public static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;
    public static final int GL_ARRAY_BUFFER_BINDING = 0x8894;
    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;
    public static final int GL_READ_ONLY = 0x88B8;
    public static final int GL_WRITE_ONLY = 0x88B9;
    public static final int GL_READ_WRITE = 0x88BA;
    public static final int GL_BUFFER_ACCESS = 0x88BB;
    public static final int GL_BUFFER_MAPPED = 0x88BC;
    public static final int GL_BUFFER_MAP_POINTER = 0x88BD;
    public static final int GL_STREAM_DRAW = 0x88E0;
    public static final int GL_STREAM_READ = 0x88E1;
    public static final int GL_STREAM_COPY = 0x88E2;
    public static final int GL_STATIC_DRAW = 0x88E4;
    public static final int GL_STATIC_READ = 0x88E5;
    public static final int GL_STATIC_COPY = 0x88E6;
    public static final int GL_DYNAMIC_DRAW = 0x88E8;
    public static final int GL_DYNAMIC_READ = 0x88E9;
    public static final int GL_DYNAMIC_COPY = 0x88EA;
    public static final int GL_SAMPLES_PASSED = 0x8914;
    public static final int GL_SRC1_ALPHA = 0x8589;
    public static final int GL_VERTEX_ARRAY_BUFFER_BINDING = 0x8896;
    public static final int GL_NORMAL_ARRAY_BUFFER_BINDING = 0x8897;
    public static final int GL_COLOR_ARRAY_BUFFER_BINDING = 0x8898;
    public static final int GL_INDEX_ARRAY_BUFFER_BINDING = 0x8899;
    public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING = 0x889A;
    public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING = 0x889B;
    public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING = 0x889C;
    public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING = 0x889D;
    public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING = 0x889E;
    public static final int GL_FOG_COORD_SRC = 0x8450;
    public static final int GL_FOG_COORD = 0x8451;
    public static final int GL_CURRENT_FOG_COORD = 0x8453;
    public static final int GL_FOG_COORD_ARRAY_TYPE = 0x8454;
    public static final int GL_FOG_COORD_ARRAY_STRIDE = 0x8455;
    public static final int GL_FOG_COORD_ARRAY_POINTER = 0x8456;
    public static final int GL_FOG_COORD_ARRAY = 0x8457;
    public static final int GL_FOG_COORD_ARRAY_BUFFER_BINDING = 0x889D;
    public static final int GL_SRC0_RGB = 0x8580;
    public static final int GL_SRC1_RGB = 0x8581;
    public static final int GL_SRC2_RGB = 0x8582;
    public static final int GL_SRC0_ALPHA = 0x8588;
    public static final int GL_SRC2_ALPHA = 0x858A;
    public static final int GL_BLEND_EQUATION_RGB = 0x8009;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;
    public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;
    public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;
    public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;
    public static final int GL_CURRENT_VERTEX_ATTRIB = 0x8626;
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642;
    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;
    public static final int GL_STENCIL_BACK_FUNC = 0x8800;
    public static final int GL_STENCIL_BACK_FAIL = 0x8801;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;
    public static final int GL_MAX_DRAW_BUFFERS = 0x8824;
    public static final int GL_DRAW_BUFFER0 = 0x8825;
    public static final int GL_DRAW_BUFFER1 = 0x8826;
    public static final int GL_DRAW_BUFFER2 = 0x8827;
    public static final int GL_DRAW_BUFFER3 = 0x8828;
    public static final int GL_DRAW_BUFFER4 = 0x8829;
    public static final int GL_DRAW_BUFFER5 = 0x882A;
    public static final int GL_DRAW_BUFFER6 = 0x882B;
    public static final int GL_DRAW_BUFFER7 = 0x882C;
    public static final int GL_DRAW_BUFFER8 = 0x882D;
    public static final int GL_DRAW_BUFFER9 = 0x882E;
    public static final int GL_DRAW_BUFFER10 = 0x882F;
    public static final int GL_DRAW_BUFFER11 = 0x8830;
    public static final int GL_DRAW_BUFFER12 = 0x8831;
    public static final int GL_DRAW_BUFFER13 = 0x8832;
    public static final int GL_DRAW_BUFFER14 = 0x8833;
    public static final int GL_DRAW_BUFFER15 = 0x8834;
    public static final int GL_BLEND_EQUATION_ALPHA = 0x883D;
    public static final int GL_MAX_VERTEX_ATTRIBS = 0x8869;
    public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;
    public static final int GL_FRAGMENT_SHADER = 0x8B30;
    public static final int GL_VERTEX_SHADER = 0x8B31;
    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;
    public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A;
    public static final int GL_MAX_VARYING_FLOATS = 0x8B4B;
    public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;
    public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;
    public static final int GL_SHADER_TYPE = 0x8B4F;
    public static final int GL_FLOAT_VEC2 = 0x8B50;
    public static final int GL_FLOAT_VEC3 = 0x8B51;
    public static final int GL_FLOAT_VEC4 = 0x8B52;
    public static final int GL_INT_VEC2 = 0x8B53;
    public static final int GL_INT_VEC3 = 0x8B54;
    public static final int GL_INT_VEC4 = 0x8B55;
    public static final int GL_BOOL = 0x8B56;
    public static final int GL_BOOL_VEC2 = 0x8B57;
    public static final int GL_BOOL_VEC3 = 0x8B58;
    public static final int GL_BOOL_VEC4 = 0x8B59;
    public static final int GL_FLOAT_MAT2 = 0x8B5A;
    public static final int GL_FLOAT_MAT3 = 0x8B5B;
    public static final int GL_FLOAT_MAT4 = 0x8B5C;
    public static final int GL_SAMPLER_1D = 0x8B5D;
    public static final int GL_SAMPLER_2D = 0x8B5E;
    public static final int GL_SAMPLER_3D = 0x8B5F;
    public static final int GL_SAMPLER_CUBE = 0x8B60;
    public static final int GL_SAMPLER_1D_SHADOW = 0x8B61;
    public static final int GL_SAMPLER_2D_SHADOW = 0x8B62;
    public static final int GL_DELETE_STATUS = 0x8B80;
    public static final int GL_COMPILE_STATUS = 0x8B81;
    public static final int GL_LINK_STATUS = 0x8B82;
    public static final int GL_VALIDATE_STATUS = 0x8B83;
    public static final int GL_INFO_LOG_LENGTH = 0x8B84;
    public static final int GL_ATTACHED_SHADERS = 0x8B85;
    public static final int GL_ACTIVE_UNIFORMS = 0x8B86;
    public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 0x8B87;
    public static final int GL_SHADER_SOURCE_LENGTH = 0x8B88;
    public static final int GL_ACTIVE_ATTRIBUTES = 0x8B89;
    public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A;
    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;
    public static final int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;
    public static final int GL_CURRENT_PROGRAM = 0x8B8D;
    public static final int GL_POINT_SPRITE_COORD_ORIGIN = 0x8CA0;
    public static final int GL_LOWER_LEFT = 0x8CA1;
    public static final int GL_UPPER_LEFT = 0x8CA2;
    public static final int GL_STENCIL_BACK_REF = 0x8CA3;
    public static final int GL_STENCIL_BACK_VALUE_MASK = 0x8CA4;
    public static final int GL_STENCIL_BACK_WRITEMASK = 0x8CA5;
    public static final int GL_VERTEX_PROGRAM_TWO_SIDE = 0x8643;
    public static final int GL_POINT_SPRITE = 0x8861;
    public static final int GL_COORD_REPLACE = 0x8862;
    public static final int GL_MAX_TEXTURE_COORDS = 0x8871;
    public static final int GL_PIXEL_PACK_BUFFER = 0x88EB;
    public static final int GL_PIXEL_UNPACK_BUFFER = 0x88EC;
    public static final int GL_PIXEL_PACK_BUFFER_BINDING = 0x88ED;
    public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;
    public static final int GL_FLOAT_MAT2x3 = 0x8B65;
    public static final int GL_FLOAT_MAT2x4 = 0x8B66;
    public static final int GL_FLOAT_MAT3x2 = 0x8B67;
    public static final int GL_FLOAT_MAT3x4 = 0x8B68;
    public static final int GL_FLOAT_MAT4x2 = 0x8B69;
    public static final int GL_FLOAT_MAT4x3 = 0x8B6A;
    public static final int GL_SRGB = 0x8C40;
    public static final int GL_SRGB8 = 0x8C41;
    public static final int GL_SRGB_ALPHA = 0x8C42;
    public static final int GL_SRGB8_ALPHA8 = 0x8C43;
    public static final int GL_COMPRESSED_SRGB = 0x8C48;
    public static final int GL_COMPRESSED_SRGB_ALPHA = 0x8C49;
    public static final int GL_CURRENT_RASTER_SECONDARY_COLOR = 0x845F;
    public static final int GL_SLUMINANCE_ALPHA = 0x8C44;
    public static final int GL_SLUMINANCE8_ALPHA8 = 0x8C45;
    public static final int GL_SLUMINANCE = 0x8C46;
    public static final int GL_SLUMINANCE8 = 0x8C47;
    public static final int GL_COMPRESSED_SLUMINANCE = 0x8C4A;
    public static final int GL_COMPRESSED_SLUMINANCE_ALPHA = 0x8C4B;
    public static final int GL_COMPARE_REF_TO_TEXTURE = 0x884E;
    public static final int GL_CLIP_DISTANCE0 = 0x3000;
    public static final int GL_CLIP_DISTANCE1 = 0x3001;
    public static final int GL_CLIP_DISTANCE2 = 0x3002;
    public static final int GL_CLIP_DISTANCE3 = 0x3003;
    public static final int GL_CLIP_DISTANCE4 = 0x3004;
    public static final int GL_CLIP_DISTANCE5 = 0x3005;
    public static final int GL_CLIP_DISTANCE6 = 0x3006;
    public static final int GL_CLIP_DISTANCE7 = 0x3007;
    public static final int GL_MAX_CLIP_DISTANCES = 0x0D32;
    public static final int GL_MAJOR_VERSION = 0x821B;
    public static final int GL_MINOR_VERSION = 0x821C;
    public static final int GL_NUM_EXTENSIONS = 0x821D;
    public static final int GL_CONTEXT_FLAGS = 0x821E;
    public static final int GL_COMPRESSED_RED = 0x8225;
    public static final int GL_COMPRESSED_RG = 0x8226;
    public static final int GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x00000001;
    public static final int GL_RGBA32F = 0x8814;
    public static final int GL_RGB32F = 0x8815;
    public static final int GL_RGBA16F = 0x881A;
    public static final int GL_RGB16F = 0x881B;
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;
    public static final int GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;
    public static final int GL_CLAMP_READ_COLOR = 0x891C;
    public static final int GL_FIXED_ONLY = 0x891D;
    public static final int GL_MAX_VARYING_COMPONENTS = 0x8B4B;
    public static final int GL_TEXTURE_1D_ARRAY = 0x8C18;
    public static final int GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;
    public static final int GL_TEXTURE_2D_ARRAY = 0x8C1A;
    public static final int GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;
    public static final int GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C;
    public static final int GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D;
    public static final int GL_R11F_G11F_B10F = 0x8C3A;
    public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;
    public static final int GL_RGB9_E5 = 0x8C3D;
    public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;
    public static final int GL_TEXTURE_SHARED_SIZE = 0x8C3F;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS = 0x8C83;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;
    public static final int GL_PRIMITIVES_GENERATED = 0x8C87;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;
    public static final int GL_RASTERIZER_DISCARD = 0x8C89;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;
    public static final int GL_INTERLEAVED_ATTRIBS = 0x8C8C;
    public static final int GL_SEPARATE_ATTRIBS = 0x8C8D;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;
    public static final int GL_RGBA32UI = 0x8D70;
    public static final int GL_RGB32UI = 0x8D71;
    public static final int GL_RGBA16UI = 0x8D76;
    public static final int GL_RGB16UI = 0x8D77;
    public static final int GL_RGBA8UI = 0x8D7C;
    public static final int GL_RGB8UI = 0x8D7D;
    public static final int GL_RGBA32I = 0x8D82;
    public static final int GL_RGB32I = 0x8D83;
    public static final int GL_RGBA16I = 0x8D88;
    public static final int GL_RGB16I = 0x8D89;
    public static final int GL_RGBA8I = 0x8D8E;
    public static final int GL_RGB8I = 0x8D8F;
    public static final int GL_RED_INTEGER = 0x8D94;
    public static final int GL_GREEN_INTEGER = 0x8D95;
    public static final int GL_BLUE_INTEGER = 0x8D96;
    public static final int GL_RGB_INTEGER = 0x8D98;
    public static final int GL_RGBA_INTEGER = 0x8D99;
    public static final int GL_BGR_INTEGER = 0x8D9A;
    public static final int GL_BGRA_INTEGER = 0x8D9B;
    public static final int GL_SAMPLER_1D_ARRAY = 0x8DC0;
    public static final int GL_SAMPLER_2D_ARRAY = 0x8DC1;
    public static final int GL_SAMPLER_1D_ARRAY_SHADOW = 0x8DC3;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW = 0x8DC4;
    public static final int GL_SAMPLER_CUBE_SHADOW = 0x8DC5;
    public static final int GL_UNSIGNED_INT_VEC2 = 0x8DC6;
    public static final int GL_UNSIGNED_INT_VEC3 = 0x8DC7;
    public static final int GL_UNSIGNED_INT_VEC4 = 0x8DC8;
    public static final int GL_INT_SAMPLER_1D = 0x8DC9;
    public static final int GL_INT_SAMPLER_2D = 0x8DCA;
    public static final int GL_INT_SAMPLER_3D = 0x8DCB;
    public static final int GL_INT_SAMPLER_CUBE = 0x8DCC;
    public static final int GL_INT_SAMPLER_1D_ARRAY = 0x8DCE;
    public static final int GL_INT_SAMPLER_2D_ARRAY = 0x8DCF;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D = 0x8DD1;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D = 0x8DD2;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D = 0x8DD3;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;
    public static final int GL_QUERY_WAIT = 0x8E13;
    public static final int GL_QUERY_NO_WAIT = 0x8E14;
    public static final int GL_QUERY_BY_REGION_WAIT = 0x8E15;
    public static final int GL_QUERY_BY_REGION_NO_WAIT = 0x8E16;
    public static final int GL_BUFFER_ACCESS_FLAGS = 0x911F;
    public static final int GL_BUFFER_MAP_LENGTH = 0x9120;
    public static final int GL_BUFFER_MAP_OFFSET = 0x9121;
    public static final int GL_DEPTH_COMPONENT32F = 0x8CAC;
    public static final int GL_DEPTH32F_STENCIL8 = 0x8CAD;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x0506;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;
    public static final int GL_FRAMEBUFFER_DEFAULT = 0x8218;
    public static final int GL_FRAMEBUFFER_UNDEFINED = 0x8219;
    public static final int GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;
    public static final int GL_MAX_RENDERBUFFER_SIZE = 0x84E8;
    public static final int GL_DEPTH_STENCIL = 0x84F9;
    public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;
    public static final int GL_DEPTH24_STENCIL8 = 0x88F0;
    public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;
    public static final int GL_TEXTURE_RED_TYPE = 0x8C10;
    public static final int GL_TEXTURE_GREEN_TYPE = 0x8C11;
    public static final int GL_TEXTURE_BLUE_TYPE = 0x8C12;
    public static final int GL_TEXTURE_ALPHA_TYPE = 0x8C13;
    public static final int GL_TEXTURE_DEPTH_TYPE = 0x8C16;
    public static final int GL_UNSIGNED_NORMALIZED = 0x8C17;
    public static final int GL_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int GL_RENDERBUFFER_BINDING = 0x8CA7;
    public static final int GL_READ_FRAMEBUFFER = 0x8CA8;
    public static final int GL_DRAW_FRAMEBUFFER = 0x8CA9;
    public static final int GL_READ_FRAMEBUFFER_BINDING = 0x8CAA;
    public static final int GL_RENDERBUFFER_SAMPLES = 0x8CAB;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
    public static final int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 0x8CDB;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 0x8CDC;
    public static final int GL_FRAMEBUFFER_UNSUPPORTED = 0x8CDD;
    public static final int GL_MAX_COLOR_ATTACHMENTS = 0x8CDF;
    public static final int GL_COLOR_ATTACHMENT0 = 0x8CE0;
    public static final int GL_COLOR_ATTACHMENT1 = 0x8CE1;
    public static final int GL_COLOR_ATTACHMENT2 = 0x8CE2;
    public static final int GL_COLOR_ATTACHMENT3 = 0x8CE3;
    public static final int GL_COLOR_ATTACHMENT4 = 0x8CE4;
    public static final int GL_COLOR_ATTACHMENT5 = 0x8CE5;
    public static final int GL_COLOR_ATTACHMENT6 = 0x8CE6;
    public static final int GL_COLOR_ATTACHMENT7 = 0x8CE7;
    public static final int GL_COLOR_ATTACHMENT8 = 0x8CE8;
    public static final int GL_COLOR_ATTACHMENT9 = 0x8CE9;
    public static final int GL_COLOR_ATTACHMENT10 = 0x8CEA;
    public static final int GL_COLOR_ATTACHMENT11 = 0x8CEB;
    public static final int GL_COLOR_ATTACHMENT12 = 0x8CEC;
    public static final int GL_COLOR_ATTACHMENT13 = 0x8CED;
    public static final int GL_COLOR_ATTACHMENT14 = 0x8CEE;
    public static final int GL_COLOR_ATTACHMENT15 = 0x8CEF;
    public static final int GL_COLOR_ATTACHMENT16 = 0x8CF0;
    public static final int GL_COLOR_ATTACHMENT17 = 0x8CF1;
    public static final int GL_COLOR_ATTACHMENT18 = 0x8CF2;
    public static final int GL_COLOR_ATTACHMENT19 = 0x8CF3;
    public static final int GL_COLOR_ATTACHMENT20 = 0x8CF4;
    public static final int GL_COLOR_ATTACHMENT21 = 0x8CF5;
    public static final int GL_COLOR_ATTACHMENT22 = 0x8CF6;
    public static final int GL_COLOR_ATTACHMENT23 = 0x8CF7;
    public static final int GL_COLOR_ATTACHMENT24 = 0x8CF8;
    public static final int GL_COLOR_ATTACHMENT25 = 0x8CF9;
    public static final int GL_COLOR_ATTACHMENT26 = 0x8CFA;
    public static final int GL_COLOR_ATTACHMENT27 = 0x8CFB;
    public static final int GL_COLOR_ATTACHMENT28 = 0x8CFC;
    public static final int GL_COLOR_ATTACHMENT29 = 0x8CFD;
    public static final int GL_COLOR_ATTACHMENT30 = 0x8CFE;
    public static final int GL_COLOR_ATTACHMENT31 = 0x8CFF;
    public static final int GL_DEPTH_ATTACHMENT = 0x8D00;
    public static final int GL_STENCIL_ATTACHMENT = 0x8D20;
    public static final int GL_FRAMEBUFFER = 0x8D40;
    public static final int GL_RENDERBUFFER = 0x8D41;
    public static final int GL_RENDERBUFFER_WIDTH = 0x8D42;
    public static final int GL_RENDERBUFFER_HEIGHT = 0x8D43;
    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
    public static final int GL_STENCIL_INDEX1 = 0x8D46;
    public static final int GL_STENCIL_INDEX4 = 0x8D47;
    public static final int GL_STENCIL_INDEX8 = 0x8D48;
    public static final int GL_STENCIL_INDEX16 = 0x8D49;
    public static final int GL_RENDERBUFFER_RED_SIZE = 0x8D50;
    public static final int GL_RENDERBUFFER_GREEN_SIZE = 0x8D51;
    public static final int GL_RENDERBUFFER_BLUE_SIZE = 0x8D52;
    public static final int GL_RENDERBUFFER_ALPHA_SIZE = 0x8D53;
    public static final int GL_RENDERBUFFER_DEPTH_SIZE = 0x8D54;
    public static final int GL_RENDERBUFFER_STENCIL_SIZE = 0x8D55;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;
    public static final int GL_MAX_SAMPLES = 0x8D57;
    public static final int GL_INDEX = 0x8222;
    public static final int GL_TEXTURE_LUMINANCE_TYPE = 0x8C14;
    public static final int GL_TEXTURE_INTENSITY_TYPE = 0x8C15;
    public static final int GL_FRAMEBUFFER_SRGB = 0x8DB9;
    public static final int GL_HALF_FLOAT = 0x140B;
    public static final int GL_MAP_READ_BIT = 0x0001;
    public static final int GL_MAP_WRITE_BIT = 0x0002;
    public static final int GL_MAP_INVALIDATE_RANGE_BIT = 0x0004;
    public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 0x0008;
    public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 0x0010;
    public static final int GL_MAP_UNSYNCHRONIZED_BIT = 0x0020;
    public static final int GL_COMPRESSED_RED_RGTC1 = 0x8DBB;
    public static final int GL_COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC;
    public static final int GL_COMPRESSED_RG_RGTC2 = 0x8DBD;
    public static final int GL_COMPRESSED_SIGNED_RG_RGTC2 = 0x8DBE;
    public static final int GL_RG = 0x8227;
    public static final int GL_RG_INTEGER = 0x8228;
    public static final int GL_R8 = 0x8229;
    public static final int GL_R16 = 0x822A;
    public static final int GL_RG8 = 0x822B;
    public static final int GL_RG16 = 0x822C;
    public static final int GL_R16F = 0x822D;
    public static final int GL_R32F = 0x822E;
    public static final int GL_RG16F = 0x822F;
    public static final int GL_RG32F = 0x8230;
    public static final int GL_R8I = 0x8231;
    public static final int GL_R8UI = 0x8232;
    public static final int GL_R16I = 0x8233;
    public static final int GL_R16UI = 0x8234;
    public static final int GL_R32I = 0x8235;
    public static final int GL_R32UI = 0x8236;
    public static final int GL_RG8I = 0x8237;
    public static final int GL_RG8UI = 0x8238;
    public static final int GL_RG16I = 0x8239;
    public static final int GL_RG16UI = 0x823A;
    public static final int GL_RG32I = 0x823B;
    public static final int GL_RG32UI = 0x823C;
    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;
    public static final int GL_CLAMP_VERTEX_COLOR = 0x891A;
    public static final int GL_CLAMP_FRAGMENT_COLOR = 0x891B;
    public static final int GL_ALPHA_INTEGER = 0x8D97;
    public static final int GL_SAMPLER_2D_RECT = 0x8B63;
    public static final int GL_SAMPLER_2D_RECT_SHADOW = 0x8B64;
    public static final int GL_SAMPLER_BUFFER = 0x8DC2;
    public static final int GL_INT_SAMPLER_2D_RECT = 0x8DCD;
    public static final int GL_INT_SAMPLER_BUFFER = 0x8DD0;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT = 0x8DD5;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER = 0x8DD8;
    public static final int GL_TEXTURE_BUFFER = 0x8C2A;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE = 0x8C2B;
    public static final int GL_TEXTURE_BINDING_BUFFER = 0x8C2C;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D;
    public static final int GL_TEXTURE_RECTANGLE = 0x84F5;
    public static final int GL_TEXTURE_BINDING_RECTANGLE = 0x84F6;
    public static final int GL_PROXY_TEXTURE_RECTANGLE = 0x84F7;
    public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 0x84F8;
    public static final int GL_R8_SNORM = 0x8F94;
    public static final int GL_RG8_SNORM = 0x8F95;
    public static final int GL_RGB8_SNORM = 0x8F96;
    public static final int GL_RGBA8_SNORM = 0x8F97;
    public static final int GL_R16_SNORM = 0x8F98;
    public static final int GL_RG16_SNORM = 0x8F99;
    public static final int GL_RGB16_SNORM = 0x8F9A;
    public static final int GL_RGBA16_SNORM = 0x8F9B;
    public static final int GL_SIGNED_NORMALIZED = 0x8F9C;
    public static final int GL_PRIMITIVE_RESTART = 0x8F9D;
    public static final int GL_PRIMITIVE_RESTART_INDEX = 0x8F9E;
    public static final int GL_COPY_READ_BUFFER = 0x8F36;
    public static final int GL_COPY_WRITE_BUFFER = 0x8F37;
    public static final int GL_UNIFORM_BUFFER = 0x8A11;
    public static final int GL_UNIFORM_BUFFER_BINDING = 0x8A28;
    public static final int GL_UNIFORM_BUFFER_START = 0x8A29;
    public static final int GL_UNIFORM_BUFFER_SIZE = 0x8A2A;
    public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;
    public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 0x8A2C;
    public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D;
    public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;
    public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F;
    public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 0x8A30;
    public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;
    public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32;
    public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;
    public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;
    public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35;
    public static final int GL_ACTIVE_UNIFORM_BLOCKS = 0x8A36;
    public static final int GL_UNIFORM_TYPE = 0x8A37;
    public static final int GL_UNIFORM_SIZE = 0x8A38;
    public static final int GL_UNIFORM_NAME_LENGTH = 0x8A39;
    public static final int GL_UNIFORM_BLOCK_INDEX = 0x8A3A;
    public static final int GL_UNIFORM_OFFSET = 0x8A3B;
    public static final int GL_UNIFORM_ARRAY_STRIDE = 0x8A3C;
    public static final int GL_UNIFORM_MATRIX_STRIDE = 0x8A3D;
    public static final int GL_UNIFORM_IS_ROW_MAJOR = 0x8A3E;
    public static final int GL_UNIFORM_BLOCK_BINDING = 0x8A3F;
    public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 0x8A40;
    public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 0x8A41;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;
    public static final long GL_INVALID_INDEX = 0xFFFFFFFFL;
    public static final int GL_CONTEXT_CORE_PROFILE_BIT = 0x00000001;
    public static final int GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = 0x00000002;
    public static final int GL_LINES_ADJACENCY = 0x000A;
    public static final int GL_LINE_STRIP_ADJACENCY = 0x000B;
    public static final int GL_TRIANGLES_ADJACENCY = 0x000C;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY = 0x000D;
    public static final int GL_PROGRAM_POINT_SIZE = 0x8642;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 0x8C29;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;
    public static final int GL_GEOMETRY_SHADER = 0x8DD9;
    public static final int GL_GEOMETRY_VERTICES_OUT = 0x8916;
    public static final int GL_GEOMETRY_INPUT_TYPE = 0x8917;
    public static final int GL_GEOMETRY_OUTPUT_TYPE = 0x8918;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS = 0x8DDF;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES = 0x8DE0;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 0x8DE1;
    public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;
    public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS = 0x9123;
    public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 0x9124;
    public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;
    public static final int GL_CONTEXT_PROFILE_MASK = 0x9126;
    public static final int GL_DEPTH_CLAMP = 0x864F;
    public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;
    public static final int GL_FIRST_VERTEX_CONVENTION = 0x8E4D;
    public static final int GL_LAST_VERTEX_CONVENTION = 0x8E4E;
    public static final int GL_PROVOKING_VERTEX = 0x8E4F;
    public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;
    public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;
    public static final int GL_OBJECT_TYPE = 0x9112;
    public static final int GL_SYNC_CONDITION = 0x9113;
    public static final int GL_SYNC_STATUS = 0x9114;
    public static final int GL_SYNC_FLAGS = 0x9115;
    public static final int GL_SYNC_FENCE = 0x9116;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;
    public static final int GL_UNSIGNALED = 0x9118;
    public static final int GL_SIGNALED = 0x9119;
    public static final int GL_ALREADY_SIGNALED = 0x911A;
    public static final int GL_TIMEOUT_EXPIRED = 0x911B;
    public static final int GL_CONDITION_SATISFIED = 0x911C;
    public static final int GL_WAIT_FAILED = 0x911D;
    public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFL;
    public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x00000001;
    public static final int GL_SAMPLE_POSITION = 0x8E50;
    public static final int GL_SAMPLE_MASK = 0x8E51;
    public static final int GL_SAMPLE_MASK_VALUE = 0x8E52;
    public static final int GL_MAX_SAMPLE_MASK_WORDS = 0x8E59;
    public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 0x9104;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;
    public static final int GL_TEXTURE_SAMPLES = 0x9106;
    public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;
    public static final int GL_SAMPLER_2D_MULTISAMPLE = 0x9108;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = 0x9109;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 0x910A;
    public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910B;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910C;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;
    public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = 0x910E;
    public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = 0x910F;
    public static final int GL_MAX_INTEGER_SAMPLES = 0x9110;
    public static final int GL_VERSION_1_0 = 1;
    public static final int GL_VERSION_1_1 = 1;
    public static final int GL_VERSION_1_2 = 1;
    public static final int GL_VERSION_1_3 = 1;
    public static final int GL_VERSION_1_4 = 1;
    public static final int GL_VERSION_1_5 = 1;
    public static final int GL_VERSION_2_0 = 1;
    public static final int GL_VERSION_2_1 = 1;
    public static final int GL_VERSION_3_0 = 1;
    public static final int GL_VERSION_3_1 = 1;
    public static final int GL_VERSION_3_2 = 1;
    public static final int GL_MULTISAMPLE_ARB = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE_ARB = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE_ARB = 0x809F;
    public static final int GL_SAMPLE_COVERAGE_ARB = 0x80A0;
    public static final int GL_SAMPLE_BUFFERS_ARB = 0x80A8;
    public static final int GL_SAMPLES_ARB = 0x80A9;
    public static final int GL_SAMPLE_COVERAGE_VALUE_ARB = 0x80AA;
    public static final int GL_SAMPLE_COVERAGE_INVERT_ARB = 0x80AB;
    public static final int GL_MULTISAMPLE_BIT_ARB = 0x20000000;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x00000004;
    public static final int GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252;
    public static final int GL_GUILTY_CONTEXT_RESET_ARB = 0x8253;
    public static final int GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254;
    public static final int GL_UNKNOWN_CONTEXT_RESET_ARB = 0x8255;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;
    public static final int GL_NO_RESET_NOTIFICATION_ARB = 0x8261;
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243;
    public static final int GL_DEBUG_CALLBACK_FUNCTION = 0x8244;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM = 0x8245;
    public static final int GL_DEBUG_SOURCE_API = 0x8246;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM = 0x8247;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY = 0x8249;
    public static final int GL_DEBUG_SOURCE_APPLICATION = 0x824A;
    public static final int GL_DEBUG_SOURCE_OTHER = 0x824B;
    public static final int GL_DEBUG_TYPE_ERROR = 0x824C;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR = 0x824E;
    public static final int GL_DEBUG_TYPE_PORTABILITY = 0x824F;
    public static final int GL_DEBUG_TYPE_PERFORMANCE = 0x8250;
    public static final int GL_DEBUG_TYPE_OTHER = 0x8251;
    public static final int GL_DEBUG_TYPE_MARKER = 0x8268;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP = 0x8269;
    public static final int GL_DEBUG_TYPE_POP_GROUP = 0x826A;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION = 0x826B;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH = 0x826C;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH = 0x826D;
    public static final int GL_BUFFER = 0x82E0;
    public static final int GL_SHADER = 0x82E1;
    public static final int GL_PROGRAM = 0x82E2;
    public static final int GL_QUERY = 0x82E3;
    public static final int GL_PROGRAM_PIPELINE = 0x82E4;
    public static final int GL_SAMPLER = 0x82E6;
    public static final int GL_MAX_LABEL_LENGTH = 0x82E8;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW = 0x9148;
    public static final int GL_DEBUG_OUTPUT = 0x92E0;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 0x00000002;
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS_KHR = 0x8242;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_KHR = 0x8243;
    public static final int GL_DEBUG_CALLBACK_FUNCTION_KHR = 0x8244;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM_KHR = 0x8245;
    public static final int GL_DEBUG_SOURCE_API_KHR = 0x8246;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM_KHR = 0x8247;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER_KHR = 0x8248;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY_KHR = 0x8249;
    public static final int GL_DEBUG_SOURCE_APPLICATION_KHR = 0x824A;
    public static final int GL_DEBUG_SOURCE_OTHER_KHR = 0x824B;
    public static final int GL_DEBUG_TYPE_ERROR_KHR = 0x824C;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_KHR = 0x824D;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_KHR = 0x824E;
    public static final int GL_DEBUG_TYPE_PORTABILITY_KHR = 0x824F;
    public static final int GL_DEBUG_TYPE_PERFORMANCE_KHR = 0x8250;
    public static final int GL_DEBUG_TYPE_OTHER_KHR = 0x8251;
    public static final int GL_DEBUG_TYPE_MARKER_KHR = 0x8268;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP_KHR = 0x8269;
    public static final int GL_DEBUG_TYPE_POP_GROUP_KHR = 0x826A;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION_KHR = 0x826B;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH_KHR = 0x826C;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH_KHR = 0x826D;
    public static final int GL_BUFFER_KHR = 0x82E0;
    public static final int GL_SHADER_KHR = 0x82E1;
    public static final int GL_PROGRAM_KHR = 0x82E2;
    public static final int GL_VERTEX_ARRAY_KHR = 0x8074;
    public static final int GL_QUERY_KHR = 0x82E3;
    public static final int GL_PROGRAM_PIPELINE_KHR = 0x82E4;
    public static final int GL_SAMPLER_KHR = 0x82E6;
    public static final int GL_MAX_LABEL_LENGTH_KHR = 0x82E8;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_KHR = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_KHR = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES_KHR = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH_KHR = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM_KHR = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW_KHR = 0x9148;
    public static final int GL_DEBUG_OUTPUT_KHR = 0x92E0;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT_KHR = 0x00000002;
    public static final int GL_STACK_OVERFLOW_KHR = 0x0503;
    public static final int GL_STACK_UNDERFLOW_KHR = 0x0504;
    public static final int GL_DISPLAY_LIST = 0x82E7;
    public static final int GL_ARB_multisample = 1;
    public static final int GL_ARB_robustness = 1;
    public static final int GL_KHR_debug = 1;

    public static native void init();// //
    public static native void glCullFace(int pmode); //GLenum, //void
    public static native void glFrontFace(int pmode); //GLenum, //void
    public static native void glHint(int ptarget, int pmode); //GLenum,GLenum, //void
    public static native void glLineWidth(float pwidth); //GLfloat, //void
    public static native void glPointSize(float psize); //GLfloat, //void
    public static native void glPolygonMode(int pface, int pmode); //GLenum,GLenum, //void
    public static native void glScissor(int px, int py, int pwidth, int pheight); //GLint,GLint,GLsizei,GLsizei, //void
    public static native void glTexParameterf(int ptarget, int ppname, float pparam); //GLenum,GLenum,GLfloat, //void
    public static native void glTexParameterfv(int ptarget, int ppname, float[] pparams, int offset_pparams); //GLenum,GLenum,const GLfloat*, //void
    public static native void glTexParameteri(int ptarget, int ppname, int pparam); //GLenum,GLenum,GLint, //void
    public static native void glTexParameteriv(int ptarget, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,const GLint*, //void
    public static native void glTexImage1D(int ptarget, int plevel, int pinternalformat, int pwidth, int pborder, int pformat, int ptype, Object ppixels, int offset_ppixels); //GLenum,GLint,GLint,GLsizei,GLint,GLenum,GLenum,const void*, //void
    public static native void glTexImage2D(int ptarget, int plevel, int pinternalformat, int pwidth, int pheight, int pborder, int pformat, int ptype, Object ppixels, int offset_ppixels); //GLenum,GLint,GLint,GLsizei,GLsizei,GLint,GLenum,GLenum,const void*, //void
    public static native void glDrawBuffer(int pbuf); //GLenum, //void
    public static native void glClear(int pmask); //GLbitfield, //void
    public static native void glClearColor(float pred, float pgreen, float pblue, float palpha); //GLfloat,GLfloat,GLfloat,GLfloat, //void
    public static native void glClearStencil(int ps); //GLint, //void
    public static native void glClearDepth(double pdepth); //GLdouble, //void
    public static native void glStencilMask(int pmask); //GLuint, //void
    public static native void glColorMask(int pred, int pgreen, int pblue, int palpha); //GLboolean,GLboolean,GLboolean,GLboolean, //void
    public static native void glDepthMask(int pflag); //GLboolean, //void
    public static native void glDisable(int pcap); //GLenum, //void
    public static native void glEnable(int pcap); //GLenum, //void
    public static native void glFinish(); // //void
    public static native void glFlush(); // //void
    public static native void glBlendFunc(int psfactor, int pdfactor); //GLenum,GLenum, //void
    public static native void glLogicOp(int popcode); //GLenum, //void
    public static native void glStencilFunc(int pfunc, int pref, int pmask); //GLenum,GLint,GLuint, //void
    public static native void glStencilOp(int pfail, int pzfail, int pzpass); //GLenum,GLenum,GLenum, //void
    public static native void glDepthFunc(int pfunc); //GLenum, //void
    public static native void glPixelStoref(int ppname, float pparam); //GLenum,GLfloat, //void
    public static native void glPixelStorei(int ppname, int pparam); //GLenum,GLint, //void
    public static native void glReadBuffer(int psrc); //GLenum, //void
    public static native void glReadPixels(int px, int py, int pwidth, int pheight, int pformat, int ptype, Object ppixels, int offset_ppixels); //GLint,GLint,GLsizei,GLsizei,GLenum,GLenum,void*, //void
    public static native void glGetBooleanv(int ppname, int[] pdata, int offset_pdata); //GLenum,GLboolean*, //void
    public static native void glGetDoublev(int ppname, double[] pdata, int offset_pdata); //GLenum,GLdouble*, //void
    public static native int glGetError(); // //GLenum
    public static native void glGetFloatv(int ppname, float[] pdata, int offset_pdata); //GLenum,GLfloat*, //void
    public static native void glGetIntegerv(int ppname, int[] pdata, int offset_pdata); //GLenum,GLint*, //void
    public static native byte[] glGetString(int pname); //GLenum, //const GLubyte*
    public static native void glGetTexImage(int ptarget, int plevel, int pformat, int ptype, Object ppixels, int offset_ppixels); //GLenum,GLint,GLenum,GLenum,void*, //void
    public static native void glGetTexParameterfv(int ptarget, int ppname, float[] pparams, int offset_pparams); //GLenum,GLenum,GLfloat*, //void
    public static native void glGetTexParameteriv(int ptarget, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,GLint*, //void
    public static native void glGetTexLevelParameterfv(int ptarget, int plevel, int ppname, float[] pparams, int offset_pparams); //GLenum,GLint,GLenum,GLfloat*, //void
    public static native void glGetTexLevelParameteriv(int ptarget, int plevel, int ppname, int[] pparams, int offset_pparams); //GLenum,GLint,GLenum,GLint*, //void
    public static native int glIsEnabled(int pcap); //GLenum, //GLboolean
    public static native void glDepthRange(double pnear, double pfar); //GLdouble,GLdouble, //void
    public static native void glViewport(int px, int py, int pwidth, int pheight); //GLint,GLint,GLsizei,GLsizei, //void
    public static native void glNewList(int plist, int pmode); //GLuint,GLenum, //void
    public static native void glEndList(); // //void
    public static native void glCallList(int plist); //GLuint, //void
    public static native void glCallLists(int pn, int ptype, Object plists, int offset_plists); //GLsizei,GLenum,const void*, //void
    public static native void glDeleteLists(int plist, int prange); //GLuint,GLsizei, //void
    public static native int glGenLists(int prange); //GLsizei, //GLuint
    public static native void glListBase(int pbase); //GLuint, //void
    public static native void glBegin(int pmode); //GLenum, //void
    public static native void glBitmap(int pwidth, int pheight, float pxorig, float pyorig, float pxmove, float pymove, byte[] pbitmap, int offset_pbitmap); //GLsizei,GLsizei,GLfloat,GLfloat,GLfloat,GLfloat,const GLubyte*, //void
    public static native void glColor3b(byte pred, byte pgreen, byte pblue); //GLbyte,GLbyte,GLbyte, //void
    public static native void glColor3bv(byte[] pv, int offset_pv); //const GLbyte*, //void
    public static native void glColor3d(double pred, double pgreen, double pblue); //GLdouble,GLdouble,GLdouble, //void
    public static native void glColor3dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glColor3f(float pred, float pgreen, float pblue); //GLfloat,GLfloat,GLfloat, //void
    public static native void glColor3fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glColor3i(int pred, int pgreen, int pblue); //GLint,GLint,GLint, //void
    public static native void glColor3iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glColor3s(short pred, short pgreen, short pblue); //GLshort,GLshort,GLshort, //void
    public static native void glColor3sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glColor3ub(byte pred, byte pgreen, byte pblue); //GLubyte,GLubyte,GLubyte, //void
    public static native void glColor3ubv(byte[] pv, int offset_pv); //const GLubyte*, //void
    public static native void glColor3ui(int pred, int pgreen, int pblue); //GLuint,GLuint,GLuint, //void
    public static native void glColor3uiv(int[] pv, int offset_pv); //const GLuint*, //void
    public static native void glColor3us(short pred, short pgreen, short pblue); //GLushort,GLushort,GLushort, //void
    public static native void glColor3usv(short[] pv, int offset_pv); //const GLushort*, //void
    public static native void glColor4b(byte pred, byte pgreen, byte pblue, byte palpha); //GLbyte,GLbyte,GLbyte,GLbyte, //void
    public static native void glColor4bv(byte[] pv, int offset_pv); //const GLbyte*, //void
    public static native void glColor4d(double pred, double pgreen, double pblue, double palpha); //GLdouble,GLdouble,GLdouble,GLdouble, //void
    public static native void glColor4dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glColor4f(float pred, float pgreen, float pblue, float palpha); //GLfloat,GLfloat,GLfloat,GLfloat, //void
    public static native void glColor4fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glColor4i(int pred, int pgreen, int pblue, int palpha); //GLint,GLint,GLint,GLint, //void
    public static native void glColor4iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glColor4s(short pred, short pgreen, short pblue, short palpha); //GLshort,GLshort,GLshort,GLshort, //void
    public static native void glColor4sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glColor4ub(byte pred, byte pgreen, byte pblue, byte palpha); //GLubyte,GLubyte,GLubyte,GLubyte, //void
    public static native void glColor4ubv(byte[] pv, int offset_pv); //const GLubyte*, //void
    public static native void glColor4ui(int pred, int pgreen, int pblue, int palpha); //GLuint,GLuint,GLuint,GLuint, //void
    public static native void glColor4uiv(int[] pv, int offset_pv); //const GLuint*, //void
    public static native void glColor4us(short pred, short pgreen, short pblue, short palpha); //GLushort,GLushort,GLushort,GLushort, //void
    public static native void glColor4usv(short[] pv, int offset_pv); //const GLushort*, //void
    public static native void glEdgeFlag(int pflag); //GLboolean, //void
    public static native void glEdgeFlagv(int[] pflag, int offset_pflag); //const GLboolean*, //void
    public static native void glEnd(); // //void
    public static native void glIndexd(double pc); //GLdouble, //void
    public static native void glIndexdv(double[] pc, int offset_pc); //const GLdouble*, //void
    public static native void glIndexf(float pc); //GLfloat, //void
    public static native void glIndexfv(float[] pc, int offset_pc); //const GLfloat*, //void
    public static native void glIndexi(int pc); //GLint, //void
    public static native void glIndexiv(int[] pc, int offset_pc); //const GLint*, //void
    public static native void glIndexs(short pc); //GLshort, //void
    public static native void glIndexsv(short[] pc, int offset_pc); //const GLshort*, //void
    public static native void glNormal3b(byte pnx, byte pny, byte pnz); //GLbyte,GLbyte,GLbyte, //void
    public static native void glNormal3bv(byte[] pv, int offset_pv); //const GLbyte*, //void
    public static native void glNormal3d(double pnx, double pny, double pnz); //GLdouble,GLdouble,GLdouble, //void
    public static native void glNormal3dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glNormal3f(float pnx, float pny, float pnz); //GLfloat,GLfloat,GLfloat, //void
    public static native void glNormal3fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glNormal3i(int pnx, int pny, int pnz); //GLint,GLint,GLint, //void
    public static native void glNormal3iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glNormal3s(short pnx, short pny, short pnz); //GLshort,GLshort,GLshort, //void
    public static native void glNormal3sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glRasterPos2d(double px, double py); //GLdouble,GLdouble, //void
    public static native void glRasterPos2dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glRasterPos2f(float px, float py); //GLfloat,GLfloat, //void
    public static native void glRasterPos2fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glRasterPos2i(int px, int py); //GLint,GLint, //void
    public static native void glRasterPos2iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glRasterPos2s(short px, short py); //GLshort,GLshort, //void
    public static native void glRasterPos2sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glRasterPos3d(double px, double py, double pz); //GLdouble,GLdouble,GLdouble, //void
    public static native void glRasterPos3dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glRasterPos3f(float px, float py, float pz); //GLfloat,GLfloat,GLfloat, //void
    public static native void glRasterPos3fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glRasterPos3i(int px, int py, int pz); //GLint,GLint,GLint, //void
    public static native void glRasterPos3iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glRasterPos3s(short px, short py, short pz); //GLshort,GLshort,GLshort, //void
    public static native void glRasterPos3sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glRasterPos4d(double px, double py, double pz, double pw); //GLdouble,GLdouble,GLdouble,GLdouble, //void
    public static native void glRasterPos4dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glRasterPos4f(float px, float py, float pz, float pw); //GLfloat,GLfloat,GLfloat,GLfloat, //void
    public static native void glRasterPos4fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glRasterPos4i(int px, int py, int pz, int pw); //GLint,GLint,GLint,GLint, //void
    public static native void glRasterPos4iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glRasterPos4s(short px, short py, short pz, short pw); //GLshort,GLshort,GLshort,GLshort, //void
    public static native void glRasterPos4sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glRectd(double px1, double py1, double px2, double py2); //GLdouble,GLdouble,GLdouble,GLdouble, //void
    public static native void glRectdv(double[] pv1, int offset_pv1, double[] pv2, int offset_pv2); //const GLdouble*,const GLdouble*, //void
    public static native void glRectf(float px1, float py1, float px2, float py2); //GLfloat,GLfloat,GLfloat,GLfloat, //void
    public static native void glRectfv(float[] pv1, int offset_pv1, float[] pv2, int offset_pv2); //const GLfloat*,const GLfloat*, //void
    public static native void glRecti(int px1, int py1, int px2, int py2); //GLint,GLint,GLint,GLint, //void
    public static native void glRectiv(int[] pv1, int offset_pv1, int[] pv2, int offset_pv2); //const GLint*,const GLint*, //void
    public static native void glRects(short px1, short py1, short px2, short py2); //GLshort,GLshort,GLshort,GLshort, //void
    public static native void glRectsv(short[] pv1, int offset_pv1, short[] pv2, int offset_pv2); //const GLshort*,const GLshort*, //void
    public static native void glTexCoord1d(double ps); //GLdouble, //void
    public static native void glTexCoord1dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glTexCoord1f(float ps); //GLfloat, //void
    public static native void glTexCoord1fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glTexCoord1i(int ps); //GLint, //void
    public static native void glTexCoord1iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glTexCoord1s(short ps); //GLshort, //void
    public static native void glTexCoord1sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glTexCoord2d(double ps, double pt); //GLdouble,GLdouble, //void
    public static native void glTexCoord2dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glTexCoord2f(float ps, float pt); //GLfloat,GLfloat, //void
    public static native void glTexCoord2fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glTexCoord2i(int ps, int pt); //GLint,GLint, //void
    public static native void glTexCoord2iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glTexCoord2s(short ps, short pt); //GLshort,GLshort, //void
    public static native void glTexCoord2sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glTexCoord3d(double ps, double pt, double pr); //GLdouble,GLdouble,GLdouble, //void
    public static native void glTexCoord3dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glTexCoord3f(float ps, float pt, float pr); //GLfloat,GLfloat,GLfloat, //void
    public static native void glTexCoord3fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glTexCoord3i(int ps, int pt, int pr); //GLint,GLint,GLint, //void
    public static native void glTexCoord3iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glTexCoord3s(short ps, short pt, short pr); //GLshort,GLshort,GLshort, //void
    public static native void glTexCoord3sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glTexCoord4d(double ps, double pt, double pr, double pq); //GLdouble,GLdouble,GLdouble,GLdouble, //void
    public static native void glTexCoord4dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glTexCoord4f(float ps, float pt, float pr, float pq); //GLfloat,GLfloat,GLfloat,GLfloat, //void
    public static native void glTexCoord4fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glTexCoord4i(int ps, int pt, int pr, int pq); //GLint,GLint,GLint,GLint, //void
    public static native void glTexCoord4iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glTexCoord4s(short ps, short pt, short pr, short pq); //GLshort,GLshort,GLshort,GLshort, //void
    public static native void glTexCoord4sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glVertex2d(double px, double py); //GLdouble,GLdouble, //void
    public static native void glVertex2dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glVertex2f(float px, float py); //GLfloat,GLfloat, //void
    public static native void glVertex2fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glVertex2i(int px, int py); //GLint,GLint, //void
    public static native void glVertex2iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glVertex2s(short px, short py); //GLshort,GLshort, //void
    public static native void glVertex2sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glVertex3d(double px, double py, double pz); //GLdouble,GLdouble,GLdouble, //void
    public static native void glVertex3dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glVertex3f(float px, float py, float pz); //GLfloat,GLfloat,GLfloat, //void
    public static native void glVertex3fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glVertex3i(int px, int py, int pz); //GLint,GLint,GLint, //void
    public static native void glVertex3iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glVertex3s(short px, short py, short pz); //GLshort,GLshort,GLshort, //void
    public static native void glVertex3sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glVertex4d(double px, double py, double pz, double pw); //GLdouble,GLdouble,GLdouble,GLdouble, //void
    public static native void glVertex4dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glVertex4f(float px, float py, float pz, float pw); //GLfloat,GLfloat,GLfloat,GLfloat, //void
    public static native void glVertex4fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glVertex4i(int px, int py, int pz, int pw); //GLint,GLint,GLint,GLint, //void
    public static native void glVertex4iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glVertex4s(short px, short py, short pz, short pw); //GLshort,GLshort,GLshort,GLshort, //void
    public static native void glVertex4sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glClipPlane(int pplane, double[] pequation, int offset_pequation); //GLenum,const GLdouble*, //void
    public static native void glColorMaterial(int pface, int pmode); //GLenum,GLenum, //void
    public static native void glFogf(int ppname, float pparam); //GLenum,GLfloat, //void
    public static native void glFogfv(int ppname, float[] pparams, int offset_pparams); //GLenum,const GLfloat*, //void
    public static native void glFogi(int ppname, int pparam); //GLenum,GLint, //void
    public static native void glFogiv(int ppname, int[] pparams, int offset_pparams); //GLenum,const GLint*, //void
    public static native void glLightf(int plight, int ppname, float pparam); //GLenum,GLenum,GLfloat, //void
    public static native void glLightfv(int plight, int ppname, float[] pparams, int offset_pparams); //GLenum,GLenum,const GLfloat*, //void
    public static native void glLighti(int plight, int ppname, int pparam); //GLenum,GLenum,GLint, //void
    public static native void glLightiv(int plight, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,const GLint*, //void
    public static native void glLightModelf(int ppname, float pparam); //GLenum,GLfloat, //void
    public static native void glLightModelfv(int ppname, float[] pparams, int offset_pparams); //GLenum,const GLfloat*, //void
    public static native void glLightModeli(int ppname, int pparam); //GLenum,GLint, //void
    public static native void glLightModeliv(int ppname, int[] pparams, int offset_pparams); //GLenum,const GLint*, //void
    public static native void glLineStipple(int pfactor, short ppattern); //GLint,GLushort, //void
    public static native void glMaterialf(int pface, int ppname, float pparam); //GLenum,GLenum,GLfloat, //void
    public static native void glMaterialfv(int pface, int ppname, float[] pparams, int offset_pparams); //GLenum,GLenum,const GLfloat*, //void
    public static native void glMateriali(int pface, int ppname, int pparam); //GLenum,GLenum,GLint, //void
    public static native void glMaterialiv(int pface, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,const GLint*, //void
    public static native void glPolygonStipple(byte[] pmask, int offset_pmask); //const GLubyte*, //void
    public static native void glShadeModel(int pmode); //GLenum, //void
    public static native void glTexEnvf(int ptarget, int ppname, float pparam); //GLenum,GLenum,GLfloat, //void
    public static native void glTexEnvfv(int ptarget, int ppname, float[] pparams, int offset_pparams); //GLenum,GLenum,const GLfloat*, //void
    public static native void glTexEnvi(int ptarget, int ppname, int pparam); //GLenum,GLenum,GLint, //void
    public static native void glTexEnviv(int ptarget, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,const GLint*, //void
    public static native void glTexGend(int pcoord, int ppname, double pparam); //GLenum,GLenum,GLdouble, //void
    public static native void glTexGendv(int pcoord, int ppname, double[] pparams, int offset_pparams); //GLenum,GLenum,const GLdouble*, //void
    public static native void glTexGenf(int pcoord, int ppname, float pparam); //GLenum,GLenum,GLfloat, //void
    public static native void glTexGenfv(int pcoord, int ppname, float[] pparams, int offset_pparams); //GLenum,GLenum,const GLfloat*, //void
    public static native void glTexGeni(int pcoord, int ppname, int pparam); //GLenum,GLenum,GLint, //void
    public static native void glTexGeniv(int pcoord, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,const GLint*, //void
    public static native void glFeedbackBuffer(int psize, int ptype, float[] pbuffer, int offset_pbuffer); //GLsizei,GLenum,GLfloat*, //void
    public static native void glSelectBuffer(int psize, int[] pbuffer, int offset_pbuffer); //GLsizei,GLuint*, //void
    public static native int glRenderMode(int pmode); //GLenum, //GLint
    public static native void glInitNames(); // //void
    public static native void glLoadName(int pname); //GLuint, //void
    public static native void glPassThrough(float ptoken); //GLfloat, //void
    public static native void glPopName(); // //void
    public static native void glPushName(int pname); //GLuint, //void
    public static native void glClearAccum(float pred, float pgreen, float pblue, float palpha); //GLfloat,GLfloat,GLfloat,GLfloat, //void
    public static native void glClearIndex(float pc); //GLfloat, //void
    public static native void glIndexMask(int pmask); //GLuint, //void
    public static native void glAccum(int pop, float pvalue); //GLenum,GLfloat, //void
    public static native void glPopAttrib(); // //void
    public static native void glPushAttrib(int pmask); //GLbitfield, //void
    public static native void glMap1d(int ptarget, double pu1, double pu2, int pstride, int porder, double[] ppoints, int offset_ppoints); //GLenum,GLdouble,GLdouble,GLint,GLint,const GLdouble*, //void
    public static native void glMap1f(int ptarget, float pu1, float pu2, int pstride, int porder, float[] ppoints, int offset_ppoints); //GLenum,GLfloat,GLfloat,GLint,GLint,const GLfloat*, //void
    public static native void glMap2d(int ptarget, double pu1, double pu2, int pustride, int puorder, double pv1, double pv2, int pvstride, int pvorder, double[] ppoints, int offset_ppoints); //GLenum,GLdouble,GLdouble,GLint,GLint,GLdouble,GLdouble,GLint,GLint,const GLdouble*, //void
    public static native void glMap2f(int ptarget, float pu1, float pu2, int pustride, int puorder, float pv1, float pv2, int pvstride, int pvorder, float[] ppoints, int offset_ppoints); //GLenum,GLfloat,GLfloat,GLint,GLint,GLfloat,GLfloat,GLint,GLint,const GLfloat*, //void
    public static native void glMapGrid1d(int pun, double pu1, double pu2); //GLint,GLdouble,GLdouble, //void
    public static native void glMapGrid1f(int pun, float pu1, float pu2); //GLint,GLfloat,GLfloat, //void
    public static native void glMapGrid2d(int pun, double pu1, double pu2, int pvn, double pv1, double pv2); //GLint,GLdouble,GLdouble,GLint,GLdouble,GLdouble, //void
    public static native void glMapGrid2f(int pun, float pu1, float pu2, int pvn, float pv1, float pv2); //GLint,GLfloat,GLfloat,GLint,GLfloat,GLfloat, //void
    public static native void glEvalCoord1d(double pu); //GLdouble, //void
    public static native void glEvalCoord1dv(double[] pu, int offset_pu); //const GLdouble*, //void
    public static native void glEvalCoord1f(float pu); //GLfloat, //void
    public static native void glEvalCoord1fv(float[] pu, int offset_pu); //const GLfloat*, //void
    public static native void glEvalCoord2d(double pu, double pv); //GLdouble,GLdouble, //void
    public static native void glEvalCoord2dv(double[] pu, int offset_pu); //const GLdouble*, //void
    public static native void glEvalCoord2f(float pu, float pv); //GLfloat,GLfloat, //void
    public static native void glEvalCoord2fv(float[] pu, int offset_pu); //const GLfloat*, //void
    public static native void glEvalMesh1(int pmode, int pi1, int pi2); //GLenum,GLint,GLint, //void
    public static native void glEvalPoint1(int pi); //GLint, //void
    public static native void glEvalMesh2(int pmode, int pi1, int pi2, int pj1, int pj2); //GLenum,GLint,GLint,GLint,GLint, //void
    public static native void glEvalPoint2(int pi, int pj); //GLint,GLint, //void
    public static native void glAlphaFunc(int pfunc, float pref); //GLenum,GLfloat, //void
    public static native void glPixelZoom(float pxfactor, float pyfactor); //GLfloat,GLfloat, //void
    public static native void glPixelTransferf(int ppname, float pparam); //GLenum,GLfloat, //void
    public static native void glPixelTransferi(int ppname, int pparam); //GLenum,GLint, //void
    public static native void glPixelMapfv(int pmap, int pmapsize, float[] pvalues, int offset_pvalues); //GLenum,GLsizei,const GLfloat*, //void
    public static native void glPixelMapuiv(int pmap, int pmapsize, int[] pvalues, int offset_pvalues); //GLenum,GLsizei,const GLuint*, //void
    public static native void glPixelMapusv(int pmap, int pmapsize, short[] pvalues, int offset_pvalues); //GLenum,GLsizei,const GLushort*, //void
    public static native void glCopyPixels(int px, int py, int pwidth, int pheight, int ptype); //GLint,GLint,GLsizei,GLsizei,GLenum, //void
    public static native void glDrawPixels(int pwidth, int pheight, int pformat, int ptype, Object ppixels, int offset_ppixels); //GLsizei,GLsizei,GLenum,GLenum,const void*, //void
    public static native void glGetClipPlane(int pplane, double[] pequation, int offset_pequation); //GLenum,GLdouble*, //void
    public static native void glGetLightfv(int plight, int ppname, float[] pparams, int offset_pparams); //GLenum,GLenum,GLfloat*, //void
    public static native void glGetLightiv(int plight, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,GLint*, //void
    public static native void glGetMapdv(int ptarget, int pquery, double[] pv, int offset_pv); //GLenum,GLenum,GLdouble*, //void
    public static native void glGetMapfv(int ptarget, int pquery, float[] pv, int offset_pv); //GLenum,GLenum,GLfloat*, //void
    public static native void glGetMapiv(int ptarget, int pquery, int[] pv, int offset_pv); //GLenum,GLenum,GLint*, //void
    public static native void glGetMaterialfv(int pface, int ppname, float[] pparams, int offset_pparams); //GLenum,GLenum,GLfloat*, //void
    public static native void glGetMaterialiv(int pface, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,GLint*, //void
    public static native void glGetPixelMapfv(int pmap, float[] pvalues, int offset_pvalues); //GLenum,GLfloat*, //void
    public static native void glGetPixelMapuiv(int pmap, int[] pvalues, int offset_pvalues); //GLenum,GLuint*, //void
    public static native void glGetPixelMapusv(int pmap, short[] pvalues, int offset_pvalues); //GLenum,GLushort*, //void
    public static native void glGetPolygonStipple(byte[] pmask, int offset_pmask); //GLubyte*, //void
    public static native void glGetTexEnvfv(int ptarget, int ppname, float[] pparams, int offset_pparams); //GLenum,GLenum,GLfloat*, //void
    public static native void glGetTexEnviv(int ptarget, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,GLint*, //void
    public static native void glGetTexGendv(int pcoord, int ppname, double[] pparams, int offset_pparams); //GLenum,GLenum,GLdouble*, //void
    public static native void glGetTexGenfv(int pcoord, int ppname, float[] pparams, int offset_pparams); //GLenum,GLenum,GLfloat*, //void
    public static native void glGetTexGeniv(int pcoord, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,GLint*, //void
    public static native int glIsList(int plist); //GLuint, //GLboolean
    public static native void glFrustum(double pleft, double pright, double pbottom, double ptop, double pzNear, double pzFar); //GLdouble,GLdouble,GLdouble,GLdouble,GLdouble,GLdouble, //void
    public static native void glLoadIdentity(); // //void
    public static native void glLoadMatrixf(float[] pm, int offset_pm); //const GLfloat*, //void
    public static native void glLoadMatrixd(double[] pm, int offset_pm); //const GLdouble*, //void
    public static native void glMatrixMode(int pmode); //GLenum, //void
    public static native void glMultMatrixf(float[] pm, int offset_pm); //const GLfloat*, //void
    public static native void glMultMatrixd(double[] pm, int offset_pm); //const GLdouble*, //void
    public static native void glOrtho(double pleft, double pright, double pbottom, double ptop, double pzNear, double pzFar); //GLdouble,GLdouble,GLdouble,GLdouble,GLdouble,GLdouble, //void
    public static native void glPopMatrix(); // //void
    public static native void glPushMatrix(); // //void
    public static native void glRotated(double pangle, double px, double py, double pz); //GLdouble,GLdouble,GLdouble,GLdouble, //void
    public static native void glRotatef(float pangle, float px, float py, float pz); //GLfloat,GLfloat,GLfloat,GLfloat, //void
    public static native void glScaled(double px, double py, double pz); //GLdouble,GLdouble,GLdouble, //void
    public static native void glScalef(float px, float py, float pz); //GLfloat,GLfloat,GLfloat, //void
    public static native void glTranslated(double px, double py, double pz); //GLdouble,GLdouble,GLdouble, //void
    public static native void glTranslatef(float px, float py, float pz); //GLfloat,GLfloat,GLfloat, //void
    public static native void glDrawArrays(int pmode, int pfirst, int pcount); //GLenum,GLint,GLsizei, //void
    public static native void glDrawElements(int pmode, int pcount, int ptype, Object pindices, int offset_pindices); //GLenum,GLsizei,GLenum,const void*, //void
    public static native void glGetPointerv(int ppname, Object[] pparams); //GLenum,void**, //void
    public static native void glPolygonOffset(float pfactor, float punits); //GLfloat,GLfloat, //void
    public static native void glCopyTexImage1D(int ptarget, int plevel, int pinternalformat, int px, int py, int pwidth, int pborder); //GLenum,GLint,GLenum,GLint,GLint,GLsizei,GLint, //void
    public static native void glCopyTexImage2D(int ptarget, int plevel, int pinternalformat, int px, int py, int pwidth, int pheight, int pborder); //GLenum,GLint,GLenum,GLint,GLint,GLsizei,GLsizei,GLint, //void
    public static native void glCopyTexSubImage1D(int ptarget, int plevel, int pxoffset, int px, int py, int pwidth); //GLenum,GLint,GLint,GLint,GLint,GLsizei, //void
    public static native void glCopyTexSubImage2D(int ptarget, int plevel, int pxoffset, int pyoffset, int px, int py, int pwidth, int pheight); //GLenum,GLint,GLint,GLint,GLint,GLint,GLsizei,GLsizei, //void
    public static native void glTexSubImage1D(int ptarget, int plevel, int pxoffset, int pwidth, int pformat, int ptype, Object ppixels, int offset_ppixels); //GLenum,GLint,GLint,GLsizei,GLenum,GLenum,const void*, //void
    public static native void glTexSubImage2D(int ptarget, int plevel, int pxoffset, int pyoffset, int pwidth, int pheight, int pformat, int ptype, Object ppixels, int offset_ppixels); //GLenum,GLint,GLint,GLint,GLsizei,GLsizei,GLenum,GLenum,const void*, //void
    public static native void glBindTexture(int ptarget, int ptexture); //GLenum,GLuint, //void
    public static native void glDeleteTextures(int pn, int[] ptextures, int offset_ptextures); //GLsizei,const GLuint*, //void
    public static native void glGenTextures(int pn, int[] ptextures, int offset_ptextures); //GLsizei,GLuint*, //void
    public static native int glIsTexture(int ptexture); //GLuint, //GLboolean
    public static native void glArrayElement(int pi); //GLint, //void
    public static native void glColorPointer(int psize, int ptype, int pstride, Object ppointer, int offset_ppointer); //GLint,GLenum,GLsizei,const void*, //void
    public static native void glDisableClientState(int parray); //GLenum, //void
    public static native void glEdgeFlagPointer(int pstride, Object ppointer, int offset_ppointer); //GLsizei,const void*, //void
    public static native void glEnableClientState(int parray); //GLenum, //void
    public static native void glIndexPointer(int ptype, int pstride, Object ppointer, int offset_ppointer); //GLenum,GLsizei,const void*, //void
    public static native void glInterleavedArrays(int pformat, int pstride, Object ppointer, int offset_ppointer); //GLenum,GLsizei,const void*, //void
    public static native void glNormalPointer(int ptype, int pstride, Object ppointer, int offset_ppointer); //GLenum,GLsizei,const void*, //void
    public static native void glTexCoordPointer(int psize, int ptype, int pstride, Object ppointer, int offset_ppointer); //GLint,GLenum,GLsizei,const void*, //void
    public static native void glVertexPointer(int psize, int ptype, int pstride, Object ppointer, int offset_ppointer); //GLint,GLenum,GLsizei,const void*, //void
    public static native int glAreTexturesResident(int pn, int[] ptextures, int offset_ptextures, int[] presidences, int offset_presidences); //GLsizei,const GLuint*,GLboolean*, //GLboolean
    public static native void glPrioritizeTextures(int pn, int[] ptextures, int offset_ptextures, float[] ppriorities, int offset_ppriorities); //GLsizei,const GLuint*,const GLfloat*, //void
    public static native void glIndexub(byte pc); //GLubyte, //void
    public static native void glIndexubv(byte[] pc, int offset_pc); //const GLubyte*, //void
    public static native void glPopClientAttrib(); // //void
    public static native void glPushClientAttrib(int pmask); //GLbitfield, //void
    public static native void glDrawRangeElements(int pmode, int pstart, int pend, int pcount, int ptype, Object pindices, int offset_pindices); //GLenum,GLuint,GLuint,GLsizei,GLenum,const void*, //void
    public static native void glTexImage3D(int ptarget, int plevel, int pinternalformat, int pwidth, int pheight, int pdepth, int pborder, int pformat, int ptype, Object ppixels, int offset_ppixels); //GLenum,GLint,GLint,GLsizei,GLsizei,GLsizei,GLint,GLenum,GLenum,const void*, //void
    public static native void glTexSubImage3D(int ptarget, int plevel, int pxoffset, int pyoffset, int pzoffset, int pwidth, int pheight, int pdepth, int pformat, int ptype, Object ppixels, int offset_ppixels); //GLenum,GLint,GLint,GLint,GLint,GLsizei,GLsizei,GLsizei,GLenum,GLenum,const void*, //void
    public static native void glCopyTexSubImage3D(int ptarget, int plevel, int pxoffset, int pyoffset, int pzoffset, int px, int py, int pwidth, int pheight); //GLenum,GLint,GLint,GLint,GLint,GLint,GLint,GLsizei,GLsizei, //void
    public static native void glActiveTexture(int ptexture); //GLenum, //void
    public static native void glSampleCoverage(float pvalue, int pinvert); //GLfloat,GLboolean, //void
    public static native void glCompressedTexImage3D(int ptarget, int plevel, int pinternalformat, int pwidth, int pheight, int pdepth, int pborder, int pimageSize, Object pdata, int offset_pdata); //GLenum,GLint,GLenum,GLsizei,GLsizei,GLsizei,GLint,GLsizei,const void*, //void
    public static native void glCompressedTexImage2D(int ptarget, int plevel, int pinternalformat, int pwidth, int pheight, int pborder, int pimageSize, Object pdata, int offset_pdata); //GLenum,GLint,GLenum,GLsizei,GLsizei,GLint,GLsizei,const void*, //void
    public static native void glCompressedTexImage1D(int ptarget, int plevel, int pinternalformat, int pwidth, int pborder, int pimageSize, Object pdata, int offset_pdata); //GLenum,GLint,GLenum,GLsizei,GLint,GLsizei,const void*, //void
    public static native void glCompressedTexSubImage3D(int ptarget, int plevel, int pxoffset, int pyoffset, int pzoffset, int pwidth, int pheight, int pdepth, int pformat, int pimageSize, Object pdata, int offset_pdata); //GLenum,GLint,GLint,GLint,GLint,GLsizei,GLsizei,GLsizei,GLenum,GLsizei,const void*, //void
    public static native void glCompressedTexSubImage2D(int ptarget, int plevel, int pxoffset, int pyoffset, int pwidth, int pheight, int pformat, int pimageSize, Object pdata, int offset_pdata); //GLenum,GLint,GLint,GLint,GLsizei,GLsizei,GLenum,GLsizei,const void*, //void
    public static native void glCompressedTexSubImage1D(int ptarget, int plevel, int pxoffset, int pwidth, int pformat, int pimageSize, Object pdata, int offset_pdata); //GLenum,GLint,GLint,GLsizei,GLenum,GLsizei,const void*, //void
    public static native void glGetCompressedTexImage(int ptarget, int plevel, Object pimg, int offset_pimg); //GLenum,GLint,void*, //void
    public static native void glClientActiveTexture(int ptexture); //GLenum, //void
    public static native void glMultiTexCoord1d(int ptarget, double ps); //GLenum,GLdouble, //void
    public static native void glMultiTexCoord1dv(int ptarget, double[] pv, int offset_pv); //GLenum,const GLdouble*, //void
    public static native void glMultiTexCoord1f(int ptarget, float ps); //GLenum,GLfloat, //void
    public static native void glMultiTexCoord1fv(int ptarget, float[] pv, int offset_pv); //GLenum,const GLfloat*, //void
    public static native void glMultiTexCoord1i(int ptarget, int ps); //GLenum,GLint, //void
    public static native void glMultiTexCoord1iv(int ptarget, int[] pv, int offset_pv); //GLenum,const GLint*, //void
    public static native void glMultiTexCoord1s(int ptarget, short ps); //GLenum,GLshort, //void
    public static native void glMultiTexCoord1sv(int ptarget, short[] pv, int offset_pv); //GLenum,const GLshort*, //void
    public static native void glMultiTexCoord2d(int ptarget, double ps, double pt); //GLenum,GLdouble,GLdouble, //void
    public static native void glMultiTexCoord2dv(int ptarget, double[] pv, int offset_pv); //GLenum,const GLdouble*, //void
    public static native void glMultiTexCoord2f(int ptarget, float ps, float pt); //GLenum,GLfloat,GLfloat, //void
    public static native void glMultiTexCoord2fv(int ptarget, float[] pv, int offset_pv); //GLenum,const GLfloat*, //void
    public static native void glMultiTexCoord2i(int ptarget, int ps, int pt); //GLenum,GLint,GLint, //void
    public static native void glMultiTexCoord2iv(int ptarget, int[] pv, int offset_pv); //GLenum,const GLint*, //void
    public static native void glMultiTexCoord2s(int ptarget, short ps, short pt); //GLenum,GLshort,GLshort, //void
    public static native void glMultiTexCoord2sv(int ptarget, short[] pv, int offset_pv); //GLenum,const GLshort*, //void
    public static native void glMultiTexCoord3d(int ptarget, double ps, double pt, double pr); //GLenum,GLdouble,GLdouble,GLdouble, //void
    public static native void glMultiTexCoord3dv(int ptarget, double[] pv, int offset_pv); //GLenum,const GLdouble*, //void
    public static native void glMultiTexCoord3f(int ptarget, float ps, float pt, float pr); //GLenum,GLfloat,GLfloat,GLfloat, //void
    public static native void glMultiTexCoord3fv(int ptarget, float[] pv, int offset_pv); //GLenum,const GLfloat*, //void
    public static native void glMultiTexCoord3i(int ptarget, int ps, int pt, int pr); //GLenum,GLint,GLint,GLint, //void
    public static native void glMultiTexCoord3iv(int ptarget, int[] pv, int offset_pv); //GLenum,const GLint*, //void
    public static native void glMultiTexCoord3s(int ptarget, short ps, short pt, short pr); //GLenum,GLshort,GLshort,GLshort, //void
    public static native void glMultiTexCoord3sv(int ptarget, short[] pv, int offset_pv); //GLenum,const GLshort*, //void
    public static native void glMultiTexCoord4d(int ptarget, double ps, double pt, double pr, double pq); //GLenum,GLdouble,GLdouble,GLdouble,GLdouble, //void
    public static native void glMultiTexCoord4dv(int ptarget, double[] pv, int offset_pv); //GLenum,const GLdouble*, //void
    public static native void glMultiTexCoord4f(int ptarget, float ps, float pt, float pr, float pq); //GLenum,GLfloat,GLfloat,GLfloat,GLfloat, //void
    public static native void glMultiTexCoord4fv(int ptarget, float[] pv, int offset_pv); //GLenum,const GLfloat*, //void
    public static native void glMultiTexCoord4i(int ptarget, int ps, int pt, int pr, int pq); //GLenum,GLint,GLint,GLint,GLint, //void
    public static native void glMultiTexCoord4iv(int ptarget, int[] pv, int offset_pv); //GLenum,const GLint*, //void
    public static native void glMultiTexCoord4s(int ptarget, short ps, short pt, short pr, short pq); //GLenum,GLshort,GLshort,GLshort,GLshort, //void
    public static native void glMultiTexCoord4sv(int ptarget, short[] pv, int offset_pv); //GLenum,const GLshort*, //void
    public static native void glLoadTransposeMatrixf(float[] pm, int offset_pm); //const GLfloat*, //void
    public static native void glLoadTransposeMatrixd(double[] pm, int offset_pm); //const GLdouble*, //void
    public static native void glMultTransposeMatrixf(float[] pm, int offset_pm); //const GLfloat*, //void
    public static native void glMultTransposeMatrixd(double[] pm, int offset_pm); //const GLdouble*, //void
    public static native void glBlendFuncSeparate(int psfactorRGB, int pdfactorRGB, int psfactorAlpha, int pdfactorAlpha); //GLenum,GLenum,GLenum,GLenum, //void
    public static native void glMultiDrawArrays(int pmode, int[] pfirst, int offset_pfirst, int[] pcount, int offset_pcount, int pdrawcount); //GLenum,const GLint*,const GLsizei*,GLsizei, //void
    public static native void glMultiDrawElements(int pmode, int[] pcount, int offset_pcount, int ptype, Object[] pindices, int pdrawcount); //GLenum,const GLsizei*,GLenum,const void*const*,GLsizei, //void
    public static native void glPointParameterf(int ppname, float pparam); //GLenum,GLfloat, //void
    public static native void glPointParameterfv(int ppname, float[] pparams, int offset_pparams); //GLenum,const GLfloat*, //void
    public static native void glPointParameteri(int ppname, int pparam); //GLenum,GLint, //void
    public static native void glPointParameteriv(int ppname, int[] pparams, int offset_pparams); //GLenum,const GLint*, //void
    public static native void glFogCoordf(float pcoord); //GLfloat, //void
    public static native void glFogCoordfv(float[] pcoord, int offset_pcoord); //const GLfloat*, //void
    public static native void glFogCoordd(double pcoord); //GLdouble, //void
    public static native void glFogCoorddv(double[] pcoord, int offset_pcoord); //const GLdouble*, //void
    public static native void glFogCoordPointer(int ptype, int pstride, Object ppointer, int offset_ppointer); //GLenum,GLsizei,const void*, //void
    public static native void glSecondaryColor3b(byte pred, byte pgreen, byte pblue); //GLbyte,GLbyte,GLbyte, //void
    public static native void glSecondaryColor3bv(byte[] pv, int offset_pv); //const GLbyte*, //void
    public static native void glSecondaryColor3d(double pred, double pgreen, double pblue); //GLdouble,GLdouble,GLdouble, //void
    public static native void glSecondaryColor3dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glSecondaryColor3f(float pred, float pgreen, float pblue); //GLfloat,GLfloat,GLfloat, //void
    public static native void glSecondaryColor3fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glSecondaryColor3i(int pred, int pgreen, int pblue); //GLint,GLint,GLint, //void
    public static native void glSecondaryColor3iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glSecondaryColor3s(short pred, short pgreen, short pblue); //GLshort,GLshort,GLshort, //void
    public static native void glSecondaryColor3sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glSecondaryColor3ub(byte pred, byte pgreen, byte pblue); //GLubyte,GLubyte,GLubyte, //void
    public static native void glSecondaryColor3ubv(byte[] pv, int offset_pv); //const GLubyte*, //void
    public static native void glSecondaryColor3ui(int pred, int pgreen, int pblue); //GLuint,GLuint,GLuint, //void
    public static native void glSecondaryColor3uiv(int[] pv, int offset_pv); //const GLuint*, //void
    public static native void glSecondaryColor3us(short pred, short pgreen, short pblue); //GLushort,GLushort,GLushort, //void
    public static native void glSecondaryColor3usv(short[] pv, int offset_pv); //const GLushort*, //void
    public static native void glSecondaryColorPointer(int psize, int ptype, int pstride, Object ppointer, int offset_ppointer); //GLint,GLenum,GLsizei,const void*, //void
    public static native void glWindowPos2d(double px, double py); //GLdouble,GLdouble, //void
    public static native void glWindowPos2dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glWindowPos2f(float px, float py); //GLfloat,GLfloat, //void
    public static native void glWindowPos2fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glWindowPos2i(int px, int py); //GLint,GLint, //void
    public static native void glWindowPos2iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glWindowPos2s(short px, short py); //GLshort,GLshort, //void
    public static native void glWindowPos2sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glWindowPos3d(double px, double py, double pz); //GLdouble,GLdouble,GLdouble, //void
    public static native void glWindowPos3dv(double[] pv, int offset_pv); //const GLdouble*, //void
    public static native void glWindowPos3f(float px, float py, float pz); //GLfloat,GLfloat,GLfloat, //void
    public static native void glWindowPos3fv(float[] pv, int offset_pv); //const GLfloat*, //void
    public static native void glWindowPos3i(int px, int py, int pz); //GLint,GLint,GLint, //void
    public static native void glWindowPos3iv(int[] pv, int offset_pv); //const GLint*, //void
    public static native void glWindowPos3s(short px, short py, short pz); //GLshort,GLshort,GLshort, //void
    public static native void glWindowPos3sv(short[] pv, int offset_pv); //const GLshort*, //void
    public static native void glBlendColor(float pred, float pgreen, float pblue, float palpha); //GLfloat,GLfloat,GLfloat,GLfloat, //void
    public static native void glBlendEquation(int pmode); //GLenum, //void
    public static native void glGenQueries(int pn, int[] pids, int offset_pids); //GLsizei,GLuint*, //void
    public static native void glDeleteQueries(int pn, int[] pids, int offset_pids); //GLsizei,const GLuint*, //void
    public static native int glIsQuery(int pid); //GLuint, //GLboolean
    public static native void glBeginQuery(int ptarget, int pid); //GLenum,GLuint, //void
    public static native void glEndQuery(int ptarget); //GLenum, //void
    public static native void glGetQueryiv(int ptarget, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,GLint*, //void
    public static native void glGetQueryObjectiv(int pid, int ppname, int[] pparams, int offset_pparams); //GLuint,GLenum,GLint*, //void
    public static native void glGetQueryObjectuiv(int pid, int ppname, int[] pparams, int offset_pparams); //GLuint,GLenum,GLuint*, //void
    public static native void glBindBuffer(int ptarget, int pbuffer); //GLenum,GLuint, //void
    public static native void glDeleteBuffers(int pn, int[] pbuffers, int offset_pbuffers); //GLsizei,const GLuint*, //void
    public static native void glGenBuffers(int pn, int[] pbuffers, int offset_pbuffers); //GLsizei,GLuint*, //void
    public static native int glIsBuffer(int pbuffer); //GLuint, //GLboolean
    public static native void glBufferData(int ptarget, long psize, Object pdata, int offset_pdata, int pusage); //GLenum,GLsizeiptr,const void*,GLenum, //void
    public static native void glBufferSubData(int ptarget, long poffset, long psize, Object pdata, int offset_pdata); //GLenum,GLintptr,GLsizeiptr,const void*, //void
    public static native void glGetBufferSubData(int ptarget, long poffset, long psize, Object pdata, int offset_pdata); //GLenum,GLintptr,GLsizeiptr,void*, //void
    public static native long glMapBuffer(int ptarget, int paccess); //GLenum,GLenum, //void*
    public static native int glUnmapBuffer(int ptarget); //GLenum, //GLboolean
    public static native void glGetBufferParameteriv(int ptarget, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,GLint*, //void
    public static native void glGetBufferPointerv(int ptarget, int ppname, Object[] pparams); //GLenum,GLenum,void**, //void
    public static native void glBlendEquationSeparate(int pmodeRGB, int pmodeAlpha); //GLenum,GLenum, //void
    public static native void glDrawBuffers(int pn, int[] pbufs, int offset_pbufs); //GLsizei,const GLenum*, //void
    public static native void glStencilOpSeparate(int pface, int psfail, int pdpfail, int pdppass); //GLenum,GLenum,GLenum,GLenum, //void
    public static native void glStencilFuncSeparate(int pface, int pfunc, int pref, int pmask); //GLenum,GLenum,GLint,GLuint, //void
    public static native void glStencilMaskSeparate(int pface, int pmask); //GLenum,GLuint, //void
    public static native void glAttachShader(int pprogram, int pshader); //GLuint,GLuint, //void
    public static native void glBindAttribLocation(int pprogram, int pindex, String pname); //GLuint,GLuint,const GLchar*, //void
    public static native void glCompileShader(int pshader); //GLuint, //void
    public static native int glCreateProgram(); // //GLuint
    public static native int glCreateShader(int ptype); //GLenum, //GLuint
    public static native void glDeleteProgram(int pprogram); //GLuint, //void
    public static native void glDeleteShader(int pshader); //GLuint, //void
    public static native void glDetachShader(int pprogram, int pshader); //GLuint,GLuint, //void
    public static native void glDisableVertexAttribArray(int pindex); //GLuint, //void
    public static native void glEnableVertexAttribArray(int pindex); //GLuint, //void
    public static native void glGetActiveAttrib(int pprogram, int pindex, int pbufSize, int[] plength, int offset_plength, int[] psize, int offset_psize, int[] ptype, int offset_ptype, String pname); //GLuint,GLuint,GLsizei,GLsizei*,GLint*,GLenum*,GLchar*, //void
    public static native void glGetActiveUniform(int pprogram, int pindex, int pbufSize, int[] plength, int offset_plength, int[] psize, int offset_psize, int[] ptype, int offset_ptype, String pname); //GLuint,GLuint,GLsizei,GLsizei*,GLint*,GLenum*,GLchar*, //void
    public static native void glGetAttachedShaders(int pprogram, int pmaxCount, int[] pcount, int offset_pcount, int[] pshaders, int offset_pshaders); //GLuint,GLsizei,GLsizei*,GLuint*, //void
    public static native int glGetAttribLocation(int pprogram, String pname); //GLuint,const GLchar*, //GLint
    public static native void glGetProgramiv(int pprogram, int ppname, int[] pparams, int offset_pparams); //GLuint,GLenum,GLint*, //void
    public static native void glGetProgramInfoLog(int pprogram, int pbufSize, int[] plength, int offset_plength, String pinfoLog); //GLuint,GLsizei,GLsizei*,GLchar*, //void
    public static native void glGetShaderiv(int pshader, int ppname, int[] pparams, int offset_pparams); //GLuint,GLenum,GLint*, //void
    public static native void glGetShaderInfoLog(int pshader, int pbufSize, int[] plength, int offset_plength, String pinfoLog); //GLuint,GLsizei,GLsizei*,GLchar*, //void
    public static native void glGetShaderSource(int pshader, int pbufSize, int[] plength, int offset_plength, String psource); //GLuint,GLsizei,GLsizei*,GLchar*, //void
    public static native int glGetUniformLocation(int pprogram, String pname); //GLuint,const GLchar*, //GLint
    public static native void glGetUniformfv(int pprogram, int plocation, float[] pparams, int offset_pparams); //GLuint,GLint,GLfloat*, //void
    public static native void glGetUniformiv(int pprogram, int plocation, int[] pparams, int offset_pparams); //GLuint,GLint,GLint*, //void
    public static native void glGetVertexAttribdv(int pindex, int ppname, double[] pparams, int offset_pparams); //GLuint,GLenum,GLdouble*, //void
    public static native void glGetVertexAttribfv(int pindex, int ppname, float[] pparams, int offset_pparams); //GLuint,GLenum,GLfloat*, //void
    public static native void glGetVertexAttribiv(int pindex, int ppname, int[] pparams, int offset_pparams); //GLuint,GLenum,GLint*, //void
    public static native void glGetVertexAttribPointerv(int pindex, int ppname, Object[] ppointer); //GLuint,GLenum,void**, //void
    public static native int glIsProgram(int pprogram); //GLuint, //GLboolean
    public static native int glIsShader(int pshader); //GLuint, //GLboolean
    public static native void glLinkProgram(int pprogram); //GLuint, //void
    public static native void glShaderSource(int pshader, int pcount, String[] pstring, int[] plength, int offset_plength); //GLuint,GLsizei,const GLchar*const*,const GLint*, //void
    public static native void glUseProgram(int pprogram); //GLuint, //void
    public static native void glUniform1f(int plocation, float pv0); //GLint,GLfloat, //void
    public static native void glUniform2f(int plocation, float pv0, float pv1); //GLint,GLfloat,GLfloat, //void
    public static native void glUniform3f(int plocation, float pv0, float pv1, float pv2); //GLint,GLfloat,GLfloat,GLfloat, //void
    public static native void glUniform4f(int plocation, float pv0, float pv1, float pv2, float pv3); //GLint,GLfloat,GLfloat,GLfloat,GLfloat, //void
    public static native void glUniform1i(int plocation, int pv0); //GLint,GLint, //void
    public static native void glUniform2i(int plocation, int pv0, int pv1); //GLint,GLint,GLint, //void
    public static native void glUniform3i(int plocation, int pv0, int pv1, int pv2); //GLint,GLint,GLint,GLint, //void
    public static native void glUniform4i(int plocation, int pv0, int pv1, int pv2, int pv3); //GLint,GLint,GLint,GLint,GLint, //void
    public static native void glUniform1fv(int plocation, int pcount, float[] pvalue, int offset_pvalue); //GLint,GLsizei,const GLfloat*, //void
    public static native void glUniform2fv(int plocation, int pcount, float[] pvalue, int offset_pvalue); //GLint,GLsizei,const GLfloat*, //void
    public static native void glUniform3fv(int plocation, int pcount, float[] pvalue, int offset_pvalue); //GLint,GLsizei,const GLfloat*, //void
    public static native void glUniform4fv(int plocation, int pcount, float[] pvalue, int offset_pvalue); //GLint,GLsizei,const GLfloat*, //void
    public static native void glUniform1iv(int plocation, int pcount, int[] pvalue, int offset_pvalue); //GLint,GLsizei,const GLint*, //void
    public static native void glUniform2iv(int plocation, int pcount, int[] pvalue, int offset_pvalue); //GLint,GLsizei,const GLint*, //void
    public static native void glUniform3iv(int plocation, int pcount, int[] pvalue, int offset_pvalue); //GLint,GLsizei,const GLint*, //void
    public static native void glUniform4iv(int plocation, int pcount, int[] pvalue, int offset_pvalue); //GLint,GLsizei,const GLint*, //void
    public static native void glUniformMatrix2fv(int plocation, int pcount, int ptranspose, float[] pvalue, int offset_pvalue); //GLint,GLsizei,GLboolean,const GLfloat*, //void
    public static native void glUniformMatrix3fv(int plocation, int pcount, int ptranspose, float[] pvalue, int offset_pvalue); //GLint,GLsizei,GLboolean,const GLfloat*, //void
    public static native void glUniformMatrix4fv(int plocation, int pcount, int ptranspose, float[] pvalue, int offset_pvalue); //GLint,GLsizei,GLboolean,const GLfloat*, //void
    public static native void glValidateProgram(int pprogram); //GLuint, //void
    public static native void glVertexAttrib1d(int pindex, double px); //GLuint,GLdouble, //void
    public static native void glVertexAttrib1dv(int pindex, double[] pv, int offset_pv); //GLuint,const GLdouble*, //void
    public static native void glVertexAttrib1f(int pindex, float px); //GLuint,GLfloat, //void
    public static native void glVertexAttrib1fv(int pindex, float[] pv, int offset_pv); //GLuint,const GLfloat*, //void
    public static native void glVertexAttrib1s(int pindex, short px); //GLuint,GLshort, //void
    public static native void glVertexAttrib1sv(int pindex, short[] pv, int offset_pv); //GLuint,const GLshort*, //void
    public static native void glVertexAttrib2d(int pindex, double px, double py); //GLuint,GLdouble,GLdouble, //void
    public static native void glVertexAttrib2dv(int pindex, double[] pv, int offset_pv); //GLuint,const GLdouble*, //void
    public static native void glVertexAttrib2f(int pindex, float px, float py); //GLuint,GLfloat,GLfloat, //void
    public static native void glVertexAttrib2fv(int pindex, float[] pv, int offset_pv); //GLuint,const GLfloat*, //void
    public static native void glVertexAttrib2s(int pindex, short px, short py); //GLuint,GLshort,GLshort, //void
    public static native void glVertexAttrib2sv(int pindex, short[] pv, int offset_pv); //GLuint,const GLshort*, //void
    public static native void glVertexAttrib3d(int pindex, double px, double py, double pz); //GLuint,GLdouble,GLdouble,GLdouble, //void
    public static native void glVertexAttrib3dv(int pindex, double[] pv, int offset_pv); //GLuint,const GLdouble*, //void
    public static native void glVertexAttrib3f(int pindex, float px, float py, float pz); //GLuint,GLfloat,GLfloat,GLfloat, //void
    public static native void glVertexAttrib3fv(int pindex, float[] pv, int offset_pv); //GLuint,const GLfloat*, //void
    public static native void glVertexAttrib3s(int pindex, short px, short py, short pz); //GLuint,GLshort,GLshort,GLshort, //void
    public static native void glVertexAttrib3sv(int pindex, short[] pv, int offset_pv); //GLuint,const GLshort*, //void
    public static native void glVertexAttrib4Nbv(int pindex, byte[] pv, int offset_pv); //GLuint,const GLbyte*, //void
    public static native void glVertexAttrib4Niv(int pindex, int[] pv, int offset_pv); //GLuint,const GLint*, //void
    public static native void glVertexAttrib4Nsv(int pindex, short[] pv, int offset_pv); //GLuint,const GLshort*, //void
    public static native void glVertexAttrib4Nub(int pindex, byte px, byte py, byte pz, byte pw); //GLuint,GLubyte,GLubyte,GLubyte,GLubyte, //void
    public static native void glVertexAttrib4Nubv(int pindex, byte[] pv, int offset_pv); //GLuint,const GLubyte*, //void
    public static native void glVertexAttrib4Nuiv(int pindex, int[] pv, int offset_pv); //GLuint,const GLuint*, //void
    public static native void glVertexAttrib4Nusv(int pindex, short[] pv, int offset_pv); //GLuint,const GLushort*, //void
    public static native void glVertexAttrib4bv(int pindex, byte[] pv, int offset_pv); //GLuint,const GLbyte*, //void
    public static native void glVertexAttrib4d(int pindex, double px, double py, double pz, double pw); //GLuint,GLdouble,GLdouble,GLdouble,GLdouble, //void
    public static native void glVertexAttrib4dv(int pindex, double[] pv, int offset_pv); //GLuint,const GLdouble*, //void
    public static native void glVertexAttrib4f(int pindex, float px, float py, float pz, float pw); //GLuint,GLfloat,GLfloat,GLfloat,GLfloat, //void
    public static native void glVertexAttrib4fv(int pindex, float[] pv, int offset_pv); //GLuint,const GLfloat*, //void
    public static native void glVertexAttrib4iv(int pindex, int[] pv, int offset_pv); //GLuint,const GLint*, //void
    public static native void glVertexAttrib4s(int pindex, short px, short py, short pz, short pw); //GLuint,GLshort,GLshort,GLshort,GLshort, //void
    public static native void glVertexAttrib4sv(int pindex, short[] pv, int offset_pv); //GLuint,const GLshort*, //void
    public static native void glVertexAttrib4ubv(int pindex, byte[] pv, int offset_pv); //GLuint,const GLubyte*, //void
    public static native void glVertexAttrib4uiv(int pindex, int[] pv, int offset_pv); //GLuint,const GLuint*, //void
    public static native void glVertexAttrib4usv(int pindex, short[] pv, int offset_pv); //GLuint,const GLushort*, //void
    public static native void glVertexAttribPointer(int pindex, int psize, int ptype, int pnormalized, int pstride, Object ppointer, int offset_ppointer); //GLuint,GLint,GLenum,GLboolean,GLsizei,const void*, //void
    public static native void glUniformMatrix2x3fv(int plocation, int pcount, int ptranspose, float[] pvalue, int offset_pvalue); //GLint,GLsizei,GLboolean,const GLfloat*, //void
    public static native void glUniformMatrix3x2fv(int plocation, int pcount, int ptranspose, float[] pvalue, int offset_pvalue); //GLint,GLsizei,GLboolean,const GLfloat*, //void
    public static native void glUniformMatrix2x4fv(int plocation, int pcount, int ptranspose, float[] pvalue, int offset_pvalue); //GLint,GLsizei,GLboolean,const GLfloat*, //void
    public static native void glUniformMatrix4x2fv(int plocation, int pcount, int ptranspose, float[] pvalue, int offset_pvalue); //GLint,GLsizei,GLboolean,const GLfloat*, //void
    public static native void glUniformMatrix3x4fv(int plocation, int pcount, int ptranspose, float[] pvalue, int offset_pvalue); //GLint,GLsizei,GLboolean,const GLfloat*, //void
    public static native void glUniformMatrix4x3fv(int plocation, int pcount, int ptranspose, float[] pvalue, int offset_pvalue); //GLint,GLsizei,GLboolean,const GLfloat*, //void
    public static native void glColorMaski(int pindex, int pr, int pg, int pb, int pa); //GLuint,GLboolean,GLboolean,GLboolean,GLboolean, //void
    public static native void glGetBooleani_v(int ptarget, int pindex, int[] pdata, int offset_pdata); //GLenum,GLuint,GLboolean*, //void
    public static native void glGetIntegeri_v(int ptarget, int pindex, int[] pdata, int offset_pdata); //GLenum,GLuint,GLint*, //void
    public static native void glEnablei(int ptarget, int pindex); //GLenum,GLuint, //void
    public static native void glDisablei(int ptarget, int pindex); //GLenum,GLuint, //void
    public static native int glIsEnabledi(int ptarget, int pindex); //GLenum,GLuint, //GLboolean
    public static native void glBeginTransformFeedback(int pprimitiveMode); //GLenum, //void
    public static native void glEndTransformFeedback(); // //void
    public static native void glBindBufferRange(int ptarget, int pindex, int pbuffer, long poffset, long psize); //GLenum,GLuint,GLuint,GLintptr,GLsizeiptr, //void
    public static native void glBindBufferBase(int ptarget, int pindex, int pbuffer); //GLenum,GLuint,GLuint, //void
    public static native void glTransformFeedbackVaryings(int pprogram, int pcount, String[] pvaryings, int pbufferMode); //GLuint,GLsizei,const GLchar*const*,GLenum, //void
    public static native void glGetTransformFeedbackVarying(int pprogram, int pindex, int pbufSize, int[] plength, int offset_plength, int[] psize, int offset_psize, int[] ptype, int offset_ptype, String pname); //GLuint,GLuint,GLsizei,GLsizei*,GLsizei*,GLenum*,GLchar*, //void
    public static native void glClampColor(int ptarget, int pclamp); //GLenum,GLenum, //void
    public static native void glBeginConditionalRender(int pid, int pmode); //GLuint,GLenum, //void
    public static native void glEndConditionalRender(); // //void
    public static native void glVertexAttribIPointer(int pindex, int psize, int ptype, int pstride, Object ppointer, int offset_ppointer); //GLuint,GLint,GLenum,GLsizei,const void*, //void
    public static native void glGetVertexAttribIiv(int pindex, int ppname, int[] pparams, int offset_pparams); //GLuint,GLenum,GLint*, //void
    public static native void glGetVertexAttribIuiv(int pindex, int ppname, int[] pparams, int offset_pparams); //GLuint,GLenum,GLuint*, //void
    public static native void glVertexAttribI1i(int pindex, int px); //GLuint,GLint, //void
    public static native void glVertexAttribI2i(int pindex, int px, int py); //GLuint,GLint,GLint, //void
    public static native void glVertexAttribI3i(int pindex, int px, int py, int pz); //GLuint,GLint,GLint,GLint, //void
    public static native void glVertexAttribI4i(int pindex, int px, int py, int pz, int pw); //GLuint,GLint,GLint,GLint,GLint, //void
    public static native void glVertexAttribI1ui(int pindex, int px); //GLuint,GLuint, //void
    public static native void glVertexAttribI2ui(int pindex, int px, int py); //GLuint,GLuint,GLuint, //void
    public static native void glVertexAttribI3ui(int pindex, int px, int py, int pz); //GLuint,GLuint,GLuint,GLuint, //void
    public static native void glVertexAttribI4ui(int pindex, int px, int py, int pz, int pw); //GLuint,GLuint,GLuint,GLuint,GLuint, //void
    public static native void glVertexAttribI1iv(int pindex, int[] pv, int offset_pv); //GLuint,const GLint*, //void
    public static native void glVertexAttribI2iv(int pindex, int[] pv, int offset_pv); //GLuint,const GLint*, //void
    public static native void glVertexAttribI3iv(int pindex, int[] pv, int offset_pv); //GLuint,const GLint*, //void
    public static native void glVertexAttribI4iv(int pindex, int[] pv, int offset_pv); //GLuint,const GLint*, //void
    public static native void glVertexAttribI1uiv(int pindex, int[] pv, int offset_pv); //GLuint,const GLuint*, //void
    public static native void glVertexAttribI2uiv(int pindex, int[] pv, int offset_pv); //GLuint,const GLuint*, //void
    public static native void glVertexAttribI3uiv(int pindex, int[] pv, int offset_pv); //GLuint,const GLuint*, //void
    public static native void glVertexAttribI4uiv(int pindex, int[] pv, int offset_pv); //GLuint,const GLuint*, //void
    public static native void glVertexAttribI4bv(int pindex, byte[] pv, int offset_pv); //GLuint,const GLbyte*, //void
    public static native void glVertexAttribI4sv(int pindex, short[] pv, int offset_pv); //GLuint,const GLshort*, //void
    public static native void glVertexAttribI4ubv(int pindex, byte[] pv, int offset_pv); //GLuint,const GLubyte*, //void
    public static native void glVertexAttribI4usv(int pindex, short[] pv, int offset_pv); //GLuint,const GLushort*, //void
    public static native void glGetUniformuiv(int pprogram, int plocation, int[] pparams, int offset_pparams); //GLuint,GLint,GLuint*, //void
    public static native void glBindFragDataLocation(int pprogram, int pcolor, String pname); //GLuint,GLuint,const GLchar*, //void
    public static native int glGetFragDataLocation(int pprogram, String pname); //GLuint,const GLchar*, //GLint
    public static native void glUniform1ui(int plocation, int pv0); //GLint,GLuint, //void
    public static native void glUniform2ui(int plocation, int pv0, int pv1); //GLint,GLuint,GLuint, //void
    public static native void glUniform3ui(int plocation, int pv0, int pv1, int pv2); //GLint,GLuint,GLuint,GLuint, //void
    public static native void glUniform4ui(int plocation, int pv0, int pv1, int pv2, int pv3); //GLint,GLuint,GLuint,GLuint,GLuint, //void
    public static native void glUniform1uiv(int plocation, int pcount, int[] pvalue, int offset_pvalue); //GLint,GLsizei,const GLuint*, //void
    public static native void glUniform2uiv(int plocation, int pcount, int[] pvalue, int offset_pvalue); //GLint,GLsizei,const GLuint*, //void
    public static native void glUniform3uiv(int plocation, int pcount, int[] pvalue, int offset_pvalue); //GLint,GLsizei,const GLuint*, //void
    public static native void glUniform4uiv(int plocation, int pcount, int[] pvalue, int offset_pvalue); //GLint,GLsizei,const GLuint*, //void
    public static native void glTexParameterIiv(int ptarget, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,const GLint*, //void
    public static native void glTexParameterIuiv(int ptarget, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,const GLuint*, //void
    public static native void glGetTexParameterIiv(int ptarget, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,GLint*, //void
    public static native void glGetTexParameterIuiv(int ptarget, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,GLuint*, //void
    public static native void glClearBufferiv(int pbuffer, int pdrawbuffer, int[] pvalue, int offset_pvalue); //GLenum,GLint,const GLint*, //void
    public static native void glClearBufferuiv(int pbuffer, int pdrawbuffer, int[] pvalue, int offset_pvalue); //GLenum,GLint,const GLuint*, //void
    public static native void glClearBufferfv(int pbuffer, int pdrawbuffer, float[] pvalue, int offset_pvalue); //GLenum,GLint,const GLfloat*, //void
    public static native void glClearBufferfi(int pbuffer, int pdrawbuffer, float pdepth, int pstencil); //GLenum,GLint,GLfloat,GLint, //void
    public static native byte[] glGetStringi(int pname, int pindex); //GLenum,GLuint, //const GLubyte*
    public static native int glIsRenderbuffer(int prenderbuffer); //GLuint, //GLboolean
    public static native void glBindRenderbuffer(int ptarget, int prenderbuffer); //GLenum,GLuint, //void
    public static native void glDeleteRenderbuffers(int pn, int[] prenderbuffers, int offset_prenderbuffers); //GLsizei,const GLuint*, //void
    public static native void glGenRenderbuffers(int pn, int[] prenderbuffers, int offset_prenderbuffers); //GLsizei,GLuint*, //void
    public static native void glRenderbufferStorage(int ptarget, int pinternalformat, int pwidth, int pheight); //GLenum,GLenum,GLsizei,GLsizei, //void
    public static native void glGetRenderbufferParameteriv(int ptarget, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,GLint*, //void
    public static native int glIsFramebuffer(int pframebuffer); //GLuint, //GLboolean
    public static native void glBindFramebuffer(int ptarget, int pframebuffer); //GLenum,GLuint, //void
    public static native void glDeleteFramebuffers(int pn, int[] pframebuffers, int offset_pframebuffers); //GLsizei,const GLuint*, //void
    public static native void glGenFramebuffers(int pn, int[] pframebuffers, int offset_pframebuffers); //GLsizei,GLuint*, //void
    public static native int glCheckFramebufferStatus(int ptarget); //GLenum, //GLenum
    public static native void glFramebufferTexture1D(int ptarget, int pattachment, int ptextarget, int ptexture, int plevel); //GLenum,GLenum,GLenum,GLuint,GLint, //void
    public static native void glFramebufferTexture2D(int ptarget, int pattachment, int ptextarget, int ptexture, int plevel); //GLenum,GLenum,GLenum,GLuint,GLint, //void
    public static native void glFramebufferTexture3D(int ptarget, int pattachment, int ptextarget, int ptexture, int plevel, int pzoffset); //GLenum,GLenum,GLenum,GLuint,GLint,GLint, //void
    public static native void glFramebufferRenderbuffer(int ptarget, int pattachment, int prenderbuffertarget, int prenderbuffer); //GLenum,GLenum,GLenum,GLuint, //void
    public static native void glGetFramebufferAttachmentParameteriv(int ptarget, int pattachment, int ppname, int[] pparams, int offset_pparams); //GLenum,GLenum,GLenum,GLint*, //void
    public static native void glGenerateMipmap(int ptarget); //GLenum, //void
    public static native void glBlitFramebuffer(int psrcX0, int psrcY0, int psrcX1, int psrcY1, int pdstX0, int pdstY0, int pdstX1, int pdstY1, int pmask, int pfilter); //GLint,GLint,GLint,GLint,GLint,GLint,GLint,GLint,GLbitfield,GLenum, //void
    public static native void glRenderbufferStorageMultisample(int ptarget, int psamples, int pinternalformat, int pwidth, int pheight); //GLenum,GLsizei,GLenum,GLsizei,GLsizei, //void
    public static native void glFramebufferTextureLayer(int ptarget, int pattachment, int ptexture, int plevel, int player); //GLenum,GLenum,GLuint,GLint,GLint, //void
    public static native long glMapBufferRange(int ptarget, long poffset, long plength, int paccess); //GLenum,GLintptr,GLsizeiptr,GLbitfield, //void*
    public static native void glFlushMappedBufferRange(int ptarget, long poffset, long plength); //GLenum,GLintptr,GLsizeiptr, //void
    public static native void glBindVertexArray(int parray); //GLuint, //void
    public static native void glDeleteVertexArrays(int pn, int[] parrays, int offset_parrays); //GLsizei,const GLuint*, //void
    public static native void glGenVertexArrays(int pn, int[] parrays, int offset_parrays); //GLsizei,GLuint*, //void
    public static native int glIsVertexArray(int parray); //GLuint, //GLboolean
    public static native void glDrawArraysInstanced(int pmode, int pfirst, int pcount, int pinstancecount); //GLenum,GLint,GLsizei,GLsizei, //void
    public static native void glDrawElementsInstanced(int pmode, int pcount, int ptype, Object pindices, int offset_pindices, int pinstancecount); //GLenum,GLsizei,GLenum,const void*,GLsizei, //void
    public static native void glTexBuffer(int ptarget, int pinternalformat, int pbuffer); //GLenum,GLenum,GLuint, //void
    public static native void glPrimitiveRestartIndex(int pindex); //GLuint, //void
    public static native void glCopyBufferSubData(int preadTarget, int pwriteTarget, long preadOffset, long pwriteOffset, long psize); //GLenum,GLenum,GLintptr,GLintptr,GLsizeiptr, //void
    public static native void glGetUniformIndices(int pprogram, int puniformCount, String[] puniformNames, int[] puniformIndices, int offset_puniformIndices); //GLuint,GLsizei,const GLchar*const*,GLuint*, //void
    public static native void glGetActiveUniformsiv(int pprogram, int puniformCount, int[] puniformIndices, int offset_puniformIndices, int ppname, int[] pparams, int offset_pparams); //GLuint,GLsizei,const GLuint*,GLenum,GLint*, //void
    public static native void glGetActiveUniformName(int pprogram, int puniformIndex, int pbufSize, int[] plength, int offset_plength, String puniformName); //GLuint,GLuint,GLsizei,GLsizei*,GLchar*, //void
    public static native int glGetUniformBlockIndex(int pprogram, String puniformBlockName); //GLuint,const GLchar*, //GLuint
    public static native void glGetActiveUniformBlockiv(int pprogram, int puniformBlockIndex, int ppname, int[] pparams, int offset_pparams); //GLuint,GLuint,GLenum,GLint*, //void
    public static native void glGetActiveUniformBlockName(int pprogram, int puniformBlockIndex, int pbufSize, int[] plength, int offset_plength, String puniformBlockName); //GLuint,GLuint,GLsizei,GLsizei*,GLchar*, //void
    public static native void glUniformBlockBinding(int pprogram, int puniformBlockIndex, int puniformBlockBinding); //GLuint,GLuint,GLuint, //void
    public static native void glDrawElementsBaseVertex(int pmode, int pcount, int ptype, Object pindices, int offset_pindices, int pbasevertex); //GLenum,GLsizei,GLenum,const void*,GLint, //void
    public static native void glDrawRangeElementsBaseVertex(int pmode, int pstart, int pend, int pcount, int ptype, Object pindices, int offset_pindices, int pbasevertex); //GLenum,GLuint,GLuint,GLsizei,GLenum,const void*,GLint, //void
    public static native void glDrawElementsInstancedBaseVertex(int pmode, int pcount, int ptype, Object pindices, int offset_pindices, int pinstancecount, int pbasevertex); //GLenum,GLsizei,GLenum,const void*,GLsizei,GLint, //void
    public static native void glMultiDrawElementsBaseVertex(int pmode, int[] pcount, int offset_pcount, int ptype, Object[] pindices, int pdrawcount, int[] pbasevertex, int offset_pbasevertex); //GLenum,const GLsizei*,GLenum,const void*const*,GLsizei,const GLint*, //void
    public static native void glProvokingVertex(int pmode); //GLenum, //void
    public static native long glFenceSync(int pcondition, int pflags); //GLenum,GLbitfield, //GLsync
    public static native int glIsSync(long psync); //GLsync, //GLboolean
    public static native void glDeleteSync(long psync); //GLsync, //void
    public static native int glClientWaitSync(long psync, int pflags, long ptimeout); //GLsync,GLbitfield,GLuint64, //GLenum
    public static native void glWaitSync(long psync, int pflags, long ptimeout); //GLsync,GLbitfield,GLuint64, //void
    public static native void glGetInteger64v(int ppname, long[] pdata, int offset_pdata); //GLenum,GLint64*, //void
    public static native void glGetSynciv(long psync, int ppname, int pbufSize, int[] plength, int offset_plength, int[] pvalues, int offset_pvalues); //GLsync,GLenum,GLsizei,GLsizei*,GLint*, //void
    public static native void glGetInteger64i_v(int ptarget, int pindex, long[] pdata, int offset_pdata); //GLenum,GLuint,GLint64*, //void
    public static native void glGetBufferParameteri64v(int ptarget, int ppname, long[] pparams, int offset_pparams); //GLenum,GLenum,GLint64*, //void
    public static native void glFramebufferTexture(int ptarget, int pattachment, int ptexture, int plevel); //GLenum,GLenum,GLuint,GLint, //void
    public static native void glTexImage2DMultisample(int ptarget, int psamples, int pinternalformat, int pwidth, int pheight, int pfixedsamplelocations); //GLenum,GLsizei,GLenum,GLsizei,GLsizei,GLboolean, //void
    public static native void glTexImage3DMultisample(int ptarget, int psamples, int pinternalformat, int pwidth, int pheight, int pdepth, int pfixedsamplelocations); //GLenum,GLsizei,GLenum,GLsizei,GLsizei,GLsizei,GLboolean, //void
    public static native void glGetMultisamplefv(int ppname, int pindex, float[] pval, int offset_pval); //GLenum,GLuint,GLfloat*, //void
    public static native void glSampleMaski(int pmaskNumber, int pmask); //GLuint,GLbitfield, //void
    public static native void glSampleCoverageARB(float pvalue, int pinvert); //GLfloat,GLboolean, //void
    public static native int glGetGraphicsResetStatusARB(); // //GLenum
    public static native void glGetnTexImageARB(int ptarget, int plevel, int pformat, int ptype, int pbufSize, Object pimg, int offset_pimg); //GLenum,GLint,GLenum,GLenum,GLsizei,void*, //void
    public static native void glReadnPixelsARB(int px, int py, int pwidth, int pheight, int pformat, int ptype, int pbufSize, Object pdata, int offset_pdata); //GLint,GLint,GLsizei,GLsizei,GLenum,GLenum,GLsizei,void*, //void
    public static native void glGetnCompressedTexImageARB(int ptarget, int plod, int pbufSize, Object pimg, int offset_pimg); //GLenum,GLint,GLsizei,void*, //void
    public static native void glGetnUniformfvARB(int pprogram, int plocation, int pbufSize, float[] pparams, int offset_pparams); //GLuint,GLint,GLsizei,GLfloat*, //void
    public static native void glGetnUniformivARB(int pprogram, int plocation, int pbufSize, int[] pparams, int offset_pparams); //GLuint,GLint,GLsizei,GLint*, //void
    public static native void glGetnUniformuivARB(int pprogram, int plocation, int pbufSize, int[] pparams, int offset_pparams); //GLuint,GLint,GLsizei,GLuint*, //void
    public static native void glGetnUniformdvARB(int pprogram, int plocation, int pbufSize, double[] pparams, int offset_pparams); //GLuint,GLint,GLsizei,GLdouble*, //void
    public static native void glGetnMapdvARB(int ptarget, int pquery, int pbufSize, double[] pv, int offset_pv); //GLenum,GLenum,GLsizei,GLdouble*, //void
    public static native void glGetnMapfvARB(int ptarget, int pquery, int pbufSize, float[] pv, int offset_pv); //GLenum,GLenum,GLsizei,GLfloat*, //void
    public static native void glGetnMapivARB(int ptarget, int pquery, int pbufSize, int[] pv, int offset_pv); //GLenum,GLenum,GLsizei,GLint*, //void
    public static native void glGetnPixelMapfvARB(int pmap, int pbufSize, float[] pvalues, int offset_pvalues); //GLenum,GLsizei,GLfloat*, //void
    public static native void glGetnPixelMapuivARB(int pmap, int pbufSize, int[] pvalues, int offset_pvalues); //GLenum,GLsizei,GLuint*, //void
    public static native void glGetnPixelMapusvARB(int pmap, int pbufSize, short[] pvalues, int offset_pvalues); //GLenum,GLsizei,GLushort*, //void
    public static native void glGetnPolygonStippleARB(int pbufSize, byte[] ppattern, int offset_ppattern); //GLsizei,GLubyte*, //void
    public static native void glGetnColorTableARB(int ptarget, int pformat, int ptype, int pbufSize, Object ptable, int offset_ptable); //GLenum,GLenum,GLenum,GLsizei,void*, //void
    public static native void glGetnConvolutionFilterARB(int ptarget, int pformat, int ptype, int pbufSize, Object pimage, int offset_pimage); //GLenum,GLenum,GLenum,GLsizei,void*, //void
    public static native void glGetnSeparableFilterARB(int ptarget, int pformat, int ptype, int prowBufSize, Object prow, int offset_prow, int pcolumnBufSize, Object pcolumn, int offset_pcolumn, Object pspan, int offset_pspan); //GLenum,GLenum,GLenum,GLsizei,void*,GLsizei,void*,void*, //void
    public static native void glGetnHistogramARB(int ptarget, int preset, int pformat, int ptype, int pbufSize, Object pvalues, int offset_pvalues); //GLenum,GLboolean,GLenum,GLenum,GLsizei,void*, //void
    public static native void glGetnMinmaxARB(int ptarget, int preset, int pformat, int ptype, int pbufSize, Object pvalues, int offset_pvalues); //GLenum,GLboolean,GLenum,GLenum,GLsizei,void*, //void
    public static native void glDebugMessageControl(int psource, int ptype, int pseverity, int pcount, int[] pids, int offset_pids, int penabled); //GLenum,GLenum,GLenum,GLsizei,const GLuint*,GLboolean, //void
    public static native void glDebugMessageInsert(int psource, int ptype, int pid, int pseverity, int plength, String pbuf); //GLenum,GLenum,GLuint,GLenum,GLsizei,const GLchar*, //void
    public static native void glDebugMessageCallback(long pcallback, Object puserParam, int offset_puserParam); //GLDEBUGPROC,const void*, //void
    public static native int glGetDebugMessageLog(int pcount, int pbufSize, int[] psources, int offset_psources, int[] ptypes, int offset_ptypes, int[] pids, int offset_pids, int[] pseverities, int offset_pseverities, int[] plengths, int offset_plengths, String pmessageLog); //GLuint,GLsizei,GLenum*,GLenum*,GLuint*,GLenum*,GLsizei*,GLchar*, //GLuint
    public static native void glPushDebugGroup(int psource, int pid, int plength, String pmessage); //GLenum,GLuint,GLsizei,const GLchar*, //void
    public static native void glPopDebugGroup(); // //void
    public static native void glObjectLabel(int pidentifier, int pname, int plength, String plabel); //GLenum,GLuint,GLsizei,const GLchar*, //void
    public static native void glGetObjectLabel(int pidentifier, int pname, int pbufSize, int[] plength, int offset_plength, String plabel); //GLenum,GLuint,GLsizei,GLsizei*,GLchar*, //void
    public static native void glObjectPtrLabel(Object pptr, int offset_pptr, int plength, String plabel); //const void*,GLsizei,const GLchar*, //void
    public static native void glGetObjectPtrLabel(Object pptr, int offset_pptr, int pbufSize, int[] plength, int offset_plength, String plabel); //const void*,GLsizei,GLsizei*,GLchar*, //void
    public static native void glDebugMessageControlKHR(int psource, int ptype, int pseverity, int pcount, int[] pids, int offset_pids, int penabled); //GLenum,GLenum,GLenum,GLsizei,const GLuint*,GLboolean, //void
    public static native void glDebugMessageInsertKHR(int psource, int ptype, int pid, int pseverity, int plength, String pbuf); //GLenum,GLenum,GLuint,GLenum,GLsizei,const GLchar*, //void
    public static native void glDebugMessageCallbackKHR(long pcallback, Object puserParam, int offset_puserParam); //GLDEBUGPROCKHR,const void*, //void
    public static native int glGetDebugMessageLogKHR(int pcount, int pbufSize, int[] psources, int offset_psources, int[] ptypes, int offset_ptypes, int[] pids, int offset_pids, int[] pseverities, int offset_pseverities, int[] plengths, int offset_plengths, String pmessageLog); //GLuint,GLsizei,GLenum*,GLenum*,GLuint*,GLenum*,GLsizei*,GLchar*, //GLuint
    public static native void glPushDebugGroupKHR(int psource, int pid, int plength, String pmessage); //GLenum,GLuint,GLsizei,const GLchar*, //void
    public static native void glPopDebugGroupKHR(); // //void
    public static native void glObjectLabelKHR(int pidentifier, int pname, int plength, String plabel); //GLenum,GLuint,GLsizei,const GLchar*, //void
    public static native void glGetObjectLabelKHR(int pidentifier, int pname, int pbufSize, int[] plength, int offset_plength, String plabel); //GLenum,GLuint,GLsizei,GLsizei*,GLchar*, //void
    public static native void glObjectPtrLabelKHR(Object pptr, int offset_pptr, int plength, String plabel); //const void*,GLsizei,const GLchar*, //void
    public static native void glGetObjectPtrLabelKHR(Object pptr, int offset_pptr, int pbufSize, int[] plength, int offset_plength, String plabel); //const void*,GLsizei,GLsizei*,GLchar*, //void
    public static native void glGetPointervKHR(int ppname, Object[] pparams); //GLenum,void**, //void

}

