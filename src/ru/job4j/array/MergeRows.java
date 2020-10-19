package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] out = new int[9];
        int index = 0;
        for (int i = 0; i <= data.length - 1; i++) {
            for (int j = 0; j <= data.length - 1; j++) {
                out[index] = data[i][j];
                index++;
            }
        }
        return out;
    }
}
