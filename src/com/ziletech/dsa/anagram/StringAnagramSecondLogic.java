package com.ziletech.dsa.anagram;

import java.util.Arrays;

public class StringAnagramSecondLogic {

    public static void main(String[] args) {
        String input = "BCA2D";
        System.out.println(input.indexOf('A'));
    }

    public static void main2(String[] args) {
        String first = "ssp";
        String second = "pss";
       boolean status = checkAnagram(first, second);
        if (status) {
            System.out.println(first + " and " + second + " are anagrams");
        } else {
            System.out.println(first + " and " + second + " are not anagrams");


        }
    }

    private static boolean checkAnagram(String first, String second) {
        boolean status = true;
        if (first.length() != second.length()) {
            status = false;

        } else {
            char[] ArrayS1 = first.toLowerCase().toCharArray();
            char[] ArrayS2 = second.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }

        return status;
    }

    private static boolean isGivenStringAreAnagram(String firstWord, String secondWord) {

        boolean status = true;
        String firstWordUpper = firstWord.toUpperCase();
        String secondWordUpper = secondWord.toUpperCase();

        if (firstWordUpper.length() != secondWordUpper.length()) {
            status = false;
        } else {
            for (int i = 0; i <= firstWordUpper.length() - 1; i++) {
                if (secondWordUpper.indexOf(firstWordUpper.charAt(i)) == -1) {
                    status = false;
                    break;
                }
            }
        }
        return status;
    }

}
