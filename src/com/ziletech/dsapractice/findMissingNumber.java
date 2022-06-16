package com.ziletech.dsapractice;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 7, 8};
        findMissing(input);

    }

    private static void findMissing(int[] number) {

        int n = number.length + 1;
        int sum = n * (n + 1) / 2;
        for (int j : number) {
            sum = sum - j;
        }
        System.out.println("missing number isb  " + sum);
    }


}
