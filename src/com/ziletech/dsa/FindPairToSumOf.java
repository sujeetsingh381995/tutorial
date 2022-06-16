package com.ziletech.dsa;

import java.util.ArrayList;
import java.util.List;

public class FindPairToSumOf {

    public static void main(String[] args) {
        int[] input = {1, 3, 4, 9, 6, 2, 5, 7};

        // [1,9],[7,3],[4,6] => List<List<>>

        int sum = 10;
        List<int[]> result = getPairs(input, sum);
        System.out.println(result);
    }

    private static List<int[]> getPairs(int[] input, int sum) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            int first = input[i];
            for (int j = i + 1; j < input.length; j++) {
                int second = input[j];
                if (first + second == sum) {
//                    List<Integer> pairList = new ArrayList<>();
//                    pairList.add(first);
//                    pairList.add(second);
                    int[] pair = {first, second};
                    result.add(pair);
                }
            }
        }
        return result;
    }

}
