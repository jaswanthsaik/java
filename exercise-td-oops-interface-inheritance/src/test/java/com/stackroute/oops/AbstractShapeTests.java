package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractShapeTests {
    private static final String MSG_01 = "class AbstractShape should implement Shape interface";
    private static final String MSG_02 = "class AbstractShape should have colour property";

    private AbstractShape circleShape;
    private AbstractShape rectangleShape;

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
    public void givenAbstractShapeClassThenShouldBeOfShapeType() {
        assertTrue(Shape.class.isAssignableFrom(AbstractShape.class), MSG_01);
    }

    @Test
    public void givenAbstractShapeObjectWhenCircleThenShouldSetColor() {
        assertEquals("brown", circleShape.getColour(), MSG_02);
    }
    @Test
    public void givenAbstractShapeObjectWhenRectangleThenShouldSetColor() {
        assertEquals("green", rectangleShape.getColour(), MSG_02);
    }

}