package com.ziletech.datastructuresalgorithms;

public class PatternL {
    public void printL(int num){
        
        for (int i=1; i<num; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            int k=i;
            for (int j=num; j>=i; j--){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
        for (int i=num; i>=0; i--){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            int k=i;
            for (int j=num; j>=i; j--){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
