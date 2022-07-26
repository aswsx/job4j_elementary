package ru.job4j.map;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> letters = new HashMap<>();
        str = str.toLowerCase();
        str = str.replaceAll("\\s+", "");
        char[] chars = str.toCharArray();
        char rsl = ' ';
        int counter = 0;
        for (char letter : chars) {
            letters.computeIfPresent(letter, (key, value) -> value + 1);
            letters.putIfAbsent(letter, 0);
        }
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            if (entry.getValue() > counter) {
                rsl = entry.getKey();
                counter = entry.getValue();
            }
        }
        return rsl;
    }
}