package ru.job4j.loop;

public class Abbreviation {
    public static String collect(final String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}