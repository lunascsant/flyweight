package com.example;

public class Circle implements Shape {
    private final String radius;

    public Circle(String radius) {
        this.radius = radius;
    }

    @Override
    public void draw(String color) {
        System.out.println("Desenhando círculo de raio " + radius + " e cor " + color);
    }

    public String getRadius() {
        return radius;
    }
}

