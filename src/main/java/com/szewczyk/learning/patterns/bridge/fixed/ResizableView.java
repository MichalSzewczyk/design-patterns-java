package com.szewczyk.learning.patterns.bridge.fixed;

import com.szewczyk.learning.patterns.bridge.View;

import static java.lang.String.format;

public final class ResizableView implements View {
    private final Displayable displayable;
    private long length;
    private long height;

    public ResizableView(Displayable displayable) {
        this.displayable = displayable;
    }

    @Override
    public final void display() {
        System.out.println(format("%s, size: [length: %s, height: %s]" + displayable, length, height));
    }

    public final void resize(long length, long height) {
        this.length = length;
        this.height = height;
    }
}
