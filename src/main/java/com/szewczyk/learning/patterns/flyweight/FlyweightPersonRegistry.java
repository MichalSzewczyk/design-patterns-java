package com.szewczyk.learning.patterns.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class FlyweightPersonRegistry implements PersonRegistry {
    private final Map<Person, Person> personsCache;

    public FlyweightPersonRegistry() {
        personsCache = new ConcurrentHashMap<>();
    }

    @Override
    public final Person getPerson(String name, String surname) {
        /*
         * Application of flyweight design pattern by reusing immutable Person objects and letting garbage collector collect the duplicated ones.
         */
        return personsCache.computeIfAbsent(new Person(name, surname), person -> person);
    }
}
