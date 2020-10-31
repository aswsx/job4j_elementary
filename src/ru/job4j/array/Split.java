package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 1;
        int m = 0;
        int i = 0;
        while (str[m] != c) {
            for (int j = 0; j < result.length; j++) {
                result[j][i++] = str[m++];
            }
        }
        return Arrays.copyOf(result, commonCount);
    }
}
