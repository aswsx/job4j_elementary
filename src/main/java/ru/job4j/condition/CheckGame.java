package ru.job4j.condition;

public class CheckGame {
    public static int checkGame(double percent, int prize, int pay) {
        double benefit = percent * prize - pay;
        return benefit <= 0 ? 0 : (int) benefit;
    }
}