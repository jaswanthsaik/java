package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTests {

    private static final String MSG_01 = "area/perimeter returned not calculated correctly for given shape object";

    private Shape circleShape;
    private Shape rectangleShape;

    @BeforeEach
    public void setUp() {
        circleShape = new Circle("brown", 10);
        rectangleShape = new Rectangle("green", 15, 5);
    }

    @AfterEach
    public void tearDown() {
        circleShape = null;
        rectangleShape = null;
    }

    @Test
    public void givenShapeWhenCircleThenShouldCalculateAreaPerimeterOfCircle() {
        assertEquals(314.16, circleShape.getArea(), 0.01, MSG_01);
        assertEquals(62.83, circleShape.getPerimeter(), 0.01, MSG_01);
    }

    @Test
    public void givenShapeWhenRectangleThenShouldCalculateAreaPerimeterOfCircle() {
        assertEquals(75, rectangleShape.getArea(), 0.01, MSG_01);
        assertEquals(40, rectangleShape.getPerimeter(), 0.01, MSG_01);
    }
}