package ru.job4j.condition.tasks;

import java.util.StringJoiner;

public class Task57 {
    public static void triangleType(int a, int b) {
        int c = 180 - a - b;
        StringJoiner sj = new StringJoiner(" ");

        if (a + b > 180 || a + c > 180 || b + c > 180) {
            System.out.println("Ошибка");
        } else {
            if (a < 90 && b < 90 && c < 90) {
                sj.add("Остроугольный");
            }
            if (a == 90 || b == 90 || c == 90) {
                sj.add("Прямоугольный");
            }
            if (a > 90 || b > 90 || c > 90) {
                sj.add("Тупоугольный");
            }
            if (a == b || b == c || c == a) {
                sj.add("Равнобедренный");
            }
            if (a == b && a == c && a == 60) {
                sj.add("Равносторонний");
            }
            System.out.println(sj);
        }
    }
}
