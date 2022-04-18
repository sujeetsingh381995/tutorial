package com.ziletech.pattern;

public class PatternB {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int num) {
        int star = num - 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j >= star) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            star--;
        }

    }
}
