package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean res = true;
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < 1 + number / 2; i++) {
            if (number % i == 0 || number < 2) {
//                break;
//                res = false;
                return false;
            }
        }
        return res;
    }
}
