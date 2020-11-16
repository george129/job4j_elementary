package ru.job4j.loop;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] vals = new int[5];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = i * 2 + 3;
        }
        for (int val : vals) {
            System.out.println(val);
        }
    }
}
