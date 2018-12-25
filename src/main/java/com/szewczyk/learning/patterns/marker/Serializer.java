package com.szewczyk.learning.patterns.marker;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;

public final class Serializer {
    private final ObjectOutput objectOutput;

    public Serializer(ObjectOutput objectOutput) {
        this.objectOutput = objectOutput;
    }

    final void serialize(Serializable serializable) throws IOException {
        objectOutput.writeObject(serializable);
    }
}
