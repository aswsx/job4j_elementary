package ru.job4j.condition.tasks;

/**
 * метод midDigitLess(int num), который принимает целое трехзначное число.
 * Задание: Написать код, который определяет, является ли средняя цифра этого числа меньше остальных.
 * Вывести в консоль "Да", если является, и "Нет", если не является.
 */

public class Task73 {
    public static void midDigitLess(int num) {
        System.out.println(num % 100 / 10 < num / 100 && num % 100 / 10 < num % 10 ? "Да" : "Нет");
    }
}
