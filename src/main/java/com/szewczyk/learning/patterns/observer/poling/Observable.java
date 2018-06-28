package com.szewczyk.learning.patterns.observer.poling;

public interface Observable<T> {
    void subscribe(Observer<T> observer);

    T getActualValue();
}
