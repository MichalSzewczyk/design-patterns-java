package com.szewczyk.learning.patterns.observer.pushing.impl;

import com.szewczyk.learning.patterns.observer.pushing.Observer;

public class StringObserver implements Observer<String> {
    @Override
    public void notify(String value) {
        System.out.println("After change: " + value);
    }
}
