package ru.job4j.condition.tasks;

import java.util.StringJoiner;

/**
 * метод divWithoutRemainder(int num), который принимает целое положительное трехзначное число.
 * Задание: Написать код, который определяет и выводит в консоль, на какие числа из составляющих
 * входящее число цифр оно делится без остатка. Если таких чисел несколько, то вывести полученные
 * значения через пробел. Если таких чисел нет - вывести "Таких чисел нет".
 * Примечание: Учесть возможность того, что одной из цифр входящего числа может быть ноль.
 */

public class Task78 {
    public static void divWithoutRemainder(int num) {
        int hundreds = num / 100;
        int tens = num % 100 / 10;
        int ones = num % 10;
        StringJoiner sj = new StringJoiner(" ");

        if (hundreds != 0 && num % hundreds == 0) {
            sj.add(Integer.toString(hundreds));
        }
        if (tens != 0 && num % tens == 0) {
            sj.add(Integer.toString(tens));
        }
        if (ones != 0 && num % ones == 0) {
            sj.add(Integer.toString(ones));
        }
        System.out.println(sj.length() == 0 ? "Таких чисел нет" : sj);
    }
}
