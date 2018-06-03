package com.szewczyk.learning.patterns.strategy;

import com.szewczyk.learning.patterns.common.Output;

public class Main {
    public static void main(String[] args) {
        Output stdOutput = System.out::println;
        Duck silentDuck = new DuckTemplate(new NoQuacking(stdOutput), new NoFlying(stdOutput));

        silentDuck.fly();
        silentDuck.quack();
    }
}
