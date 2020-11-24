package ru.job4j.condition;

public class MultipleSwitchWeek {
    public int numberOfDay(String name) {

        if (name.equals("Понедельник") || name.equals("Monday")) {
            return 1;
        } else if (name.equals("Вторник") || name.equals("Tuesday")) {
            return 2;
        } else if (name.equals("Среда") || name.equals("Wednesday")) {
            return 3;
        } else if (name.equals("Четверг") || name.equals("Thursday")) {
            return 4;
        } else if (name.equals("Пятница") || name.equals("Friday")) {
            return 5;
        } else if (name.equals("Суббота") || name.equals("Sunday")) {
            return 6;
        } else if (name.equals("Воскресенье") || name.equals("Saturday")) {
            return 7;
        } else {
            return -1;
        }
    }
}