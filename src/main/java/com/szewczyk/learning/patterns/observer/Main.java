package com.szewczyk.learning.patterns.observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DisplayDevice consoleDisplayDevice = new ConsoleDisplayDevice(System.out::println, new WeatherData("anyInitialData"));
        WeatherController weatherController = new WeatherController();
        weatherController.register(consoleDisplayDevice);
        consoleDisplayDevice.display();
        TemperatureDevice temperatureDevice = new TemperatureDevice(weatherController);
        temperatureDevice.update(new WeatherData("anyNewData"));
    }
}
