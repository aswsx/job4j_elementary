package ru.job4j.array;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] res = new int[0];
        if (left.length == 0 && right.length == 0 ||
                left.length == 1 && right.length == 1 && left[0] == right[0]) {
            return res;
        } else if (left.length == 1) {
            res = new int[1];
            res[0] = left[0];
        } else if (right.length == 1) {
            res = new int[1];
            res[0] = right[0];
        } else {
            int[] merge = new int[left.length + right.length];
            int k = 0;
            for (int n : left) {
                merge[k++] = n;
            }
            for (int n : right) {
                merge[k++] = n;
            }
            int len = merge.length;
            for (int i = 0; i < len - 1; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (merge[i] == merge[j]) {
                        merge[i] = merge[i + 2];
                        len -= 2;
                    }
                }
            }
            res = new int[len];
            if (res.length >= 0) {
                System.arraycopy(merge, 0, res, 0, res.length);
            }
        }
        return res;
    }
}