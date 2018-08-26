package com.szewczyk.learning.patterns.builder;

public class BMWCar implements Car {
    private final Engine engine;

    public BMWCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("Starting BMW car.");
        engine.start();
    }
}
