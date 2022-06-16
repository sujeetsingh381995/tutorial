package com.ziletech.exceptionsconcept;

public class NullPointer {
    public static void main(String[] args) {

        patternN(null);

    }
    public static void patternN(Byte num) {
        try {
            for (byte i = 0; i < num; i++) {
                for (byte j = 0; j < i; j++) {
                    System.out.println("*");
                }
            }
        } catch (NullPointerException | ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Continue program");
        int num1 = 6;

        for (int i = 0; i <= num1; i++) {
            for (int j = num1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == num1) {
                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}



