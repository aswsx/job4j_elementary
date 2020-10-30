package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff1 {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int size = findUnique(left, right, rsl, 0);
        size = findUnique(right, left, rsl, size);
        return Arrays.copyOf(rsl, size);
    }

    private static int findUnique(int[] left, int[] right, int[] rsl, int size) {
        for (int k : left) {
            boolean needToAdd = true;
            for (int i : right) {
                if (k == i) {
                    needToAdd = false;
                    break;
                }
            }
            if (needToAdd) {
                rsl[size++] = k;
            }
        }
        return size;
    }
}