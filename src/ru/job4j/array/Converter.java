package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int arrayElementQty = 0;
        for (int[] rows : array) {
            arrayElementQty += rows.length;
        }

        int[] linearArray = new int[arrayElementQty];
        int index = 0;
        for (int[] rows : array) {
            for (int elem : rows) {
                linearArray[index] = elem;
                index++;
            }
        }
        int squareArraySize;
        double sqArSize = Math.sqrt(arrayElementQty);
        if (sqArSize % 1 == 0) {
            squareArraySize = (int) sqArSize;
        } else {
            squareArraySize = (int) (sqArSize + 1);
        }
        int[][] squareArray = new int[squareArraySize][squareArraySize];
        int ind = 0;

        while (ind < linearArray.length) {
            for (int i = 0; i < squareArraySize; i++) {
                for (int j = 0; j < squareArraySize; j++) {
                        squareArray[i][j] = linearArray[ind];
                        ind++;
                    }
                }
            }
        return squareArray;
    }
}
