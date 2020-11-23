package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String prize = null;
        if (num < 4) {
            num += 4;
        }
        int xxx = num % 4; //(int) rnd;
        if (xxx == 1) {
            prize = prizes[0];
        } else if (xxx == 2) {
            prize = prizes[1];
        } else if (xxx == 3) {
            prize = prizes[2];
        } else if (xxx == 0) {
            prize = prizes[3];
        }
        return prize;
    }
}
