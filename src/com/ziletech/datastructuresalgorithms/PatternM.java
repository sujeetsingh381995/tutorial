package com.ziletech.datastructuresalgorithms;

public class PatternM {
    public static void main(String[] args){
        int num= 5;
        for (int i=0; i<num; i++){
            int v=0;
            if (i%2==0){
                v=0;
            }else{
                v=1;
            }
            for (int j=0; j<num; j++){
                if (v==0){
                    System.out.print(1); 
                    v=1;
                }else {
                    System.out.print(0);
                    v=0;
                }
               
            }
            System.out.println(); 
        }
        
    }
}
