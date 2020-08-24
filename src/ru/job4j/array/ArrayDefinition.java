package ru.job4j.array;

public class ArrayDefinition {
    short[] ages = new short[10];
    String[] surnames = new String[100500];
    float[] prices = new float[40];
    public static void main(String[] args) {
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
