package ru.job4j.condition;

public class Max {
    private Max() {
    }

    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int first, int second, int third) {
        return Math.max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return Math.max(Math.max(first, second), Math.max(third, fourth));
    }
}

