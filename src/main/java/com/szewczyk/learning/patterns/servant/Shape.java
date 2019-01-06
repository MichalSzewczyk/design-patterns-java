package com.szewczyk.learning.patterns.servant;

public abstract class Shape {
    private int x;
    private int y;

    protected Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final int getX() {
        return x;
    }

    public final void setX(int x) {
        this.x = x;
    }

    public final int getY() {
        return y;
    }

    public final void setY(int y) {
        this.y = y;
    }
}
