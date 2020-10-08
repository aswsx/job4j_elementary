package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        return left.charAt(0) == right.charAt(0) || left.charAt(1) == right.charAt(1);
    }
}