package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void whenX1Y2X3Y4() {
        int x1In = 1;
        int y1In = 2;
        int x2In = 3;
        int y2In = 4;
        double expected = 2.82;
        double out = Point.distance(x1In, y1In, x2In, y2In);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenX0Y0X0Y2() {
        int x1In = 0;
        int y1In = 0;
        int x2In = 0;
        int y2In = 2;
        double expected = 2;
        double out = Point.distance(x1In, y1In, x2In, y2In);
        Assert.assertEquals(expected, out, 0.01);
    }
}