package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        //int h =
        return (p / (2 * (k + 1))) * k;
        //   int l = h * k;
        //  return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
