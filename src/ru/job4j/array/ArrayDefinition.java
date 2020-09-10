package ru.job4j.array;

public class ArrayDefinition {
    static short[] ages = new short[10];
    static String[] surnames = new String[100500];
    static float[] prices = new float[40];

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {
        System.out.println("ages length = " + ages.length);
        System.out.println("surnames length = " + surnames.length);
        System.out.println("prices length = " + prices.length);
        String[] names = new String[4];
        names[0] = "Vasya";
        names[1] = "Fedya";
        names[2] = "Vitya";
        names[3] = "Misha";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
