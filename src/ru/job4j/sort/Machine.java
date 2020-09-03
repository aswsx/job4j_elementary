package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int index = 0;
        int change = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (change >= COINS[i]) {
                change = change - COINS[i];
                rsl[index] = COINS[i];
                size = index + 1;
                index++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
