package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
//        return Math.pow(p / (2 * (k + 1)), 2) * k;
        double side1 = p / 2 / (k + 1);
        double side2 = side1 * k;
        return side1 * side2;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(12, 2);
        System.out.println("p = 12, k = 2, s = 2, real = " + result1);
        System.out.println(square(6, 2));
    }
}
