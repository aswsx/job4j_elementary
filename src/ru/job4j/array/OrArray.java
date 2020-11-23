package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int size = add(rsl, left, 0);
        size = add(rsl, right, size);
        return Arrays.copyOf(rsl, size);
    }

    private static int add(int[] rsl, int[] array, int size) {
        for (int k : array) {
            boolean needAdd = true;
            for (int i : rsl) {
                if (i == k) {
                    needAdd = false;
                    break;
                }
            }
            if (needAdd) {
                rsl[size] = k;
                size++;
            }
        }
        return size;
    }
}