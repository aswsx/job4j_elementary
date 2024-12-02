package ru.job4j.condition.tasks;

/**
 * метод isWinning(int number), который принимает целое шестизначное число.
 * В этой задаче нужно определить выигрышный билет. Пусть выигрышным считается такой билет, где сумма
 * первых трех цифр входящего числа равна сумме последних трех цифр этого числа, и обе эти суммы являются четными.
 * Задание: Написать код, который проверяет, является ли такой билет выигрышным, и выводит в консоль "Да",
 * если является, и "Нет", если не является.
 */

public class Task58 {
    public static void isWinning(int number) {
        int firstPart = number / 1000;
        int secondPart = number % 1000;
        int firstSum = firstPart / 100 + firstPart % 100 / 10 + firstPart % 10;
        int secondSum = secondPart / 100 + secondPart % 100 / 10 + secondPart % 10;
        System.out.println(firstSum == secondSum ? "Да" : "Нет");
    }
}
