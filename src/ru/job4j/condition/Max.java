package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = Math.max(left, right);
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = Math.max(first, max(second, third));
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = Math.max(Math.max(first, second), Math.max(third, fourth));
        return result;
    }
}
