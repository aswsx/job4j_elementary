package ru.job4j.array;

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        return array[0] > array[array.length - 1] ? array[0] : array[array.length - 1];
    }
}