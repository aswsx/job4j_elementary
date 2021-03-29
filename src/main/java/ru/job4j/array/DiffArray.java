package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length];
        int count = 0;
        if (left.length == 0) {
            return new int[0];
        } else if (right.length == 0) {
            return left;
        } else {
            for (int k : left) {
                for (int m : right) {
                    if (k != m) {
                        rsl[count++] = k;
                    } else {
                        break;
                    }
                }
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}