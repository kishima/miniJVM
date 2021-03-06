/* Copyright (c) 2008-2015, Avian Contributors

   Permission to use, copy, modify, and/or distribute this software
   for any purpose with or without fee is hereby granted, provided
   that the above copyright notice and this permission notice appear
   in all copies.

   There is NO WARRANTY for this software.  See license.txt for
   details. */
package java.util.logging;

import java.util.ArrayList;

public class Logger {

    private final String name;
    private Level levelValue = null;
    private static final ArrayList<Handler> handlers;
    private static Logger rootLogger;
    private Logger parent;

    static {
        rootLogger = new Logger("");
        rootLogger.setLevel(Level.INFO);
        handlers = new ArrayList<Handler>();
        handlers.add(new DefaultHandler());
    }

    public static Logger getLogger(String name) {
        if (name.equals("")) {
            return rootLogger;
        }
        Logger logger = new Logger(name);
        logger.parent = rootLogger;
        return logger;
    }

    private Logger(String name) {
        this.name = name;
    }

    public Handler[] getHandlers() {
        return handlers.toArray(new Handler[handlers.size()]);
    }

    public void addHandler(Handler handler) {
        handlers.add(handler);
    }

    public void removeHandler(Handler handler) {
        handlers.remove(handler);
    }

    public Logger getParent() {
        return parent;
    }

    public void fine(String message) {
        log(Level.FINE, message, null, null);
    }

    public void finer(String message) {
        log(Level.FINER, message, null, null);
    }

    public void finest(String message) {
        log(Level.FINEST, message, null, null);
    }

    public void info(String message) {
        log(Level.INFO, message, null, null);
    }

    public void warning(String message) {
        log(Level.WARNING, message, null, null);
    }

    public void severe(String message) {
        log(Level.SEVERE, message, null, null);
    }

    public void log(Level level, String message) {
        log(level, message, null, null);
    }

    public void log(Level level, String message, Object[] params) {
        log(level, message, params, null);
    }

    public void log(Level level, String message, Throwable exception) {
        log(level, message, null, null);
    }

    public void log(Level level, String message, Object param) {
        log(level, replaceParameters(message, param), null, null);
    }

    public void log(Level level, String message, Object[] para, Throwable exception) {
        if (!isLoggable(level)) {
            return;
        }
        String s = exception == null ? "" : exception.getCodeStack();
        System.out.println("[" + Level.class + "]" + (message == null ? "" : message) + "\n" + s);
    }

    private static String replaceParameters(String message, Object... params) {
        StringBuilder builder = new StringBuilder();
        int offset = 0;
        for (int i = 0; i < params.length; ++i) {
            int curly = message.indexOf("{}", offset);
            if (curly < 0) {
                break;
            }
            if (curly > offset) {
                builder.append(message, offset, curly);
            }
            offset = curly + 2;
            builder.append(params[i]);
        }
        if (message.length() > offset) {
            builder.append(message, offset, message.length());
        }
        return builder.toString();
    }

    public void entering(String sourceClass, String sourceMethod) {
        logp(Level.FINER, sourceClass, sourceMethod, "ENTRY");
    }

    public void entering(String sourceClass, String sourceMethod, Object param1) {
        logp(Level.FINER, sourceClass, sourceMethod, "ENTRY {0}", param1);
    }

    public void entering(String sourceClass, String sourceMethod, Object[] param) {
        logp(Level.FINER, sourceClass, sourceMethod, "ENTRY {0}", param);
    }

    public void exiting(String sourceClass, String sourceMethod) {
        logp(Level.FINER, sourceClass, sourceMethod, "RETURN");
    }

    public void exiting(String sourceClass, String sourceMethod, Object result) {
        logp(Level.FINER, sourceClass, sourceMethod, "RETURN {0}", result);
    }

    public void logp(Level level, String sourceClass, String sourceMethod, String msg) {
        log(level, sourceClass + "." + sourceMethod + "()\n" + msg, null, null);
    }

    public void logp(Level level, String sourceClass, String sourceMethod, String msg, Throwable thrown) {

        log(level, sourceClass + "." + sourceMethod + "()\n" + msg, thrown);
    }

    public void logp(Level level, String sourceClass, String sourceMethod, String msg, Object para) {

        log(level, sourceClass + "." + sourceMethod + "()\n" + msg + "\n" + para, null, null);
    }

    public void logp(Level level, String sourceClass, String sourceMethod, String msg, Object[] para) {

        log(level, sourceClass + "." + sourceMethod + "()\n" + msg + "\n", para, null);
    }

    public Level getLevel() {
        return levelValue;
    }

    private Level getEffectiveLevel() {
        Logger logger = this;

        while (logger.levelValue == null) {
            logger = logger.getParent();
        }
        return logger.getLevel();
    }

    public void setLevel(Level level) {
        levelValue = level;
    }

    public boolean isLoggable(Level level) {
        return level.intValue() >= getEffectiveLevel().intValue();
    }

    private static class DefaultHandler extends Handler {

        private static final int NAME_WIDTH = 14;
        private static final int METHOD_WIDTH = 15;
        private static final int LEVEL_WIDTH = 8;
        private final String newline;

        public DefaultHandler() {
            newline = System.getProperty("line.separator");
        }

        public Object clone() {
            return this;
        }

        public void close() {
        }

        public void flush() {
        }

        private void maybeLogThrown(StringBuilder sb, Throwable t) {
            if (t != null) {
                sb.append("\nCaused by: ");
                sb.append(t.getClass().getName());
                sb.append(": ");
                sb.append(t.getMessage());
                sb.append(newline);

                for (StackTraceElement elt : t.getStackTrace()) {
                    sb.append('\t');
                    sb.append(elt.getClassName());
                    sb.append('.');
                    sb.append(elt.getMethodName());
                    sb.append("(line");
                    sb.append(':');
                    int lineNumber = elt.getLineNumber();
                    if (lineNumber == -2) {
                        sb.append("unknown");
                    } else if (lineNumber == -1) {
                        sb.append("native");
                    } else {
                        sb.append(lineNumber);
                    }
                    sb.append(')');
                    sb.append(newline);
                }
                maybeLogThrown(sb, t.getCause());
            }
        }

        private void indent(StringBuilder sb, int amount) {
            do {
                sb.append(' ');
            } while (--amount > 0);
        }

        public void publish(LogRecord r) {
            StringBuilder sb = new StringBuilder();
            sb.append(r.getLoggerName());
            indent(sb, NAME_WIDTH - r.getLoggerName().length());
            sb.append(r.getSourceMethodName());
            indent(sb, METHOD_WIDTH - r.getSourceMethodName().length());
            sb.append(r.getLevel().getName());
            indent(sb, LEVEL_WIDTH - r.getLevel().getName().length());
            sb.append(r.getMessage());
            maybeLogThrown(sb, r.getThrown());
            System.out.println(sb.toString());
        }
    }

}
