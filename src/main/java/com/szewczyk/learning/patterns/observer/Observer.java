package com.szewczyk.learning.patterns.observer;

public interface Observer<T> {
    void update(T data);
}
