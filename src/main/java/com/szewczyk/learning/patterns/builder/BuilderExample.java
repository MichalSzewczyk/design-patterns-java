package com.szewczyk.learning.patterns.builder;

public class BuilderExample {
    public static void main(String[] args) {
        CarBuilder audiBuilder = new AudiCarBuilder();
        CarBuilder bmwBuilder = new BMWCarBuilder();

        Car audiCar = audiBuilder.model("TT").withEngine().build();
        Car bmwCar = bmwBuilder.model("X3").withEngine().build();

        audiCar.start();
        bmwCar.start();
    }
}
