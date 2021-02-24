package ru.job4j.converter;

import java.security.PublicKey;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }
    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float in1 = 140;
        float expected2 = (float) 2;
        float out2 = Converter.rubleToDollar(in);
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles Euro. Test result : " + passed);
        System.out.println("140 rubles Dollar. Test result : " + passed2);
    }
}