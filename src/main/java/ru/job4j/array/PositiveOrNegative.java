package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int negQty = 0;
        for (int datum : data) {
            if (datum < 0) {
                negQty++;
            }
        }
        return negQty % 2 != 0;
    }
}
