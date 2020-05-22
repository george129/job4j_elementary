package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    public Point(int px, int py) {
        this.x = px;
        this.y = py;
    }

    /**
     * Point p1 = new Point(x1,y1);
     * Point p2 = new Point(x2,y2);
     * double x = p1.distance(p2);
     * Calculates distance between two point p1 and p2 by their coordinates
     * D = sqrt((x2-x1)^2 + (y2-y1)^2 )
     * @param another - second point beside the first, which method uses it.
     * @return - distance
     */

    public double distance(Point another) {
        return sqrt(pow(this.x - another.x, 2) + pow(this.y - another.y, 2));
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 4);
        Point p2 = new Point(3, 0);
        double dist = p1.distance(p2);
        System.out.println(dist);
    }
}
