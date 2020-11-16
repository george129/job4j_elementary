package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 3, 2, 1, 4};
        int tmp = arr[0];
        arr[0] = arr[3];
        arr[3] = tmp; // 1 3 2 5 4
        tmp = arr[1];
        arr[1] = arr[2];
        arr[2] = tmp; // 1 2 3 5 4
        tmp = arr[4];
        arr[4] = arr[3];
        arr[3] = tmp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
