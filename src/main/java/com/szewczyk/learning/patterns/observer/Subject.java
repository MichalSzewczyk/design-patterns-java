package com.szewczyk.learning.patterns.observer;

public interface Subject<T> {
    void register(Observer<T> observer);
    void deregister(Observer<T> observer);
}
