package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class DepDescCompTest {

    @Test
    public void compare() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenUpDepartmentGoAfter() {
        int rsl = new DepDescComp().compare(
                "K2/SK1",
                "K2"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenAllDepartments() {
        int rsl = new DepDescComp().compare(
                "K2",
                "SK1/SSK2"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenNotMiddleDepartment() {
        int rsl = new DepDescComp().compare(
                "K2",
                "SSK1"
        );
        assertThat(rsl, greaterThan(0));
    }
}