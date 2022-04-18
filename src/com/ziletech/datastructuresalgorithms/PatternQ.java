package com.ziletech.datastructuresalgorithms;

public class PatternQ {
    public static void main(String[] args){
        int num=7;
        for (int i=0; i>num; i++){
            for (int j=num; j>=i; j--){
                System.out.print(j+"---");
            }
            System.out.println();
        }
    }
}
