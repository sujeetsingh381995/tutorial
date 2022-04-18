package com.ziletech.datastructuresalgorithms;

public class PatternE {
    public void printE(int num) {
        for (int i = 0; i <= num; i++) {

            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i||i==num) {
                    System.out.print("* ");
                }
                else{  
                    System.out.print("  ");

                }
            

            }
            System.out.println();
        }

    }

}

