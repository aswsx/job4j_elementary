package ru.job4j.loop.tasks;

import java.util.StringJoiner;

/**
 * метод loop(int a, int b), который принимает 2 целых числа.
 * Задание: Написать код, который выводит в консоль через пробел все положительные двузначные числа в диапазоне
 * от первого числа (включая) до второго числа (не включая) в возрастающем порядке. Перед началом вывода нужно
 * вывести слово "Старт" в отдельной строке, а после окончания вывода чисел - слово "Финиш", тоже в отдельной строке.
 * Примечание: в этом и последующем упражнении для сборки результирующей строки с выводом значений через пробел
 * нужно использовать StringJoiner.
 */

public class Task14 {
    public static void loop(int a, int b) {
        StringJoiner sj = new StringJoiner(" ");

        if (a < 10) {
            a = 10;
        }

        System.out.println("Старт");

        for (int i = a; i < b; i++) {
            sj.add(Integer.toString(i));
        }
        System.out.println(sj.toString());
        System.out.println("Финиш");
    }
}
