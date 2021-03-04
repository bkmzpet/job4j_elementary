package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        percent = percent / 100;
        amount += (amount * percent);
        amount -= salary;
        while (amount > 0) {
            year += 1;
            amount += (amount * percent);
            amount -= salary;
        }
        return year;
    }
}


