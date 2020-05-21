package ru.job4j.condition;

import java.math.*;

public class Point {
    /**
     * Calculates distance between two points by their coordinates
     * D = sqrt((x2-x1)^2 + (y2-y1)^2 )
     * @param x1 - coordinate X of point 1
     * @param y1 - coordinate Y of point 1
     * @param x2 - coordinate X of point 2
     * @param y2 - coordinate Y of point 2
     * @return - distance
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        double dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return dist;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 3, 4, 0);
        System.out.println("result (0, 3) to (4, 0) = " + result);
    }
}
