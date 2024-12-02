package ru.job4j.condition.tasks;

public class Task56 {
    public static void isTriangle(int a, int b, int c) {
        if ((a >= b + c || b >= a + c || c >= a + b)) {
            System.out.println("Нет");
        } else {
            System.out.println("Да");
        }
    }
}