package ru.job4j.set;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import static ru.job4j.set.UniqueName.User;

public class UniqueNameTest {
    @Test
    public void collectUniqueName() {
        List<User> users = List.of(
                new User("name1"),
                new User("name2"),
                new User("name1"),
                new User("name3"),
                new User("name5"),
                new User("name3")
        );
        int rsl = UniqueName.collectUniqueName(users);
        int expected = 4;
        assertThat(rsl, is(expected));
    }
}