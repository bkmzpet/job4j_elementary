package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro =  Converter.rubleToEuro(140);
        int dollar =  Converter.rubleToDollar(120);
        int in = 140;
        int expected = 2;
        int in1 = 120;
        int expected2 = 2;
        int out2 = Converter.rubleToDollar(in1);
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are = " + euro + " euro . Test result : " + passed);
        System.out.println("120 rubles are = " + dollar + " dollar. Test result : "  + passed2);
    }
}