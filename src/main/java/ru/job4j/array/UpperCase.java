package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] out = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            out[i] = Character.toUpperCase(string[i]);
        }
        return out;
    }
}