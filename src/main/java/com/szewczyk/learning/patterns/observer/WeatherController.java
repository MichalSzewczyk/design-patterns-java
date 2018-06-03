package com.szewczyk.learning.patterns.observer;

import java.util.LinkedList;
import java.util.List;

public class WeatherController implements Subject<WeatherData> {
    private final List<Observer<WeatherData>> observers;

    public WeatherController() {
        observers = new LinkedList<>();
    }

    @Override
    public void register(Observer<WeatherData> observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer<WeatherData> observer) {
        observers.remove(observer);
    }

    public void update(WeatherData weatherData) {
        observers.forEach(observer -> observer.update(weatherData));
    }
}
