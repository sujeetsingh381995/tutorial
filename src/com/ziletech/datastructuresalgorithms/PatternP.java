package com.ziletech.datastructuresalgorithms;

public class PatternP {
    public static void main(String[] ssf){
        int num= 7;
        for (int i=num; i>=0; i--){
            for (int j=i; j>0; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    } 
}
