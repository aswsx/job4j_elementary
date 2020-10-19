package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] out = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            if (!Character.isLowerCase(string[i])) {
                out[i] = string[i];
            } else {
                out[i] = Character.toUpperCase(string[i]);
            }
        }
        return out;
    }
}