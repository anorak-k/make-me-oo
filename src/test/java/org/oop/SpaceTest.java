package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class SpaceTest {


    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Space space = new Space();
        Point origin = new Point(0, 0);
        space.points.add(origin);
        Assertions.assertEquals(0, space.distanceBetweenPoints(0, 0));
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Space space = new Space();
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);
        space.points.addAll(Arrays.asList(origin, point1, point2));
        Assertions.assertEquals(1, space.distanceBetweenPoints(space.points.indexOf(origin), space.points.indexOf(point1)));
        Assertions.assertEquals(1, space.distanceBetweenPoints(space.points.indexOf(origin), space.points.indexOf(point2)));
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Space space = new Space();
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);
        space.points.addAll(Arrays.asList(point1, point2));
        Assertions.assertEquals(2, space.distanceBetweenPoints(space.points.indexOf(point1), space.points.indexOf(point2)));
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Space space = new Space();
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);
        space.points.addAll(Arrays.asList(origin, point1, point2));
        Assertions.assertEquals(0, space.directionBetweenPoints(space.points.indexOf(origin), space.points.indexOf(point1)));
        Assertions.assertEquals(0, space.directionBetweenPoints(space.points.indexOf(origin), space.points.indexOf(point2)));
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Space space = new Space();
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);
        space.points.addAll(Arrays.asList(origin, point1, point2));
        Assertions.assertEquals(Math.PI, space.directionBetweenPoints(space.points.indexOf(origin), space.points.indexOf(point1)));
        Assertions.assertEquals(Math.PI, space.directionBetweenPoints(space.points.indexOf(origin), space.points.indexOf(point2)));
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Space space = new Space();
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);
        space.points.addAll(Arrays.asList(origin, point1, point2));
        Assertions.assertEquals(Math.PI / 2, space.directionBetweenPoints(space.points.indexOf(origin), space.points.indexOf(point2)));
        Assertions.assertEquals(Math.PI / 2, space.directionBetweenPoints(space.points.indexOf(origin), space.points.indexOf(point1)));
    }
}
