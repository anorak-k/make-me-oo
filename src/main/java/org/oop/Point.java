package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public  double getDistanceFrom(Point from) {
        return Math.sqrt(Math.pow(getXDistance(from), 2) + Math.pow(getYDistance(from), 2));
    }

    public  double getDirectionFrom(Point from) {
        return Math.atan2(getYDistance(from), getXDistance(from));
    }

    private double getXDistance(Point from) {
        return this.x - from.x;
    }

    private double getYDistance(Point from) {
        return this.y - from.y;
    }
}
