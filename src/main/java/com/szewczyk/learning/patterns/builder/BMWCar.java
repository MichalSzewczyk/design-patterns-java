package com.szewczyk.learning.patterns.builder;

public class BMWCar implements Car {
    private final Engine engine;
    private final String modelName;

    BMWCar(String modelName, Engine engine) {
        this.modelName = modelName;
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("Starting BMW car. Model name: " + modelName);
        engine.start();
    }
}
