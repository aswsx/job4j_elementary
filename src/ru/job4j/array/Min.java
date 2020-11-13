package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0]; // записываешь в переменную min содержимое первго элемента массива
        for (int i = 1; i < array.length; i++) { // i=1 потому что 0-ой элемент уже записан в min
            if (array[i] < min) { // если элемент массива под  индексом i меньше, чем min
                min = array[i]; //в min записываешь значение элемента под индексом i
            }
        }
        return min; // возвращаешь min
    }
}