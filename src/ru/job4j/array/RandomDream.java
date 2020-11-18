package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String prize = null;
        if (num < 4) {
            num += 4;
        }
        int xxx = num % 4; //(int) rnd;
        switch (xxx) {
            case 1 -> prize = prizes[0];
            case 2 -> prize = prizes[1];
            case 3 -> prize = prizes[2];
            case 0 -> prize = prizes[3];
        }
        return prize;
    }
}
