package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double actualDebt = amount + amount * percent / 100;
        double payment;

        while (actualDebt > 0) {
            payment = actualDebt - salary;
            actualDebt = payment + payment * percent / 100;
            year++;
        }
        return year;
    }
}