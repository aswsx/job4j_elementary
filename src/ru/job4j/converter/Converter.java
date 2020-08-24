package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static void main(String[] args) {
        int euroIn = 140;
        int euroExpected = 2;
        int euroOut = rubleToEuro(euroIn);
        int dollarIn = 250;
        int dollarExpected = 4;
        int dolOut = rubleToDollar(dollarIn);
        boolean euPassed = euroExpected == euroOut;
        boolean dolPassed = dollarExpected == dolOut;
        System.out.println("140 rubles are 2 euro. Test result : " + euPassed);
        System.out.println("250 rubles are 4 dollars. test result : " + dolPassed);
    }
}
