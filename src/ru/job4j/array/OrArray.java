package ru.job4j.array;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] merge = mergeIt(left, right);
        int[] remove = removeIt(merge);
        return sortIt(remove);
    }

    private static int[] mergeIt(int[] left, int[] right) {
        int[] merge = new int[left.length + right.length];
        int k = 0;
        for (int n : left) merge[k++] = n;
        for (int n : right) merge[k++] = n;
        return merge;
    }

    private static int[] removeIt(int[] merge) {
        int len = merge.length;
        for (int i = 0; i < len - 1; i++)
            for (int j = i + 1; j < len; j++)
                if (merge[i] == merge[j]) {
                    for (int k = j; k < len - 1; k++)
                        merge[k] = merge[k + 1];
                    --len;
                }
        int[] remove = new int[len];
        for (int i = 0; i < remove.length; i++)
            remove[i] = merge[i];
        return remove;
    }

    private static int[] sortIt(int[] remove) {
        for (int index = 0; index < remove.length - 1; index++)
            for (int i = index + 1; i < remove.length; i++)
                if (remove[index] > remove[i]) {
                    int temp = remove[index];
                    remove[index] = remove[i];
                    remove[i] = temp;
                }
        return remove;
    }
}

