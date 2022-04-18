package com.ziletech.tutorial;

public class StarMain {

    public static void main(String[] args) {

        add(4, 5);
        add(50, 60);
        add(100, 100);

    }

    public static void add(int first, int sec) {
        int result = first + sec;
        System.out.println(result);

    }

    public static class Stor {
        public static void main(String[] args) {
            int[] numbers = stor(1000, 1);
            print(numbers, 500);
            //
        }

        private static int[] stor(int length, int startNumber) {
            int[] numbers = new int[length];

            for (int i = startNumber - 1; i < numbers.length; i++) {
                numbers[i] = i + 1;
            }
            return numbers;
        }

        private static void print(int[] numbers, int startNumber) {
            for (int i = startNumber - 1; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }

    }
}