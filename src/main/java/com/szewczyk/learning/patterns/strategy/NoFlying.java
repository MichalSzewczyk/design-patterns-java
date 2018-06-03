package com.szewczyk.learning.patterns.strategy;

import com.szewczyk.learning.patterns.common.Output;

public class NoFlying implements FlyingStrategy {
    private final Output output;

    public NoFlying(Output output) {
        this.output = output;
    }

    @Override
    public void fly() {
        output.print("<no flying>");
    }
}
