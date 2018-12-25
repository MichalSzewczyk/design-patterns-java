package com.szewczyk.learning.patterns.marker;

public final class NotSerializableDto {
    private final String data;

    public NotSerializableDto(String data) {
        this.data = data;
    }

    public final String getData() {
        return data;
    }
}
