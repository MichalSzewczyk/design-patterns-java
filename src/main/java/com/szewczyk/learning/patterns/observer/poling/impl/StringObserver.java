package com.szewczyk.learning.patterns.observer.poling.impl;

import com.szewczyk.learning.patterns.observer.poling.Observable;
import com.szewczyk.learning.patterns.observer.poling.Observer;

public class StringObserver implements Observer<String> {
    private final Observable<String> stringObservable;

    public StringObserver(Observable<String> stringObservable) {
        this.stringObservable = stringObservable;
        this.stringObservable.subscribe(this);
    }

    @Override
    public void notifyChange() {
        System.out.println("After change: " + stringObservable.getActualValue());
    }
}
