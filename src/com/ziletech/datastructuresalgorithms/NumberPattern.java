package com.ziletech.datastructuresalgorithms;

public class NumberPattern {

    public static void main(String[] args) {
        printPattern2(7);
//        printPattern(6);
    }
    
    private static void printPattern2(int n){
        int records = n * 2-1;
        for (int row = 0; row < records; row++) {
            int decrementTimes = 0; //0
            int printNumber = n;    //7
            for (int col = 0; col < records; col++) { //13
                System.out.print(printNumber);        //7
                if(decrementTimes < row){             //true  
                    decrementTimes++;                 //-1
                    printNumber--;
                }
               
            }
            System.out.println();
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
