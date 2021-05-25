package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private final int x;
    private final int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        var firstPoint = new Point(0, 0, 0);
        var secondPoint = new Point(1, 2, 3);
        double result = firstPoint.distance3D(secondPoint);
        System.out.println("result (0, 0, 0) to (1, 2, 3) " + result);
        result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(1, 2, 3, 4);
        System.out.println("result (1, 2) to (3, 4) " + result);
        result = Point.distance(5, 3, 1, 4);
        System.out.println("result (5, 3) to (1, 4) " + result);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public double distance3D(Point that) {
        return sqrt(pow((this.x - that.x), 2) + pow((this.y - that.y), 2) + pow((this.z - that.z), 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}

