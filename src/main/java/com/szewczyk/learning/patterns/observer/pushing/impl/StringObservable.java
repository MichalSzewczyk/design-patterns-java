package com.szewczyk.learning.patterns.observer.pushing.impl;

import com.szewczyk.learning.patterns.observer.pushing.Observable;
import com.szewczyk.learning.patterns.observer.pushing.Observer;

import java.util.LinkedList;
import java.util.List;

public class StringObservable implements Observable<String> {
    private final List<Observer<String>> stringObserver;

    public StringObservable() {
        stringObserver = new LinkedList<>();
    }

    @Override
    public void subscribe(Observer<String> observer) {
        stringObserver.add(observer);
    }
}
