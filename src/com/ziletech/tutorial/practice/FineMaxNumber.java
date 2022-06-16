package com.ziletech.tutorial.practice;

public class FineMaxNumber {
    public static void main(String[] args) {
        int[] num = {1, 2, 5, 554, 21, 545, 4};
        System.out.println(findMax(num));

    }
    private static int findMax(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
