package ru.job4j.loop.tasks;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль все однозначные положительные числа. Перед началом вывода нужно
 * вывести слово "Старт" в отдельной строке, а после окончания вывода чисел - слово "Финиш", тоже в отдельной строке.
 * Примечание: в этом и последующем упражнении для сборки результирующей строки с выводом значений через пробел
 * нужно использовать StringJoiner.
 */

public class Task16 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");

        System.out.println("Старт");
        for (int i = 1; i < 10; i++) {
            sj.add(String.valueOf(i));
        }
        System.out.println(sj.toString());
        System.out.println("Финиш");
    }
}
