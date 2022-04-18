package com.ziletech.classes;

public class Pattern {
    public static void main(String[] args) {
        printA(6);
        printB(10, 0);
        printC();
        PrintD();
    }

    private static void printA(int g) {

        for (int i = 0; i < g; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("----------------");
    }

    private static void printB(int num1, int num2) {

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {
                if (j >= num2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            num2--;
        }
        System.out.println("----------------");
    }

    private static void printC() {
        int n = 6;
        int n1 = 0;
        for (int i = 0; i < n; i++) {
        }

        {
            for (int j = 0; j < n; j++) {
                if (j > n1) {
                    System.out.print("* ");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();

            n1++;
        }
        System.out.println("----------------");
    }

    private static void PrintD() {
        int star = 6;
        int star1 = star - 1;
        for (int row = 0; row < star; row++) {
            for (int column = 0; column < star; column++) {
                if (column >= star1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            star1--;
        }
        System.out.println("----------------");
    }

}


