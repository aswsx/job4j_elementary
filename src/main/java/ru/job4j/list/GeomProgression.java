package ru.job4j.list;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        int elem;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            elem = (int) (first * Math.pow(denominator, i));
            sum += elem;
        }
        return sum;
    }
}