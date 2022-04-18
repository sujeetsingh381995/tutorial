package com.ziletech.datastructuresalgorithms;

public class RowColumn {
    public static void main(String[] args) {
        rowColumn(5);
    }

    private static void rowColumn(int star) {
        for (int i = 0; i < star; i++) {


            for (int k = 0; k < 5; k++) {
                System.out.print(" *");


            }
            System.out.println("");

        }
    }
}
