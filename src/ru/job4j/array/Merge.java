package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = left.length - 1, j = right.length - 1, k = rsl.length;

        while (k > 0) {
            rsl[--k] =
                    (j < 0 || (i >= 0 && left[i] >= right[j])) ? left[i--] : right[j--];

        }
        return rsl;
    }
}



