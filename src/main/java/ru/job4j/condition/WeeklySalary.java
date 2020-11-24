package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;

        for (int i = 0; i < hours.length; i++) {
            if (i < 5) {
                if (hours[i] <= 8) {
                    salary = salary + hours[i] * 10;
                } else {
                    salary = salary + 80 + (hours[i] - 8) * 15;
                }
            } else {
                if (hours[i] <= 8) {
                    salary = salary + hours[i] * 20;
                } else {
                    salary = salary + 160 + (hours[i] - 8) * 30;
                }
            }
        }
        return salary;
    }
}
