package ru.job4j.condition;

public class Point { public static double distance(int x1, int y1, int x2, int y2) {
    double rsl = x2 - x1;
    double rs2 = y2 - y1;
    double first1 = Math.pow(rsl, 2);
    double first2 = Math.pow(rs2, 2);
    double second = first1 + first2;
    double third = Math.sqrt(second);
    return third;
}
      public static void main(String[] args) {
        double result = Point.distance(5, 7, 8, 7);
        System.out.println("result (5, 4) to (8, 7) " + result);
    }
}

