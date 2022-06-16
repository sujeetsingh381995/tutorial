package com.ziletech.dsa.anagram;

import java.util.Arrays;

public class StringAnagramFirstLogic {
    public static void main(String[] args) {

        String first = "aaaa";
        String second = "aaaa";
        System.out.println(checkAnagram(first,second));

    }
    private static boolean checkAnagram(String first, String second) {
        char[] firstString = first.toCharArray();
        char[] secondString = second.toCharArray();
        Arrays.sort(firstString);
        Arrays.sort(secondString);
        return Arrays.equals(firstString, secondString);
    }
}
