package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        return prizes[num % 4 == 0 ? 3 : num % 4 - 1];
    }
}
