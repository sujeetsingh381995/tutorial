package com.ziletech.dsa;

public class FindSumOfArray {

    public static void main(String[] args) {
        int[] input = { 3,6,2,6};
        int sum = getSum(input);
        System.out.println(sum);
    }

    private static int getSum(int[] input) {
        int sum = 0;
        for(int i=0; i < input.length; i++){
            sum = sum + input[i];
        }
        return sum;
    }

}
