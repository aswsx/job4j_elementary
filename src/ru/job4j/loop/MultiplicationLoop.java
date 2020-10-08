package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int rsl = 1;
        for (int i = a; i <= b; i++) {
           rsl *= i;
        } return rsl;
    }
}
