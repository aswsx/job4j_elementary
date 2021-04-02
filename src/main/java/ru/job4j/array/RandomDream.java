package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        int index = num % prizes.length;
        int step = prizes.length - 1;
        return prizes[index == 0 ? step : index - 1];
    }
}
