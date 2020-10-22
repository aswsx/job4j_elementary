package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int squareArraySize; //размер квадратного массива
        int arrayElementQty = 0; //количество элементов массива array
       //расчет количества элементов
        for (int[] rows : array) {
            arrayElementQty += rows.length;
        }
//создание линейного массива длиной, равной количеству элементов
        int[] linearArray = new int[arrayElementQty];
//расчет размера квадратного массива
        double sqArSize = Math.sqrt(arrayElementQty); // корень из количества элементов
        if (sqArSize % 1 == 0) { // если корень целое число
            squareArraySize = (int) sqArSize; //размер квадратного массива равен корню
        } else {
            squareArraySize = (int) (sqArSize + 1); //иначе размер равен корень плюс 1
        }
//создание квадратного массива
        int[][] squareArray = new int[squareArraySize][squareArraySize];
// исходя из длины (кол-ва строк исходного массива array) и длины каждой строки, чтение элементов из array и
// запись их в линейный массив
        int index = 0;
        for (int[] rows : array) {
            for (int elem : rows) {
                linearArray[index] = elem;
                index++;
            }
        }
//считывание элементов из линейного массива и запись их в квадратный массив.
        int ind = 0;
        for (int i = 0; i < squareArraySize; i++) {
            for (int j = 0; j < squareArraySize; j++) {
                if (ind < linearArray.length) {
                    squareArray[i][j] = linearArray[ind];
                    ind++;
                } else {
                    break;
                }
            }
        }
        return squareArray;
    }
}
