package com.ziletech.dsa;

public class FindMinValue {

    public static void main(String[] args) {

        int[] input = {5,3,6,9,3,6,4};
        int minValue = findMin(input);
        System.out.println(minValue);
    }

    private static int findMin(int[] input) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i< input.length; i++){
            if(input[i] < min){
                min = input[i];
            }
        }
        return min;
    }


}
