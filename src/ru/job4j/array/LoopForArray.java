package ru.job4j.array;

public class LoopForArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 1; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}