package com.ziletech.dsa;

public class Fibonacci {

    public static void main(String[] args) {
        int input = 10, firstNumber = 0, secondNumber = 1;
        fibonacci(input, firstNumber, secondNumber);
        System.out.println(input);

    }

    private static void fibonacci(int input, int firstNumber, int secondNumber) {
        for (int i = 1; i <= input; ++i) {
            System.out.print(firstNumber + ", ");

            int total = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = total;
        }
    }
}
