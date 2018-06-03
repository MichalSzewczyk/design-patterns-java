package com.szewczyk.learning.patterns.observer;

public class TemperatureDevice implements ControllerDevice {
    private final WeatherController weatherController;

    public TemperatureDevice(WeatherController weatherController) {
        this.weatherController = weatherController;
    }

    @Override
    public void update(WeatherData weatherData) {
        weatherController.update(weatherData);
    }
}
