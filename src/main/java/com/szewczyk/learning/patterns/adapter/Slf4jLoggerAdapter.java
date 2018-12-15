package com.szewczyk.learning.patterns.adapter;

import org.slf4j.Logger;

public abstract class Slf4jLoggerAdapter implements Logger {
    private final com.szewczyk.learning.patterns.adapter.Logger logger;

    protected Slf4jLoggerAdapter(com.szewczyk.learning.patterns.adapter.Logger logger) {
        this.logger = logger;
    }

    @Override
    public final void info(String message) {
        this.logger.log(message, com.szewczyk.learning.patterns.adapter.Logger.Level.INFO);
    }

    @Override
    public final void warn(String message) {
        this.logger.log(message, com.szewczyk.learning.patterns.adapter.Logger.Level.WARN);
    }

    @Override
    public final void error(String message) {
        this.logger.log(message, com.szewczyk.learning.patterns.adapter.Logger.Level.ERROR);
    }
}
