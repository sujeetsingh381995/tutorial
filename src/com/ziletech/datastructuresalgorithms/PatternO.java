package com.ziletech.datastructuresalgorithms;

public class PatternO {
    public static void main(String[] args) {
        int num = 8;
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
         
            System.out.println();
        }
        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}

