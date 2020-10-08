package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl *= a;
        }
        return rsl;
    }
}
