package ru.job4j.condition;

public class Max {
    public static int max(int m, int n) {
        return m >= n ? m : n;
    }

    public static int max(int m, int n, int o) {
        return max(max(m, n), o);
    }

    public static int max(int m, int n, int o, int p) {
        return max(max(m, n), max(o, p));
    }
}
