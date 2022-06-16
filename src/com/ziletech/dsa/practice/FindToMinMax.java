package com.ziletech.dsa.practice;

public class FindToMinMax {
    public static void main(String[] args) {
        ;
        findMaxMinValue(new int[]{2, 3, 3, 4, 5, 6, 7, 2, 58, -88, 1});
    }

    private static void findMaxMinValue(int[] number) {

        int min = number[0];
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Minimum : " + min + " Maximum : " + max);
    }
}
