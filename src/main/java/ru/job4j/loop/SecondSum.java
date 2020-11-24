package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i += 2) {
            sum += i;
        }
        return sum;
    }
}

