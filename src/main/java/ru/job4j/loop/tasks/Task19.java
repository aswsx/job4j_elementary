package ru.job4j.loop.tasks;
/**
 * Написать код, который выводит в консоль через пробел в порядке возрастания все положительные трехзначные числа до 153
 * (не включая), оканчивающиеся на 7. Перед началом вывода нужно вывести слово "Старт" в отдельной строке,
 * а после окончания вывода чисел - слово "Финиш", тоже в отдельной строке.
 */

import java.util.StringJoiner;

public class Task19 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");

        System.out.println("Старт");

        for (int i = 107; i < 153; i++) {
            if (i % 10 == 7) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(sj);

        System.out.println("Финиш");
    }
}
