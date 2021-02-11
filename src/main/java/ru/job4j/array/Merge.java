package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftPos = 0, rightPos = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (leftPos == left.length) {
                rsl[i] = right[rightPos++];
            } else if (rightPos == right.length || left[leftPos] < right[rightPos]) {
                rsl[i] = left[leftPos++];
            } else {
                rsl[i] = right[rightPos++];
            }
        }
        return rsl;
    }
}



