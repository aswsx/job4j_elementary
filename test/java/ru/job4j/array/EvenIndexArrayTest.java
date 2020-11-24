package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EvenIndexArrayTest {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        EvenIndexArray.main(null);
        String ln = System.lineSeparator();
        String expected = "1" + ln + "3" + ln + "5" + ln + "7" + ln + "9" + ln;
        assertThat(out.toString(), is(expected));
    }
}