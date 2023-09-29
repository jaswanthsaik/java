package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircleTests {

    private static final String MSG_01 = "circle object should be of type AbstractShape and Shape";
    private static final String MSG_02 = "circle properties not set properly by constructor";
    private static final String MSG_03 = "circle area/perimeter returned are not correct";
    private static final String MSG_04 = "circle details returned by toString are not as per requirement";

    private Circle circle;

    @BeforeEach
    public void setUp() {
        circle = new Circle("brown", 10);
    }

    @AfterEach
    public void tearDown() {
        circle = null;
    }

    @Test
    public void givenCircleClassThenShouldBeOfShapeType() {
        assertTrue(Shape.class.isAssignableFrom(Circle.class), MSG_01);
    }

    @Test
    public void givenCircleClassThenShouldBeOfAbstractShapeType() {
        assertTrue(AbstractShape.class.isAssignableFrom(Circle.class), MSG_01);
    }

    @Test
    public void givenCircleObjectThenPropertiesAreSet() {
        assertEquals(circle.getColour(), "brown", MSG_02);
        assertEquals(circle.getRadius(), 10, MSG_02);
    }

    @Test
    public void givenCircleObjectThenGetCircleDetails() {
        String expected = "Circle [colour=brown, radius=10]";
        assertEquals(circle.toString().toLowerCase(), expected.toLowerCase(), MSG_04);
    }

    @Test
    public void givenCircleObjectThenGetArea() {
        assertEquals(314.16, circle.getArea(), 0.01, MSG_03);
    }

    @Test
    public void givenCircleObjectThenGetPerimeter() {
        assertEquals(62.83, circle.getPerimeter(), 0.01, MSG_03);
    }
}