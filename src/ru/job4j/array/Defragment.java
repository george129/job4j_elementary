package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != null) {
                        arr[i] = arr[j];
                        arr[j] = null;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
