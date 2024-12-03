package ru.job4j.condition.tasks;

/**
 * метод midDigitMore(int num), который принимает целое трехзначное число.
 * Задание: Написать код, который определяет, является ли средняя цифра этого числа больше остальных.
 * Вывести в консоль "Да", если является, и "Нет", если не является.
 */

public class Task72 {
    public static void midDigitMore(int num) {
        System.out.println(num % 100 / 10 > num / 100 && num % 100 / 10 > num % 10 ? "Да" : "Нет");
    }
}
