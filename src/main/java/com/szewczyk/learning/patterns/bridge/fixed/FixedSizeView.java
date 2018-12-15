package com.szewczyk.learning.patterns.bridge.fixed;

import com.szewczyk.learning.patterns.bridge.View;

import static java.lang.String.format;

public final class FixedSizeView implements View {
    private final Displayable displayable;
    private final long length;
    private final long height;

    public FixedSizeView(Displayable displayable, long length, long height) {
        this.displayable = displayable;
        this.length = length;
        this.height = height;
    }

    @Override
    public final void display() {
        System.out.println(format("%s, size: [length: %s, height: %s]" + displayable.display(), length, height));
    }
}
