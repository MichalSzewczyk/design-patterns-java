package com.szewczyk.learning.patterns.iterator;

public interface Iterator<T> {
    T next();

    boolean hasNext();
}
