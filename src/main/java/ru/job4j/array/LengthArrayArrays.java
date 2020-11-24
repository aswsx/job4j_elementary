package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbersArray = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int[] ints : numbersArray) {
            System.out.println("Размер вложенного массива равен: " + ints.length);
        }
    }
}
