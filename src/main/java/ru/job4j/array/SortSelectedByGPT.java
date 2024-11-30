package ru.job4j.array;

public class SortSelectedByGPT {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minIndex = MinDiapason.findMin(data, i, data.length - 1);
            SwitchArray.swap(data, minIndex, i);
        }
        return data;
    }
}

