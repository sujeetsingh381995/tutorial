package com.ziletech.pattern;

public class AllPatternPractice {
    public static void main(String[] args) {
 printNumber();
    }

    private static void printNumber(){
        int num= 7;
        for (int i = 0; i < num; i++){
            for (int j = 0; j<num; j++){
                System.out.println(j);
            }
        }
    }

    private static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            int preValue = 0;
            if(i%2 == 0){
                preValue = 0;
            }else{
                preValue = 1;
            }
            for (int j = 0; j < n ; j++) {
                if(preValue == 0){
                    System.out.print(1);
                    preValue = 1;
                }else{
                    System.out.print(0);
                    preValue = 0;
                }
            }
            System.out.println();
        }
    }

}
