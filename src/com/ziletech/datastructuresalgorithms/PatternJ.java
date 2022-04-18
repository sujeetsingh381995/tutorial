package com.ziletech.datastructuresalgorithms;

public class PatternJ {
    public void printj(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("-");
            }
            for (int j=1; j<=1; j++){
                    System.out.print(j);
            }
            System.out.println();
        }

    }

}
