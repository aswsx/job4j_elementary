package ru.job4j.loop;

public class CheckPrimeNumber {
    /**
     * сначала делается проверка, что число number больше 1. Если меньше, в prime записывается false,
     * если number больше 1, в prime прописывается true.
     * Цикл начинается с 2, если number меньше 2 условие цикла не выполняется,
     * программа пролетает мимо цикла сразу в return, который возвращает false.
     * Если же number больше одного, цикл запускается, делается проверка, что number делится на i без остатка.
     * Если не делится, возвращаемся в условие цикла, i увеличивается на 1 и снова проверяется условие if
     * и так до конца цикла. Если условие ни разу не выполнилось, prime не меняется, остается true.
     * Если при очередном шаге цикла number поделилось на i без остатка, то
     * prime становится false, поскольку number не является простым и цикл прерывается принудительно.
     *
     * @param number в метод передается число number
     * @return возвращаем prime
     */
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

