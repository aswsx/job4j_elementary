package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] out = new int[data.length / 2];
        int index = 0;
        while (index < out.length) {
            for (int datum : data) {
                if (datum % 2 != 0) {
                    out[index] = datum;
                    index++;
                }
            }
        }
        return out;
    }
}