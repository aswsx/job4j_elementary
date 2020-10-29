package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] res = new int[0];
        if (left.length == 0) {
            return res;
        } else if (left.length == 1) {
            res = new int[1];
            res[0] = left[0];
        } else {
            res = new int[left.length + right.length];
            int l = 0;
            for (int k : left) {
                for (int m : right) {
                    if (k != m) {
                        res[l++] = k;
                    }
                }
            }
            res = Arrays.copyOf(res, l);
        }
        return res;
    }
}