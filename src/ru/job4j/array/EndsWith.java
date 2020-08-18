package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int wordInd = word.length - 1;
        for (int i = post.length - 1; i >= 0; i--) {
            if (word[wordInd] != post[i]) {
                result = false;
                break;
            }
            wordInd--;
        }
        return result;
    }
}