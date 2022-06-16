package com.ziletech.dsa;


import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class Arrays {
    public static void main(String[] args) {

//        duplicate(new int[]{1, 2, 3, 3, 4, 5, 6, 7, 2, 8, 8, 1});
//        printMissingNumber(new int[]{1, 3, 5, 6, 7, 9}, 9);
//        revers(new int[]{1, 2, 3, 4, 5, 6});
//        removeDuplicateNumbers();
//        findMinAndMaxValue();
        findMaxMinValue();
    }

    private static void revers(int[] num) {

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i]);
            if (i != 0) {
                System.out.print(",");

            }

        }
    }


    private static void duplicate(int[] num) {

        int[] result = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    result[num[i]]++;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) {
                System.out.println(result[i]);
            }
        }
    }


    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                java.util.Arrays.toString(numbers), count);
        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }

    private static void removeDuplicateNumbers() {

        Set<Integer> testList = new HashSet<>();

        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(3);
        testList.add(4);
        testList.add(4);

        for (Integer input : testList) {
            System.out.println(input);
        }
    }

    private static void findMinAndMaxValue() {
        int[] number = {2, 3, 3, 4, 5, 6, 7, 2, 38, -8, 1};

        int minimum = number[0];
        int maximum = number[0];
        for (int i = 0; i < number.length; i++) {
            minimum = Math.min(minimum, number[i]);
            maximum = Math.max(maximum, number[i]);
        }
        System.out.println("minimum number : " + minimum);
        System.out.println("maximum number : " + maximum);
    }

    private static void findMaxMinValue() {
        int[] number = {2, 3, 3, 4, 5, 6, 7, 2, 58, -88, 1};
        int minimum = number[0];
        int maximum = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < minimum) {
                minimum = number[i];
            }
            if (number[i] > maximum) {
                maximum = number[i];
            }
        }
        System.out.println("Minimum : " + minimum + " Maximum : " + maximum);
    }



}






