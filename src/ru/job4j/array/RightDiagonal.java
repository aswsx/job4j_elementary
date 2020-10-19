package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] out = new int[3];
        for (int i = 0; i <= data.length - 1; i++) {
            out[i] = data[i][data.length - i - 1];
        }
        return out;
    }
}
