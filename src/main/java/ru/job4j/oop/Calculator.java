package ru.job4j.oop;

public class Calculator {

    private static final int X = 5;

    public static int sum(int y) {
        return X + y;
    }

    public int multiply(int a) {
        return X * a;
    }

    public static int minus(int b) {
        return b - X;
    }

    public int divide(int d) {
        return d / X;
    }

    public int sumAllOperations(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sumResult = Calculator.sum(10);
        int multResult = sum(10);
        int minusResult = calc.multiply(5);
        int divideResult = calc.divide(6);
        int sumAllOperationsResult = calc.sumAllOperations(5);
        System.out.printf("sum = %d%n", sumResult);
        System.out.printf("minus = %d%n", minusResult);
        System.out.printf("multiply = %d%n", multResult);
        System.out.printf("divide = %d%n", divideResult);
        System.out.printf("all operations = %d", sumAllOperationsResult);
    }
}