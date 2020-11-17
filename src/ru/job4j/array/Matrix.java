package ru.job4j.array;

public class Matrix {
    public static int[][] mult(int size) {
        int[][] ret = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ret[i][j] = (i + 1) * (j + 1);
            }
        }
        return ret;
    }
}
