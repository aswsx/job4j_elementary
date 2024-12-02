package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        /**      // for (int index = 0; index < array.length; index++) {
         //            if (array[index] == null) {
         //                for (int i = index; i < array.length; i++) {
         //                    if (array[i] != null) {
         //                        array[index] = array[i];
         //                        array[i] = null;
         //                        break;
         //                    }
         //                }
         //            }

         //            for (int i = array.length - 1; i > 0; i--) {
         //                if (array[i - 1] == null) {
         //                    array[i - 1] = array[i];
         //                    array[i] = null;
         //                }
         //            } */

        for (int i = 0, j = 0; j < array.length; j++) {
            if (array[j] != null) {
                if (i < j) {
                    String tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
                i++;
            }
        }
        /**  //    System.out.print(array[index] + " "); */

        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}