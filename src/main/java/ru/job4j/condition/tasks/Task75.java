package ru.job4j.condition.tasks;

/**
 * метод sameNumAmount(int num), который принимает целое положительное трехзначное число.
 * Задание: Написать код, который определяет и выводит в консоль количество одинаковых цифр в этом числе.
 */

public class Task75 {
    public static void sameNumAmount(int num) {
        int hundreds = num / 100;
        int tens = num % 100 / 10;
        int ones = num % 10;
        int count = 0;

        if (hundreds == tens) {
            count = 2;
        }
        if (tens == ones) {
            count = 2;
        }
        if (ones == hundreds) {
            count++;
        }
        System.out.println(count);
    }
}
