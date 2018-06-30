package com.szewczyk.learning.patterns.observer.poling.impl;

import com.szewczyk.learning.patterns.observer.poling.Observable;
import com.szewczyk.learning.patterns.observer.poling.Observer;

import java.util.LinkedList;
import java.util.List;

public class ObservableString implements Observable<String>, Runnable {
    private final List<Observer<String>> observers;

    public ObservableString() {
        observers = new LinkedList<>();
    }


    @Override
    public void subscribe(Observer<String> observer) {
        observers.add(observer);
    }

    @Override
    public String getActualValue() {
        return "Always the same.";
    }

    @Override
    public void run() {
        observers.forEach(Observer::notifyChange);
    }
}
