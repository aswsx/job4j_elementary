package ru.job4j.array;

public class SortSelectedByGPT {
    public class SortSelected {
        public static int[] sort(int[] data) {
            int[] sorted = new int[data.length];
            for (int i = 0; i < data.length; i++) {
                int min = MinDiapason.findMin(data, i, data.length - 1);
                int index = FindLoop.indexOf(data, min, i, data.length - 1);
                sorted = SwitchArray.swap(data, index, i);
            }
            return sorted;
        }
    }
}

