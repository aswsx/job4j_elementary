package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        for (int i = 0; i < data.length && data[i] != el; i++) {
            sum += data[i];
        }
        if (sum % 2 != 0) {
            sum = 0;
        }
        return sum;
    }
}

