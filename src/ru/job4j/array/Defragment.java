package ru.job4j.array;

    public class Defragment {
        public static String[] compress(String[] array) {
            for (int index = 0; index < array.length; index++) {
                if (array[index] == null) {
                    int point = index;
                    for (index = point; index < array.length; index++) {
                        if (array[index] != null) {
                            String temp = array[index];
                            array[index] = array[point];
                            array[point] = temp;
                            break;
                        }

                    }

                }

            }
            return array;
        }

        public static void main(String[] args) {
            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (int index = 0; index < compressed.length; index++) {
                System.out.print(compressed[index] + " ");
            }
        }
    }