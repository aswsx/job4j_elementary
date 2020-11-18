package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};//массив с монетами, 4 мешка

    public int[] change(int money, int price) {
        int[] rsl = new int[100];// временный массив произвольного размера с запасом
        int size = 0;// будущий размер конечного массива
        int index = 0;// счетчик монет
        int change = money - price; // размер сдачи
        for (int i = 0; i < COINS.length; i++) { //цикл по мешкам с монетами
            while (change >= COINS[i]) { //цикл по монетам в  текущем мешке
                change = change - COINS[i]; // отнимаем от сдачи монету из мешка i
                rsl[index] = COINS[i]; // добавляем монету во временный массив
                size = index + 1; //увеличиваем размер конечного массива на 1
                index++; //увеличиваем счетчик монет на 1
            }
        }
        return Arrays.copyOf(rsl, size); //возвращаем копию временного массива, обрезая его по размеру size
    }
}
