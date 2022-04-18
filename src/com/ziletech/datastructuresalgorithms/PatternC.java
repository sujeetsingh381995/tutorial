package com.ziletech.datastructuresalgorithms;

public class PatternC {
    public void printC(int num){
     for(int i=0; i<num; i++){
         for(int j=num; j>i; j--){
             System.out.print(" ");
         }
         for (int j=0; j<i; j++){
             System.out.print("*");
         }
         System.out.println();
     }
     for (int i=0; i<num; i++){
         for (int j=0; j<i; j++){
             System.out.print(" ");
         }
         for (int j=num; j>i; j--){
             System.out.print("*");
         }
         System.out.println();
     }
    }

}
