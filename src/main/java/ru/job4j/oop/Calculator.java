package ru.job4j.oop;

public class Calculator {

    private static final int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int d) {
        return d / x;
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