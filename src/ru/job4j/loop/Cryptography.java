package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.equals("")) {
            s = "empty";
        } else if (s.length() > 4) {
            StringBuilder str = new StringBuilder(s);
            for (int i = s.length() - 5; i >= 0; i--) {
                str.setCharAt(i, '#');
            }
            s = str.toString();
        }
        return s;
    }
}