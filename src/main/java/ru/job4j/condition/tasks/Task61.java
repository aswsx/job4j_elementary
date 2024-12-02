package ru.job4j.condition.tasks;

/**
 * Метод hasEqualDigits(int number), который принимает целое трехзначное число.
 * Написать код, который проверяет, состоит ли это число из одинаковых цифр, и выводит в консоль "Да",
 * если состоит, и "Нет", если не состоит
 */

public class Task61 {
    public static void hasEqualDigits(int number) {
        System.out.println(number / 100 == number % 100 / 10 && number / 100 == number % 10 ? "Да" : "Нет");
    }
}
