package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(6, 1, 2);
        assertThat(result, is(6));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(2, 1, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenEqual() {
        int result = MultiMax.max(2, 2, 2);
        assertThat(result, is(2));
    }
}