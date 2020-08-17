package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        if (finish == 1) {
            return 0;
        } else {
            for (int i = 1; i <= finish; i++) {
                if (CheckPrimeNumber.check(i)) {
                    count++;
                }
            }
            return count;
        }
    }
}
