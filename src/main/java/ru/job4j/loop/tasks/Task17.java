package ru.job4j.loop.tasks;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел все положительные четные двузначные числа
 * до 19 в порядке возрастания. Перед началом вывода нужно вывести слово "Начало" в отдельной строке,
 * а после окончания вывода чисел - слово "Конец", тоже в отдельной строке.
 * Примечание: в этом и последующем упражнении для сборки результирующей строки с выводом значений
 * через пробел нужно использовать StringJoiner.
 */

public class Task17 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        System.out.println("Начало");
        for (int i = 10; i < 19; i += 2) {
            sj.add(Integer.toString(i));
        }
        System.out.println(sj.toString());
        System.out.println("Конец");
    }
}
