package ru.job4j.condition.tasks;

/**
 * метод secondsToMinutes(int seconds), который принимает целое число - промежуток времени, выраженный в секундах.
 * Задание: Написать код, который переводит этот промежуток времени в промежуток, выраженный минутами и секундами.
 * Результат вывести в консоль в виде "Минут: x, секунд: y", где x - минуты, y - секунды. Если входящий промежуток
 * времени превышает один час, то вывести "Расчет не производится".
 */

public class Task70 {
    public static void secondsToMinutes(int seconds) {
        if (seconds > 3600) {
            System.out.println("Расчет не производится");
        } else {
            System.out.println("Минут: " + seconds / 60 + ", " + "секунд: " + seconds % 60);
        }
    }
}
