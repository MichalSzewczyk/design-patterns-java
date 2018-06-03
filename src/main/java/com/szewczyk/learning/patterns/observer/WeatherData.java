package com.szewczyk.learning.patterns.observer;

public class WeatherData {
    volatile private String value;

    public WeatherData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void update(WeatherData data) {
        this.value = data.value;
    }
}
