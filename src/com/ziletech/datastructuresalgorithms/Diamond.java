package com.ziletech.datastructuresalgorithms;

public class Diamond {
    public static void main(String[] args) {
        daimondPattern(10);
    }

    private static void daimondPattern(int num) {
        for (int row = 0; row < num; row++) {
            if (row <= num / 2) {
                for (int column = num / 2; column > row; column--) {
                    System.out.print("-");
                }
            } else {
//
                for (int column = 0; column < row - num / 2; column++) {
                    System.out.print("-");
                }

            }
            System.out.println();
        }
    }

}
