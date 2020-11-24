package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        for (int i = 0; i < array.length; i++) {
            if (i < row) {
                array[i][column] = array[i + 1][column];
            }
            if (i > row) {
                array[array.length - i + 2][column] = array[array.length - i + 1][column];
            }
            if (i < column) {
                array[row][i] = array[row][i + 1];
            }
            if (i > column && array.length % 2 == 0) {
                array[row][array.length - i + 1] = array[row][array.length - i];
            }
            if (i > column && array.length % 2 != 0) {
                array[row][array.length - i + 2] = array[row][array.length - i + 1];
            }
        }
        array[row][column] = 0;
    }
}