package org.oop;

import java.util.ArrayList;

public class Space {

    private static Space space = new Space();
    public static Space getInstance() {
        return space;
    }

    ArrayList<Point> points = new ArrayList<Point>();

    public double directionBetweenPoints(int fromIndex, int toIndex) {
        double xDistance = this.points.get(toIndex).x - this.points.get(fromIndex).x;
        double yDistance = this.points.get(toIndex).y - this.points.get(fromIndex).y;
        return Math.atan2(yDistance, xDistance);
    }

    public  double distanceBetweenPoints(int fromIndex, int toIndex) {
        double xDistance = this.points.get(toIndex).x - this.points.get(fromIndex).x;
        double yDistance = this.points.get(toIndex).y - this.points.get(fromIndex).y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
}
