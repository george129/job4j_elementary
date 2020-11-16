package ru.job4j.condition;

public class TriangleSimple {

    public static boolean exist(double ab, double bc, double ac) {
        if (ab + bc > ac
                && ab + ac > bc
                && ac + bc > ab) {
            return true;
        }
        return false;
    }

}
