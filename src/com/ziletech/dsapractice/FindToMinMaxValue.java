package com.ziletech.dsapractice;

public class FindToMinMaxValue {
    public static void main(String[] args) {

        findMaxMinValue(new int[]{2, 3, -3, 4, 5, 6, 7,});
    }

    private static void findMaxMinValue(int[] number) {

        int min = Integer.MAX_VALUE;
        int max = number[0];
        for (int result : number) {
            if (result < min) {
                min = result;
            }
            if (result > max) {
                max = result;
            }
        }
        System.out.println("Minimum No. is " + min + "  maximum No. is " + max);
    }
}
