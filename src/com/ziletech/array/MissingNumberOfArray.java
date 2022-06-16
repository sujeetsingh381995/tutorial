package com.ziletech.array;

public class MissingNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {2,8,5,6,1,9,4,7};

        int n = numbers.length+1;
        int sum = (n*(n+1))/2;

        for (int i= 0; i<numbers.length; i++){
            sum = sum - numbers[i];
        }
        System.out.println("missing element is" + sum);
    }

}
