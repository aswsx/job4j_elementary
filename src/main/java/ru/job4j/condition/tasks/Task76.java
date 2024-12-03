package ru.job4j.condition.tasks;

/**
 * метод innerNum(int num2, int num4), который принимает 2 целых числа - num2 - двузначное, num4 - четырехзначное.
 * Задание: Написать код, который определяет и выводит в консоль количество раз, когда двузначное число фигурирует
 * как "внутреннее" по отношению к четырехзначному. То есть какая-то пара смежных цифр в четырехзначном числе образует
 * входящее двузначное число от 0 до 3 раз.
 */

public class Task76 {
    public static void innerNum(int num2, int num4) {
        int count = 0;

        if (num2 == num4 / 100) {
            count++;
        }
        if (num2 == num4 % 1000 / 10) {
            count++;
        }
        if (num2 == num4 % 100) {
            count++;
        }
        System.out.println(count);
    }
}

