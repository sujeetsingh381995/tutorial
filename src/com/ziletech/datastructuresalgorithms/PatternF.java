package com.ziletech.datastructuresalgorithms;

public class PatternF {
    public void printF(int num){
        for (int column=0; column<=num; column++ ){
            
            for (int row=0; row<=column; row++){
                System.out.print(" ");
            }
            
            for(int star=num; star>=column; star--){
                
                if (star==num||column==0||star==column){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
            
            
        }
    }
}
