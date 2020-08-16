package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public  double getDistanceFrom(Point from) {
        double xDistance = this.x - from.x;
        double yDistance = this.y - from.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public  double getDirectionFrom(Point from) {
        double xDistance = this.x - from.x;
        double yDistance = this.y - from.y;
        return Math.atan2(yDistance, xDistance);
    }

}
