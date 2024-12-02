package ru.job4j.condition.tasks;

/**
 * Ниже представлен метод transform(int number), который принимает целое трехзначное число.
 * Задание: Написать код, который выполняет следующее:
 * - Если число четное - все четные цифры этого числа увеличиваются на 1, а нечетные - уменьшаются на 1.
 * Если увеличение/уменьшение невозможно (например, увеличить 9), то оставить эту цифру без изменения.
 * - Если число нечетное, то все изменения произвести наоборот - четные цифры уменьшить на 1, нечетные - увеличить на 1.
 * Получившееся число вывести в консоль.
 */

public class Task54 {
    public static void transform(int number) {
        int result;

        int hundreds = Math.abs(number) / 100;

        int tens = (Math.abs(number) % 100) / 10;

        int ones = Math.abs(number) % 10;

        if (number % 2 == 0) {
            if (hundreds % 2 == 0 && hundreds < 9) {
                hundreds++;
            } else {
                hundreds--;
            }
            if (tens % 2 == 0) {
                tens++;
            } else {
                tens--;
            }
            if (ones % 2 == 0) {
                ones++;
            } else {
                ones--;
            }
        }

        if (number % 2 != 0) {
            if (hundreds % 2 == 0 && hundreds > 0) {
                hundreds--;
            } else if (hundreds < 9) {
                hundreds++;
            }
            if (tens % 2 == 0 && tens > 0) {
                tens--;
            } else if (tens < 9 && tens != 0) {
                tens++;
            }
            if (ones % 2 == 0 && ones > 0) {
                ones--;
            } else if (ones < 9) {
                ones++;
            }
        }

        if (number > 0) {
            result = hundreds * 100 + tens * 10 + ones;
        } else {
            result = (hundreds * 100 + tens * 10 + ones) * -1;
        }
        System.out.println(result);
    }
}
