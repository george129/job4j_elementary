package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(int[] data, int target, int start, int finish) {
        int res = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return res;
    }
}
