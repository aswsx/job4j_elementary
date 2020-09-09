package ru.job4j.ex;

public class ElementNotFoundException extends Exception {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException();
        }
        return rsl;
    }


    public static void main(String[] args) {
        String[] value = {"1", "2", "3", "4", "5"};
        try {
            indexOf(value, "");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
