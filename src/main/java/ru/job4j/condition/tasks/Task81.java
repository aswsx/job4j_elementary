package ru.job4j.condition.tasks;

/**
 * метод isLatin(char s), который принимает символьное значение.
 * * Задание: Написать код, который определяет является ли это значение символом латинского алфавита.
 * Вывести в консоль "Да", если является, и "Нет", если не является.
 */

public class Task81 {
    public static void isLatin(char s) {
        System.out.println(Character.isLetter(s) ? "Да" : "Нет");
    }
}
