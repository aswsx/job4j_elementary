package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2() {
        int inP = 6;
        int inK = 2;
        int expected = 2;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1() {
        int inP = 4;
        int inK = 1;
        int expected = 1;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }
}
