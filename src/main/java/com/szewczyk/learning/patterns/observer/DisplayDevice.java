package com.szewczyk.learning.patterns.observer;

public interface DisplayDevice extends Observer<WeatherData> {
    void display();
}
