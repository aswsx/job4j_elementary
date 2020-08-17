package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenManHeight175() {
        double in = 175;
        double expected = 86.25;
        double out = Fit.manWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight164() {
        double in = 164;
        double expected = 62.1;
        double out = Fit.womanWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
