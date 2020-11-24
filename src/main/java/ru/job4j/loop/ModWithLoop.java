package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int rsl = 0;
        while (n >= d) {
            n = n - d;
            rsl = n;
        }
        return rsl;
    }
}
