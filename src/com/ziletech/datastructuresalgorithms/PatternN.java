package com.ziletech.datastructuresalgorithms;

public class PatternN {
    public static void main(String[] args){
        int num=7;
        int n = 1;
        
        boolean reverse = false;
         for (int i=0; i<num; i++){
             int left = num/2;
             int right = num/2;
            for (int j=i; j<num; j++){
                if (j==left||j==right){
                    System.out.print(n);
                }else {
                    System.out.print(" ");
                }
            }
            reverse =true;
            left++;
            right--;
             System.out.println();
         }
    }
            
}
