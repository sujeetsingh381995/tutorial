package com.ziletech.datastructuresalgorithms;

public class PatternH {
    public void printH(int num){
        for (int i=0; i<num; i++){
           for (int j=1; j<=i; j++) {
               System.out.print(j+" ");
           }
            System.out.println();
        }
    }
}
