package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int extra = 0;
        if (count > n) {
            extra = count + count / n;
        }
        return extra;
    }
}

