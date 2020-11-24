package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int maxSeqLen = 0;
        int curSeqLen = 0;
        int len = array.length;

        if (len == 2 && array[0] < array[1]) {
            maxSeqLen = 2;
        } else if (len == 1 || len == 2) {
            maxSeqLen = 1;
        } else {
            for (int i = 0; i < len - 1; i++) {
                if (array[i + 1] >= array[i]) {
                    ++curSeqLen;
                } else {
                    maxSeqLen = 1;
                }
            }
        }
        return Math.max(maxSeqLen, curSeqLen);
    }
}

