package com.ziletech.datastructuresalgorithms;

public class PatternI {
    public void PrintI(int num){
        int k=1;
        for (int i=0; i<num; i++){
            for (int j=0; j<i; j++){
                    System.out.print(k+" ");
                    k++;
            }
            System.out.println();
            }
          
        }
       
            
    }
    

