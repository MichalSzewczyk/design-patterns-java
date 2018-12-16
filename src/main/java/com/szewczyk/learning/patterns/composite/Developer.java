package com.szewczyk.learning.patterns.composite;

public final class Developer implements Employee {
    @Override
    public final void askToWorkOn(String task) {
        System.out.println("Working on task: " + task);
    }
}
