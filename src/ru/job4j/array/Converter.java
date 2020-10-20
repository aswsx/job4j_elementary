package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int size = 0;
        int qty = 0;
        int len = array.length; //длина массива array (количество строк)

        for (int[] ints : array) {
            qty += ints.length; //количество элементов в array
        }
        int[] linear = new int[qty]; // линейный массив длиной равной кол-ву элементов array
        double xxx = Math.sqrt(qty); // корень из количества элементов

        if (xxx % 1 == 0) { // если корень целое число
            size = (int) xxx; //размер квадратного массива равен корню
        } else {
            size = (int) (xxx + 1);//иначе размер равен корень плюс 1
        }
        int[][] result = new int[size][size]; //новый квадратный массив
        int[] arQty = new int[len]; //новый линейный массив, количество элементов в каждой строке array
        for (int i = 0; i < len; i++) {
            arQty[i] = array[i].length; //заполняем новый массив длинами строк
        }

        int index = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < arQty[j]; j++) {
                linear[index] = array[i][j]; //заполняем линейный массив элементами array
                index++;
            }
        }

        int ind = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = linear[ind];
                ind++;
            }
        }
        return result;
    }
}