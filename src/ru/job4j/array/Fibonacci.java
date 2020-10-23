package ru.job4j.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        for (int i = 1; i < data.length - 1; i++) {
            if (data[i + 1] != data[i] + data[i - 1]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}