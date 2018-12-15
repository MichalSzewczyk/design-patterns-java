package com.szewczyk.learning.patterns.bridge;

public final class Artist {
    private final String name;

    public Artist(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }
}
