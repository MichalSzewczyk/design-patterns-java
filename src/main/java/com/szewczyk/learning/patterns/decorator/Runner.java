package com.szewczyk.learning.patterns.decorator;

public interface Runner extends Runnable {
    void add(Runnable runnable);
}
