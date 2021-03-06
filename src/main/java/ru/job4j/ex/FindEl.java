package ru.job4j.ex;

public class FindEl extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int count = 0;
        for (String i : value) {
            if (i.equals(key)) {
                rsl = count;
                break;
            }
            count++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Элемент не найден");
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
