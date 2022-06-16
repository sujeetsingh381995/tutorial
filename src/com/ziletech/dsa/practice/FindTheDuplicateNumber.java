package com.ziletech.dsa.practice;

import java.util.ArrayList;
import java.util.List;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] input = {1, 3, 4, 7, 6, 2, 3, 7, 1};

        List<Integer> result = findDuplicateValue(input);
        System.out.println(result);
    }

    private static List<Integer> findDuplicateValue(int[] number) {

        List<Integer> duplicate = new ArrayList<>();

        for (int i = 0; i < number.length; i++) {
            int first = number[i];
            for (int j = i + 1; j < number.length; j++) {
                int second = number[j];
                if (first == second) {
                    duplicate.add(first);
                    break;
                }
            }
        }
        return duplicate;
    }

}
