package com.szewczyk.learning.patterns.servant.v2;

import com.szewczyk.learning.patterns.servant.Shape;

import java.util.Collection;

import static java.util.Arrays.asList;

public final class ShapeDrawer {
    private final Collection<Shape> shapes;

    public ShapeDrawer(Shape... shapes) {
        this.shapes = asList(shapes);
    }

    public final void drawAllShapes() {
        shapes.stream().map(ShapeDrawer::visualize).forEach(System.out::println);
    }

    private static String visualize(Shape shape) {
        return shape.getClass().getName() + ": x = " + shape.getX() + ", y = " + shape.getY();
    }
}
