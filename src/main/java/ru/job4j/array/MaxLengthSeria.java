package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int length = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] >= array[i]) {
                length++;
            } else {
                length = 1;
            }
        }
        return length;
    }
}

