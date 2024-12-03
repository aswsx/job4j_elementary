package ru.job4j.condition.tasks;

/**
 * метод season(int number), который принимает целое число, которое должно соответствовать одному из
 * порядковых номеров месяцев.
 * Задание: Написать код, который выводит в консоль время года, к которому относится этот месяц
 * ("Весна", "Лето", "Осень", "Зима"). Если входящее число не соответствует какому-либо месяцу -
 * вывести "Не является месяцем".
 */

public class Task65 {
    public static void season(int number) {
        switch (number) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Не является месяцем");
        }
    }
}
