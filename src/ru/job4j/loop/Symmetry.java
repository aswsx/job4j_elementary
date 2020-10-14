package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String s = String.valueOf(i);
        for (int j = 0; j < (s.length() / 2); j++) {
            if (s.charAt(j) != s.charAt(s.length() - j - 1)) {
                return false;
            }
        }
        return true;
    }
}