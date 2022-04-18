package com.ziletech.array;

public class Array {
    public static void main(String[] args) {

        int[] numbers = stor(1000, 2);
        oddEven(numbers);
        print(numbers, 1);
        alphabet();
        skip(numbers);
        startEnd(numbers);

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

    private static void alphabet() {
        char a;
        for (a = 'A'; a <= 'Z'; a++) {
            System.out.println(a + " ");
        }

    }

    private static void oddEven(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " even ");
            } else {
                System.out.println(numbers[i] + " odd ");
            }
        }
    }

    private static void skip(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * 2);
        }
    }

    private static void startEnd(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
