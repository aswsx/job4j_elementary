package ru.job4j.condition.tasks;

/**
 * метод isRising(int number), который принимает целое трехзначное число, состоящее из 3 разных цифр.
 * Задание: Написать код, который проверяет, располагаются ли цифры этого числа в порядке возрастания
 * (первая - наименьшая, третья - наибольшая, все цифры разные), и выводит в консоль "Да", если располагаются,
 * и "Нет", если не располагаются.
 */

public class Task62 {
    public static void isRising(int number) {
        System.out.println(number / 100 > number % 100 / 10 ? "Нет" : number % 100 / 10 > number % 10 ? "Нет" : "Да");
    }
}