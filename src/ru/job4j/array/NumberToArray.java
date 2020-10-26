package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        int[] rsl = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rsl[digits.length - i - 1] = Integer.parseInt(String.valueOf(digits[i]));
        }
        return rsl;
    }
}