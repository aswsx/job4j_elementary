package ru.job4j.array;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        if (left.length == 0) {
            res = new int[0];
        } else {
            int l = 0;
            for (int k : left) {
                for (int i = 0; i < right.length - 1; i++) {
                    if (k != right[i]) {
                        res[l++] = k;
                    }
                }
            }
        }
        return res;
    }
}