package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] result = new int[n]; //выходной массив длиной n
        result[0] = a;
        result[1] = b;
        int temp = a + b;// переменная в которой суммируем значения элементов

        for (int i = 2; i < n; i++) {// проходим циклом по массиву
            result[i] = temp; //в соответствующий элемент записывам значение temp
            temp += result[i];// прибавляем к temp текущее значение
        }
        return result;
    }
}

