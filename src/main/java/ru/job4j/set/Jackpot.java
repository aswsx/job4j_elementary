package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    //    public static boolean checkYourWin(String[] combination) {
//        for (String str : combination) {
//            if (!(str.equals(combination[0]))) {
//                return false;
//            }
//        }
//        return true;
//    }
// }
    public static boolean checkYourWin(String[] combination) {
       Set<String> rsl = new HashSet<>(Arrays.asList(combination));
       return rsl.size() == 1;
    }
}