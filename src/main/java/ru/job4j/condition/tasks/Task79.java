package ru.job4j.condition.tasks;

/**
 * метод getCentury(int num), который принимает целое положительное четырехзначное число,
 * определяющее некоторый год в период с 16 по 20 века включительно.
 * Задание: Написать код, который определяет и выводит в консоль век,
 * к которому относится входящее число. Если число не относится к указанным векам, вывести - "Не попадает в диапазон"
 */

public class Task79 {
    public static void getCentury(int num) {
        int century = num / 100;
        int hundred = num % 100;

        System.out.println(num < 1500 || num > 2000 ? "Не попадает в диапазон" : (hundred == 0 ? century : century + 1));
    }
}
