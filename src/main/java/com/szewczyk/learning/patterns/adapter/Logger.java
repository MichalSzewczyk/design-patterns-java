package com.szewczyk.learning.patterns.adapter;

public interface Logger {
    enum Level {
        INFO, WARN, ERROR
    }

    void log(String message, Level level);
}
