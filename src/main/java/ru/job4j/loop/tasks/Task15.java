package ru.job4j.loop.tasks;

import java.util.StringJoiner;

/**
 * метод loop(int a, int b), который принимает 2 целых числа.
 * Задание: Написать код, который выводит в консоль через пробел все положительные трехзначные числа
 * в диапазоне от второго числа (включая) до первого числа (не включая) в убывающем порядке. Перед началом
 * вывода нужно вывести слово "Старт" в отдельной строке, а после окончания вывода чисел - слово "Финиш",
 * тоже в отдельной строке.
 * Примечание: в этом и последующем упражнении для сборки результирующей строки с выводом значений через
 * пробел нужно использовать StringJoiner.
 */

public class Task15 {
    public static void loop(int a, int b) {
        StringJoiner sj = new StringJoiner(" ");

        if (a < 100) {
            a = 100;
        }
        System.out.println("Старт");
        for (int i = b; i > a; i--) {
            sj.add(String.valueOf(i));
        }
        System.out.println(sj.toString());
        System.out.println("Финиш");
    }
}