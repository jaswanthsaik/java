package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ShapeServiceTests {

    private static final String MSG_01 = "circle object returned by createCircle(..) should not be null";
    private static final String MSG_02 = "rectangle object returned by createRectangle(..) should not be null";
    private static final String MSG_03 = "compareShape should return 0 for shapes with equal area";
    private static final String MSG_04 = "compareShape should return 1 for first shape parameter with greater area";
    private static final String MSG_05 = "compareShape should return -1 for first shape parameter with lesser area";
    private static final String MSG_06 = "shape summary string returned by getShapeSummary is not as per requirement";

    private static final String REGEX = "\\s+";

    private ShapeService shapeService;

    @BeforeEach
    public void setUp() {
        shapeService = new ShapeService();
    }

    @AfterEach
    public void tearDown() {
        shapeService = null;
    }

    @Test
    public void givenPropertyValuesThenCreateCircleObject() {
        final Circle circle = shapeService.createCircle("blue", 10);
        assertNotNull(circle, MSG_01);
    }

    @Test
    public void givenPropertyValuesThenCreateRectangleObject() {
        final Rectangle rectangle = shapeService.createRectangle("blue", 10, 10);
        assertNotNull(rectangle, MSG_02);
    }

    @Test
    public void givenTwoShapesWhenAreaEqualThenReturnZero() {
        final Rectangle one = new Rectangle("blue", 10, 20);
        final Rectangle two = new Rectangle("blue", 50, 4);
        assertEquals(0, ShapeService.compareShapeArea(one, two), MSG_03);
    }

    @Test
    void givenTwoShapesWhenFirstShapeAreaGreaterThenReturnOne() {
        final Circle one = new Circle("blue", 50);
        final Rectangle two = new Rectangle("blue", 50, 4);
        assertEquals(1, ShapeService.compareShapeArea(one, two), MSG_04);
    }

    @Test
    public void givenTwoShapesWhenFirstShapeAreaSmallerThenReturnMinusOne() {
        final Circle one = new Circle("blue", 10);
        final Rectangle two = new Rectangle("blue", 50, 4);
        assertEquals(1, ShapeService.compareShapeArea(one, two), MSG_05);
    }

    @Test
    public void givenShapeWhenCircleObjectThenReturnCircleSummary() {
        final Circle circle = new Circle("blue", 10);
        String expectedSummary = "Circle [colour=blue, radius=10]\nArea : 314 Perimeter : 63";
        assertEquals(expectedSummary.toLowerCase().replaceAll(REGEX, " "), ShapeService.getShapeSummary(circle).toLowerCase().replaceAll(REGEX, " "),MSG_06);
    }

    @Test
    public void givenShapeWhenRectangleObjectThenReturnRectangleSummary() {
        final Rectangle rectangle = new Rectangle("blue", 50, 4);
        String expectedSummary = "Rectangle [colour=blue, length=50, breadth=4]\nArea : 200 Perimeter : 108";;
        assertEquals(expectedSummary.toLowerCase().replaceAll(REGEX, " "), ShapeService.getShapeSummary(rectangle).toLowerCase().replaceAll(REGEX, " "),MSG_06);
    }

}