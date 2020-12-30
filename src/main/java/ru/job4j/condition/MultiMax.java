package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int res = first;
        if (first < second) {
            res = second;
        } else if (first < third) {
            res = third;
        }
        return res;
    }
}
