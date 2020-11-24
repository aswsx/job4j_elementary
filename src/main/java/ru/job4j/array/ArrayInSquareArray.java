package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int[][] out = new int[array.length / 3 + 1][array.length / 3 + 1];
        int counter = 0;

        for (int i = 0; i <= out.length - 1; i++) {
            for (int j = 0; j <= out.length - 1; j++) {
                out[i][j] = array[counter];
                counter++;
                if (counter >= array.length) {
                    break;
                }
            }
        }
        return out;
    }
}