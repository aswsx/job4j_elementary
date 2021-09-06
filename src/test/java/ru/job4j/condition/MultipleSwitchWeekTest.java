package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MultipleSwitchWeekTest {

    @Test
    public void test() {
        int result = MultipleSwitchWeek.numberOfDay("Четверг");
        assertThat(result, is(4));
    }
}