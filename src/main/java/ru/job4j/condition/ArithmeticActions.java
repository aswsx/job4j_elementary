package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String action;
        if (rsl == left + right) {
            action = "added";
        } else if (rsl == left - right || rsl == right - left) {
            action = "subtracted";
        } else if (rsl == left * right) {
            action = "multiplied";
        } else if (rsl == left / right || rsl == right / left) {
            action = "divided";
        } else {
            action = "none";
        }
        return action;
    }
}
