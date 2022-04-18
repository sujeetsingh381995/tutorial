package com.ziletech.datastructuresalgorithms;


public class PatternB {

    public static void main(String[] args) {
//        char c = (char) 97;
//        System.out.println(c);
//
        for (int i = 0; i < 26; i++) {
            char c = (char) ( 97 + i);
            System.out.println("int " +  i + " char : " + c);
        }

        for (char c = 97; c < (97+26); c++) {
            System.out.println(c);
        }
        
    }
    
    public void printA(int num) {
//        printDiamond(num);
//        printTopTriangle(num);
//        printBottomTriangle(num);
    }

    private void printDiamond(int num) {

        for (int row = 0; row < num; row++) {

            if (row <= num / 2) {
                for (int space = num / 2; space > row; space--) {
                    System.out.print("-");
                }
                for (int star = 0; star <= row; star++) {
                    System.out.print("* ");
                }
            } else {
                for (int space = 0; space < row - num / 2; space++) {
                    System.out.print("-");
                }
                for (int star = num - row; star > 0; star--) {
                    System.out.print("* ");
                }
            }

            System.out.println("");
        }
    }

    private void printTopTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void printBottomTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = num; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
