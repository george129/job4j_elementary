package ru.job4j.array;

public class Min {
    public static int findMin(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (res > arr[i]) {
                res = arr[i];
            }
        }
        return res;
    }
}
