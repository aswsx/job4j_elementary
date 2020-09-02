package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
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
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(1, 2, 3, 4);
        System.out.println("result (1, 2) to (3, 4) " + result);
        result = Point.distance(5, 3, 1, 4);
        System.out.println("result (5, 3) to (1, 4) " + result);
    }
    public double distance(Point that) {
        return sqrt(pow((this.x - that.x), 2) + pow((this.y - that.y), 2));
    }

    public double distance3D(Point that) {
        return sqrt(pow((this.x - that.x), 2) + pow((this.y - that.y), 2) + pow((this.z - that.z), 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}

