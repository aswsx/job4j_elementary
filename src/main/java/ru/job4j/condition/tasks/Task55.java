package ru.job4j.condition.tasks;

public class Task55 {
    public static void apartmentPlace(int number) {
        int floor = number / 3;
        int apart = number % 3;

        System.out.println(apart == 0 ? floor + System.lineSeparator() + 3 : floor + 1 + System.lineSeparator() + apart);
    }
}

