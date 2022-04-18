package com.ziletech.pattern;

public class PatternC {

    public static void main(String[] args) {
        ptrintPattenr(5);
    }

    private static void ptrintPattenr(int num) {
        int num1 = num - 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j >= num1) {
                    System.out.print("* ");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
            num1--;
        }
    }
}
