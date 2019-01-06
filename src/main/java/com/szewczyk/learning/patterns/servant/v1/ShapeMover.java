package com.szewczyk.learning.patterns.servant.v1;

import com.szewczyk.learning.patterns.servant.Shape;

public final class ShapeMover {
    public final void moveShape(Point point, Shape shape) {
        shape.setX(point.getX());
        shape.setX(point.getY());
    }
}
