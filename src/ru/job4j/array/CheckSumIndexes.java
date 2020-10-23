package ru.job4j.array;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                index++;
                if (i + j == 3) {
                    data[i][j] = 0;
                    index--;
                }
            }
        }
        int[] result = new int[index];
        int ind = 0;
        for (int[] datum : data) {
            for (int cell : datum) {
                if (cell != 0) {
                    result[ind] = cell;
                    ind++;
                }
            }
        }
        return result;
    }
}