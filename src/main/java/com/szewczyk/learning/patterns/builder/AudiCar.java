package com.szewczyk.learning.patterns.builder;

public class AudiCar implements Car {
    private final Engine engine;

    public AudiCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("Starting Audi car.");
        engine.start();
    }
}
