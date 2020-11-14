package ru.job4j.calculator;

public class Fit {

    /**
     * manWeight - returns the "ideal" weight, calculated by formula for men
     * @param height - height in cm
     * @return - weight in kg
     */
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * womanWeight - returns the "ideal" weight, calculated by formula for women
     * @param height - height in cm
     * @return - weight in kg
     */
    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double  man = Fit.manWeight(100);
        System.out.println("Man 100 is " + man);
    }
}
