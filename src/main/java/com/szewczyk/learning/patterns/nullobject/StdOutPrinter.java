package com.szewczyk.learning.patterns.nullobject;

public final class StdOutPrinter implements Printer {
    @Override
    public final void print(String value) {
        System.out.println(value);
    }
}
