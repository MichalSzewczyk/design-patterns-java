package com.szewczyk.learning.patterns.observer.pushing;

public interface Observable<T> {
    void subscribe(Observer<T> observer);
}
