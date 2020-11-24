package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int index = 0;
        int change = money - price;

        for (int i = 0; i < coins.length; i++) {
            while (change >= coins[i]) {
                change = change - coins[i];
                rsl[index] = coins[i];
                index++;
            }
        }
        return Arrays.copyOf(rsl, index);
    }
}
