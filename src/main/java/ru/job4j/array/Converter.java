package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int arrayElementQty = 0;
        for (int[] rows : array) {
            arrayElementQty += rows.length;
        }

        int sqArSize = (int) Math.ceil(Math.sqrt(arrayElementQty));
        int[][] squareArray = new int[sqArSize][sqArSize];
        int squareArRow = 0, squareArCell = 0;

        for (int[] rows : array) {
            for (int cells : rows) {
                squareArray[squareArRow][squareArCell] = cells;
                squareArCell++;
                if (squareArCell == sqArSize) {
                    squareArCell = 0;
                    squareArRow++;
                }
            }
        }
        return squareArray;
    }
}
