package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int arrayElementQty = 0; //количество элементов массива array
        for (int[] rows : array) {
            arrayElementQty += rows.length; //расчет количества элементов
        }
        int[] linearArray = new int[arrayElementQty]; //создание линейного массива длиной, равной количеству элементов
        int index = 0;
        for (int[] rows : array) { // исходя из длины (кол-ва строк исходного массива array)
            for (int elem : rows) { // и длины каждой строки, чтение элементов из array и
                linearArray[index] = elem; // запись их в линейный массив
                index++;
            }
        }
        int squareArraySize; //размер квадратного массива
        double sqArSize = Math.sqrt(arrayElementQty); // корень из количества элементов
        if (sqArSize % 1 == 0) { // если корень целое число
            squareArraySize = (int) sqArSize; //размер квадратного массива равен корню
        } else {
            squareArraySize = (int) (sqArSize + 1); //иначе размер равен корень плюс 1
        }
        int[][] squareArray = new int[squareArraySize][squareArraySize]; //создание квадратного массива
        int ind = 0;

        while (ind < linearArray.length) {
            for (int i = 0; i < squareArraySize; i++) { //считывание элементов из линейного массива
                for (int j = 0; j < squareArraySize; j++) {
                        squareArray[i][j] = linearArray[ind]; //и запись их в квадратный массив.
                        ind++;
                    }
                }
            }
        return squareArray;
    }
}
