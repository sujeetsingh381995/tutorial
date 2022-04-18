package com.ziletech.pattern;

public class PatternD {
    public static void main(String[] args) {
        printPattenr(5);
    }

    private static void printPattenr(int num) {
        int num1 = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j > num1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            num1++;
        }
    }
}
