package com.szewczyk.learning.patterns.builder;

public class BMWCarBuilder implements CarBuilder {
    private String modelName;
    private Engine engine;

    @Override
    public Car build() {
        return new BMWCar(modelName, engine);
    }

    @Override
    public CarBuilder withEngine() {
        this.engine = new BMWEngine();
        return this;
    }

    @Override
    public CarBuilder model(String modelName) {
        this.modelName = modelName;
        return this;
    }
}
