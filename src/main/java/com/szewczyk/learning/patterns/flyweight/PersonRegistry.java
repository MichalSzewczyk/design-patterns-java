package com.szewczyk.learning.patterns.flyweight;

public interface PersonRegistry {
    Person getPerson(String name, String surname);
}
