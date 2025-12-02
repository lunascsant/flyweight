package com.example;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public static Shape getCircle(String radius) {
        Shape shape = shapes.get(radius);
        if (shape == null) {
            shape = new Circle(radius);
            shapes.put(radius, shape);
        }
        return shape;
    }
}

