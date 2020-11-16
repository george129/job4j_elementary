package ru.job4j.loop;

public class Fitness {
    public static int calc(int weak, int strong) {
        int month = 0;
        while (weak < strong) {
            weak *= 3;
            strong *= 2;
            month++;
        }
        return month;
    }
}
