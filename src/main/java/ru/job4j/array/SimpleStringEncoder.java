package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                counter++;
            } else {
                result += (input.charAt(i - 1));
                if (counter > 1) {
                    result += counter;
                }
                counter = 1;
            }
        }
        result += (input.charAt(input.length() - 1));
        if (counter > 1) {
            result += counter;
        }
        return result;
    }
}
