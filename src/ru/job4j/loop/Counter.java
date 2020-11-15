package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i % 2 == 0 ? i : 0;
        }
        return sum;
    }

    public static void main(String[] args) { //bad test style
        System.out.println(sum(1, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(-10, 10));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}
