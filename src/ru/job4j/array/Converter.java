package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int squareArraySize;//размер квадратного массива
        int arrayElementQty = 0; //количество элементов массива array
        int arrayLength = array.length; //длина массива array (количество строк)
//вычисляем количество элементов
        for (int[] rows : array) {
            arrayElementQty += rows.length;
        }
//создаем линейный массив длиной равной количеству элементов
        int[] linearArray = new int[arrayElementQty];
//вычисляем размер квадратного массива
        double xxx = Math.sqrt(arrayElementQty); // корень из количества элементов
        if (xxx % 1 == 0) { // если корень целое число
            squareArraySize = (int) xxx; //размер квадратного массива равен корню
        } else {
            squareArraySize = (int) (xxx + 1);//иначе размер равен корень плюс 1
        }
//создаем квадратный массив
        int[][] squareArray = new int[squareArraySize][squareArraySize]; //новый квадратный массив
//создаем линейный массив, заполненный длинами строк массива array, для использования в цикле
        int[] arQty = new int[arrayLength]; //новый линейный массив, длиной равной количеству строк в array
        for (int i = 0; i < arrayLength; i++) {
            arQty[i] = array[i].length; //заполняем новый массив длинами строк
        }
//исходя из длины(кол-ва строк исходного массива array и длины каждой строки читаем элементы из array и
// записываем их в линейный массив
        int index = 0;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arQty[j]; j++) {
                linearArray[index] = array[i][j]; //Index 1 out of bounds for length 1
                index++;
            }
        }
//считываем элементы из линейного массива и записываем их в квадратный массив.
        int ind = 0;
        for (int i = 0; i < squareArraySize; i++) {
            if (ind < linearArray.length - 1) {
                for (int j = 0; j < squareArraySize; j++) {
                    squareArray[i][j] = linearArray[ind];
                    ind++;
                }
            } else {
                break;
            }
        }
        return squareArray;
    }
}