package ru.job4j.condition.tasks;

/**
 * метод diffNumAmount(int num), который принимает целое положительное трехзначное число.
 * Задание: Написать код, который определяет и выводит в консоль количество разных цифр в этом числе.
 */

public class Task77 {
    public static void diffNumAmount(int num) {
        int hundreds = num / 100;
        int tens = num % 100 / 10;
        int ones = num % 10;
        int count = 0;

        if (hundreds != tens || tens != ones) {
            count = 2;
            if (hundreds != ones && tens != ones && hundreds != tens) {
                count++;
            }
        }
        System.out.println(count);
    }
}
