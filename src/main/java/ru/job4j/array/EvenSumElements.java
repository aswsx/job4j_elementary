package ru.job4j.array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int datum : data) {
            sum += datum;
        }
        return sum % 2 == 0;
    }
}