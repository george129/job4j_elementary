package ru.job4j.condition;

public class Max {
    public static int max(int m, int n) {
        return m >= n ? m : n;
    }

    public static int max(int m, int n, int o) {
        return max(m, n) >= o ? max(m, n) : o;
    }

    public static int max(int m, int n, int o, int p) {
        return max(m, n) >= max(o, p) ? max(m, n) : max(o, p);
    }
}
