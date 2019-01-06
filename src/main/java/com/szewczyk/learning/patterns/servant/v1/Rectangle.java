package com.szewczyk.learning.patterns.servant.v1;

import com.szewczyk.learning.patterns.servant.Shape;

public final class Rectangle extends Shape {
    private final ShapeMover shapeMover;

    Rectangle(ShapeMover shapeMover, int x, int y) {
        super(x, y);
        this.shapeMover = shapeMover;
    }

    final void move(Point point) {
        this.shapeMover.moveShape(point, this);
    }
}
