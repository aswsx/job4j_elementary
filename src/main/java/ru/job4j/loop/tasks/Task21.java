package ru.job4j.loop.tasks;
/**
 * Написать код, который выводит в консоль через пробел в порядке убывания все положительные двузначные числа до 38,
 * делящиеся на 5 без остатка. Перед началом вывода нужно вывести слово "Старт" в отдельной строке, а после
 * окончания вывода чисел - слово "Финиш", тоже в отдельной строке.
 */

import java.util.StringJoiner;

public class Task21 {
    public static void loop() {

        StringJoiner sj = new StringJoiner(" ", "Старт\n", "\nФиниш");

        for (int i = 38; i > 9; i--) {
            if (i % 5 == 0) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(sj);
    }
}
