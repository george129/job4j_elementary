package ru.job4j.array;

public class Turn {
    public static int[] run(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length / 2; i++) {
            SwitchArray.swap(arr,  i, arr.length - 1 - i);
        }
        return arr;
    }
}
