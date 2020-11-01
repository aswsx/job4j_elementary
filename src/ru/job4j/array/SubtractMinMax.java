package ru.job4j.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int min = ints[0];
        int max = ints[0];
        for (int anInt : ints) {
            if (anInt < min) {
                min = anInt;
            }
            if (anInt > max) {
                max = anInt;
            }
        }
        return max - min;
    }
}