package com.ziletech.datastructuresalgorithms;

public class PatternK {
    public void printK(int num){
        int k=1;
        int h=0;
        for (int i=0; i<num; i++){
            for (int j=i; j<num; j++){
                if (j==i){
                    System.out.print(k+" ");
                }else {
                    System.out.print(h);
                }
               
            }
            System.out.println();
        }
    }
            
}
