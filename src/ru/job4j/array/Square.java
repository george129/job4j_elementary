package ru.job4j.loop;

public class Square {
    public static int[] calculate(int bound) {
        int[] parabola = new int[bound];
        for (int i = 0; i < bound; i++) {
            parabola[i] = i * i;
        }
        return parabola;
    }

    public static void main(String[] args) {
        int[] arr = calculate(4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
