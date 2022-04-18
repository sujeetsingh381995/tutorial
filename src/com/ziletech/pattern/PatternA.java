package com.ziletech.pattern;

import java.security.spec.RSAOtherPrimeInfo;

public class PatternA {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int num) {
        int num1 = num - 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j >= num1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
            num1--;
        }
    }

}

