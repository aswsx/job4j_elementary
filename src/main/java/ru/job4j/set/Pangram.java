package ru.job4j.set;

import java.util.*;

public class Pangram {
    public static boolean checkString(String s) {
        s = s.replaceAll("\\s+", "");
        s = s.toLowerCase();
        Set<String> set = new HashSet<>(Arrays.asList(s.split("")));
        return set.size() == 26;
    }
}