package ru.job4j.condition.tasks;

/**
 * Написать код, который проверяет соотношение этих трех чисел с точки зрения значений (равны, больше, меньше).
 * Требуется вывести в консоль ответы на следующие ситуации:
 * - Если все числа равны между собой - вывести "Все равны".
 * - Если все числа не равны между собой - вывести "Равных нет".
 * - Если 2 числа равны и третье число больше них - вывести, например: "Первое и третье равны, второе больше"
 * или "Первое и второе равны, третье больше".
 * - Если 2 числа равны и третье число меньше них - вывести, например: "Первое и третье равны, второе меньше"
 * или "Второе и третье равны, первое меньше".
 */

public class Task60 {
    public static void numRelation(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("Все равны");
        } else if (a != b && a != c && b != c) {
            System.out.println("Равных нет");
        } else {
            if (a == b) {
                System.out.println(a > c ? "Первое и второе равны, третье меньше" : "Первое и второе равны, третье больше");
            } else if (b == c) {
                System.out.println(b > a ? "Второе и третье равны, первое меньше" : "Второе и третье равны, первое больше");
            } else {
                System.out.println(c > b ? "Первое и третье равны, второе меньше" : "Первое и третье равны, второе больше");
            }
        }
    }
}