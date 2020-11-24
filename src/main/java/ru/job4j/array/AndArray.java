package ru.job4j.array;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int size = 0;
        for (int j : left) {
            for (int i : right) {
                if (j == i) {
                    size++;
                }
            }
        }
        int[] rsl = new int[size];
        int index = 0;
        for (int j : left) {
            for (int i : right) {
                if (j == i) {
                    rsl[index] = j;
                    index++;
                }
            }
        }
        return rsl;
    }
}
