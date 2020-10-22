package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int squareArraySize; //размер квадратного массива
        int arrayElementQty = 0; //количество элементов массива array
        int arrayLength = array.length; //длина массива array (количество строк)
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
//создание линейного массива, заполненного длинами строк массива array, для использования в цикле
        int[] arQty = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arQty[i] = array[i].length; //заполнение нового массива длинами строк
        }
// исходя из длины (кол-ва строк исходного массива array) и длины каждой строки, чтение элементов из array и
// запись их в линейный массив
        int index = 0;
        for (int i = 0; i < arrayLength; i++) {
            int size = arQty[i]; //количество проходов второго цикла
            if (index <= linearArray.length - 1) {
                for (int j = 0; j < size; j++) {
                    linearArray[index] = array[i][j];
                    index++;
                }
            } else {
                break;
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
