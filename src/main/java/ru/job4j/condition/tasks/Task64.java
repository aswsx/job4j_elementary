package ru.job4j.condition.tasks;

/**
 * метод gradePrint(int number), который принимает целое число.
 * Задание: Написать код, который выводит в консоль текстовую форму оценки: 1-2 - "Плохо",
 * 3 - "Удовлетворительно", 4 - "Хорошо", 5 - "Отлично". Если число не соответствует какой-либо
 * оценке - вывести "Не соответствует".
 */

public class Task64 {
    public static void gradePrint(int number) {
        switch (number) {
            case 1, 2 -> System.out.println("Плохо");
            case 3 -> System.out.println("Удовлетворительно");
            case 4 -> System.out.println("Хорошо");
            case 5 -> System.out.println("Отлично");
            default -> System.out.println("Не соответствует");
        }
    }
}
