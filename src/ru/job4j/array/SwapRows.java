package ru.job4j.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int temp = 0;

        for (int i = 0; i < data[0].length; i++) {
            temp = data[dst][i];
            data[dst][i] = data[src][i];
            data[src][i] = temp;
        }
    }
}

