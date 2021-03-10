package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[90];
        int size = 0;
        int coinsfull = (money - price);
        for (int i = 0; i < coins.length; i++) {
            while (coins[i] <= coinsfull) {
                coinsfull -= coins[i];
                rsl[i] = coins[i];
                size += 1;
                break;
            }

        }
        return Arrays.copyOf(rsl, size);
    }
}










