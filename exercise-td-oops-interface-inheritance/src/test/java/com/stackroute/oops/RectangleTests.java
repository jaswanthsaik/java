package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleTests {

    private static final String MSG_01 = "rectangle object should be of type AbstractShape and Shape";
    private static final String MSG_02 = "rectangle properties not set properly by constructor";
    private static final String MSG_03 = "rectangle area/perimeter returned is not correct";
    private static final String MSG_04 = "rectangle details returned by toString are not as per requirement";

    private Rectangle rectangle;

    @BeforeEach
    public void setUp() {
        rectangle = new Rectangle("brown", 10, 20);
    }

    @AfterEach
    public void tearDown() {
        rectangle = null;
    }

    @Test
    public void givenRectangleThenShouldBeOfShapeType() {
        assertTrue(Shape.class.isAssignableFrom(Rectangle.class), MSG_01);
    }

    @Test
    public void givenRectangleThenShouldBeOfAbstractShapeType() {
        assertTrue(AbstractShape.class.isAssignableFrom(Rectangle.class), MSG_01);
    }

    @Test
    public void givenRectangleObjectThenPropertiesAreSet() {
        assertEquals(rectangle.getColour(), "brown", MSG_02);
        assertEquals(rectangle.getLength(), 10, MSG_02);
        assertEquals(rectangle.getBreadth(), 20, MSG_02);
    }

    @Test
    public void givenRectangleObjectThenGetRectangleDetails() {
        String expected = "Rectangle [colour=brown, length=10, breadth=20]";
        assertEquals(rectangle.toString().toLowerCase(), expected.toLowerCase(), MSG_04);
    }

    @Test
    public void givenRectangleObjectThenGetArea() {
        assertEquals(200, rectangle.getArea(), 0.01, MSG_03);
    }

    @Test
    public void givenRectangleObjectThenGetPerimeter() {
        assertEquals(60, rectangle.getPerimeter(), 0.01, MSG_03);
    }
}