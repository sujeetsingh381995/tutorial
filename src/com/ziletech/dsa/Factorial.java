package com.ziletech.dsa;

public class Factorial {
    public static void main(String[] args) {
        int input = 5;
        int result=factorialOfValue(input);
        System.out.println("factorial no. is -> "+input+" and result -> "+result);

    }
    private static int factorialOfValue(int input){
          int factorial =1;
        for (int i = 1 ; i<= input; i++){
            factorial =factorial*i;
        }
return factorial;
    }
}
