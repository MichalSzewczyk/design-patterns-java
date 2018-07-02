package com.szewczyk.learning.patterns.decorator;

import java.util.LinkedList;
import java.util.List;

public class InMemoryRunner implements Runner {
    private final List<Runnable> runnables;

    public InMemoryRunner() {
        runnables = new LinkedList<>();
    }

    @Override
    public void add(Runnable runnable) {
        runnables.add(runnable);
    }

    @Override
    public void run() {
        runnables.forEach(Runnable::run);
    }
}
