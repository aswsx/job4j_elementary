package ru.job4j.condition;

public class MultipleSwitchWeek {
    public int numberOfDay(String name) {
        switch (name) {
            case "Понедельник", "Monday":
                return 1;
            case "Вторник", "Tuesday":
                return 2;
            case "Среда", "Wednesday":
                return 3;
            case "Четверг", "Thursday":
                return 4;
            case "Пятница", "Friday":
                return 5;
            case "Суббота", "Sunday":
                return 6;
            case "Воскресенье", "Saturday":
                return 7;
            default:
                return -1;
        }
    }
}