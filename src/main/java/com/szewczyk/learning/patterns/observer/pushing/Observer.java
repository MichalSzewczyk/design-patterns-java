package com.szewczyk.learning.patterns.observer.pushing;

public interface Observer<T> {
    void notify(T value);
}
