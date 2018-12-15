package com.szewczyk.learning.patterns.bridge;

public final class Album {
    private final String title;

    public Album(String title) {
        this.title = title;
    }

    public final String getTitle() {
        return title;
    }
}
