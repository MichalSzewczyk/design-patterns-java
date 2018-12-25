package com.szewczyk.learning.patterns.marker;

import java.io.Serializable;

public final class SerializableDto implements Serializable {
    private final String data;
    private transient final NotSerializableDto notSerializableDto;

    public SerializableDto(String data, NotSerializableDto notSerializableDto) {
        this.notSerializableDto = notSerializableDto;
        this.data = data;
    }

    public final String getData() {
        return data;
    }

    public final NotSerializableDto getNotSerializableDto() {
        return notSerializableDto;
    }
}
