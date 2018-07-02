package com.szewczyk.learning.patterns.decorator;

import java.io.PrintStream;

public class LoggingDecorator implements Runnable {
    private final Runnable runnable;
    private final PrintStream loggingStream;

    public LoggingDecorator(Runnable runnable, PrintStream loggingStream) {
        this.runnable = runnable;
        this.loggingStream = loggingStream;
    }

    @Override
    public void run() {
        loggingStream.println("Started!");
        runnable.run();
        loggingStream.println("Finished!");
    }
}
