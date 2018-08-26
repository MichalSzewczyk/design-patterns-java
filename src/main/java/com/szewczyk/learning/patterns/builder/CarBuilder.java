package com.szewczyk.learning.patterns.builder;

public interface CarBuilder {
    Car build();

    CarBuilder withEngine();

    CarBuilder model(String modelName);
}
