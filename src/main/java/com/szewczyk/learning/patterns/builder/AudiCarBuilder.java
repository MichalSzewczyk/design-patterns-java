package com.szewczyk.learning.patterns.builder;

public class AudiCarBuilder implements CarBuilder {
    private String modelName;
    private Engine engine;
    @Override
    public Car build() {
        return new AudiCar(modelName, engine);
    }

    @Override
    public CarBuilder withEngine() {
        this.engine = new AudiEngine();
        return this;
    }

    @Override
    public CarBuilder model(String modelName) {
        this.modelName = modelName;
        return this;
    }
}
