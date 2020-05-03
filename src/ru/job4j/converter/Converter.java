package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value){
        return value/80;
    }

    public static int rubleToDollar(int value){
        return value/70;
    }

    public static void main(String args[]){
//        int euro = rubleToEuro(160);
//        System.out.println("160 rubles = "+euro+"euro.");

        int in=160;
        int expected=2;
        int out=rubleToEuro(in);
        boolean passed= expected==out;
        System.out.println("160 rubles are 2 euro. Test result: " + passed);

        in =210;
        expected=3;
        out=rubleToDollar(in);
        passed= expected==out;
        System.out.println("210 rubles are 3 dollars. Test result: " + passed);

    }
}
