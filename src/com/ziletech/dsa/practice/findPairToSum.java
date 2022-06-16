package com.ziletech.dsa.practice;

import java.util.ArrayList;
import java.util.List;

public class findPairToSum {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 9, 6, 2, 5, 7};

        int sum = 10;
        List<List<Integer>> result = pair(numbers, sum);
        System.out.println(result);
    }

    private static List<List<Integer>> pair(int[] number, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            int first = number[i];
            for (int j = i + 1; j < number.length; j++) {
                int second = number[i];
                if (first + second == sum) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(first);
                    pair.add(second);
                    result.add(pair);
                }
            }
        }
        return result;
    }
}
