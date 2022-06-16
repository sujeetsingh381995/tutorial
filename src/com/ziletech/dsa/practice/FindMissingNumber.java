package com.ziletech.dsa.practice;

public class FindMissingNumber {
    public static void main(String[] args) {
        find(new int[]{1, 2, 4, 5, 6});
    }

    private static void find(int[] num) {
        int n = num.length + 1;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < num.length; i++) {
            sum = sum - num[i];
        }
        System.out.println("missing number is  " + sum);
    }

}
