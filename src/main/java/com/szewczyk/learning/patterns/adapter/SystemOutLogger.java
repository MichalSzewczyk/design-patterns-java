package com.szewczyk.learning.patterns.adapter;

import static java.lang.String.format;

public final class SystemOutLogger implements Logger {
    @Override
    public final void log(String message, Level level) {
        System.out.println(format("[%s] - %s", level, message));
    }
}
