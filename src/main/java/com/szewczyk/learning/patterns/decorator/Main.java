package com.szewczyk.learning.patterns.decorator;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Runner runner = new InMemoryRunner();

        IntStream.iterate(0, i -> i++).limit(10)
                .mapToObj(__ -> (Runnable) () -> System.out.println("Running!"))
                .map(runnable -> new LoggingDecorator(runnable, System.out))
                .forEach(runner::add);

        runner.run();
    }
}
