package com.ziletech.pattern;

public class PatternF {
    public static void main(String[] args) {
       printPattern(5);
    }
    private static void printPattern(int num){
        int num1 = 0;
        int num2 =0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                if(i%2>0){
                    System.out.print(num1);
                    if (j==i-1){
                        num2=num1+i+1;
                    }
                }else {
                    System.out.print(num2);
                    num2--;
                }
                num1++;
            }
            System.out.println();
           
        }
    }
}
