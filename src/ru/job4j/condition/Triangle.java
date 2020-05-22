package ru.job4j.condition;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point a, Point b, Point c) {
        this.p1 = a;
        this.p2 = b;
        this.p3 = c;
    }

    public boolean exist() {
        if (p1.distance(p2) + p1.distance(p3) > p2.distance(p3)
                && p1.distance(p3) + p2.distance(p3) > p2.distance(p1)
                && p1.distance(p2) + p2.distance(p3) > p1.distance(p3)) {
            return true;
        }
        return false;
    }

    /**
     * Calculates triangle's semiperimeter by formula (a+b+c)/2 ,where
     * a - distance between point1 and point2
     * b - distance between point2 and point3
     * c - distance between point3 and point1
     * @return perimeter
     */
    public double perimeter() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p1.distance(p3);
        return (a + b + c) / 2;
    }

    public double area() {
        if (this.exist()) {
            double a = p1.distance(p2);
            double b = p1.distance(p3);
            double c = p3.distance(p2);
            double p = perimeter();
            double area = sqrt(p * (p - a) * (p - b) * (p - c));
            return area;
        }
        return -1;
    }

}
