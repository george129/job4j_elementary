package ru.job4j.array;

public class SelectionSort {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int pos = FindLoop.indexOf(data, min, i, data.length - 1);
            SwitchArray.swap(data, pos, i);
        }
        return data;
    }
}
