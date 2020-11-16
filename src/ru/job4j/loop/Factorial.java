package ru.job4j.loop;

public class Factorial {
    public static int calcRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calcRecursive(n - 1);
    }

    public static int calc(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
