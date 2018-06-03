package com.szewczyk.learning.patterns.strategy;

public class NoQuacking implements QuackingStrategy {
    private final Output output;

    public NoQuacking(Output output) {
        this.output = output;
    }

    @Override
    public void quack() {
        output.print("<empty>");
    }
}
