package com.szewczyk.learning.patterns.strategy;

public class DuckTemplate implements Duck {
    private final QuackingStrategy quackingStrategy;
    private final FlyingStrategy flyingStrategy;

    public DuckTemplate(QuackingStrategy quackingStrategy, FlyingStrategy flyingStrategy) {
        this.quackingStrategy = quackingStrategy;
        this.flyingStrategy = flyingStrategy;
    }

    @Override
    public void quack() {
        quackingStrategy.quack();
    }

    @Override
    public void fly() {
        flyingStrategy.fly();
    }
}
