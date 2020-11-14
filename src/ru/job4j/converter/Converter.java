package ru.job4j.converter;

/**
 * Converter performs the conversion from rubles to euro and dollar
 * according to course
 * @author George129
 */
public class Converter {
    /**
     *
     * @param value is the amount of rubles to convert.
     * @return - is the amount of euros
     */
    public static int rubleToEuro(int value) {
        return value / 80;
    }

    /**
     * Method rubleToDollar
     * @param value amount of rubles to convert
     * @return amount of dollars, converted from rubles according to course
     */
    public static int rubleToDollar(int value) {
        return value / 70;
    }

    public static void main(String[] args) {
        int in = 160;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("160 rubles are 2 euro. Test result: " + passed);
        System.out.println("500 rub = $" + rubleToDollar(500));
        System.out.println("20 rub = $" + rubleToDollar(20));
        System.out.println("500 rub = " + rubleToEuro(500) + " euros");
        System.out.println("20 rub = " + rubleToEuro(20) + " euros");
    }
}
