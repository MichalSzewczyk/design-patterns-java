package com.szewczyk.learning.patterns.builder;

public class AudiCar implements Car {
    private final String modelName;
    private final Engine engine;

    AudiCar(String modelName, Engine engine) {
        this.modelName = modelName;
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("Starting Audi car. Model name: " + modelName);
        engine.start();
    }
}
