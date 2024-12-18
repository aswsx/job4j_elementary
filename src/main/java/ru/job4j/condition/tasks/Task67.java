package ru.job4j.condition.tasks;

/**
 * метод isTriangle(int a, int b, int c), который принимает 3 целых числа - углы треугольника.
 * Задание: Написать код, который проверяет, являются ли эти числа углами одного и того же треугольника,
 * и выводит в консоль "Да", если являются, и "Нет", если не являются.
 * Примечание: Сумма углов в треугольнике равна 180 градусам.
 */

public class Task67 {
    public static void isTriangle(int a, int b, int c) {
        System.out.println(a + b + c == 180 ? "Да" : "Нет");
    }
}
