package ru.job4j.loop.tasks;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль через пробел в порядке убывания все четырехзначные числа от 1050 до 1550,
 * оканчивающиеся на 00. Перед началом вывода нужно вывести слово "Начало" в отдельной строке, а после окончания
 * вывода чисел - слово "Конец", тоже в отдельной строке.
 */

public class Task20 {
    public static void loop() {

        StringJoiner sj = new StringJoiner(" ", "Начало\n", "\nКонец");

        for (int i = 1550; i > 1050; i -= 50) {
            if (i % 100 == 0 && i % 10 == 0) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(sj);
    }
}
