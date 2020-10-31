package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        char[] temp = new char[str.length];
        int commonCount = 0;
        int index = 0;
        for (char value : str) {
            if (value != c) {
                temp[index++] = value;
            } else {
                result[commonCount] = Arrays.copyOf(temp, index);
                commonCount++;
                index = 0;
            }
        }
        result[commonCount] = Arrays.copyOf(temp, index);
        return Arrays.copyOf(result, commonCount + 1);
    }
}