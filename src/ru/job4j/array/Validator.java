package ru.job4j.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int valQty = 0;
        for (int datum : data) {
            if (datum == value) {
                valQty++;
            }
        }
        return valQty < data.length / 2;
    }
}