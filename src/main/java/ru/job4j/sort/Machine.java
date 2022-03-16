package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int index = 0;
        int change = money - price;

        for (int coin : coins) {
            while (change >= coin) {
                change = change - coin;
                rsl[index] = coin;
                index++;
            }
        }
        return Arrays.copyOf(rsl, index);
    }
}
