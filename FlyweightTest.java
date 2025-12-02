package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlyweightTest {
    @Test
    void testCircleSharing() {
        Shape circle1 = ShapeFactory.getCircle("15");
        Shape circle2 = ShapeFactory.getCircle("15");
        Shape circle3 = ShapeFactory.getCircle("30");
        assertSame(circle1, circle2);
        assertNotSame(circle1, circle3);
    }

    @Test
    void testDrawMethod() {
        Shape circle = ShapeFactory.getCircle("25");
        circle.draw("amarelo");
    }

    @Test
    void testDifferentRadiusInstances() {
        Shape circleA = ShapeFactory.getCircle("5");
        Shape circleB = ShapeFactory.getCircle("6");
        assertNotSame(circleA, circleB);
    }

    @Test
    void testMultipleDrawCalls() {
        Shape circle = ShapeFactory.getCircle("8");
        circle.draw("preto");
        circle.draw("branco");
    }

    @Test
    void testNullRadius() {
        Shape circleNull1 = ShapeFactory.getCircle(null);
        Shape circleNull2 = ShapeFactory.getCircle(null);
        assertSame(circleNull1, circleNull2);
    }
}
