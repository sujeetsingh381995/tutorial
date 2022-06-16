package com.ziletech.dsa.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String name = "nagendra chandrakar";
        List<Character> duplicateList = getDuplicate(name);
        System.out.println(duplicateList);
    }

    private static List<Character> getDuplicate(String name) {
        List<Character> resultList = new ArrayList<>();

        for (int i = 0; i <= name.length() - 1; i++) {
            char firstChar = name.charAt(i);
            boolean found = false;
            for (int j = i + 1; j <= name.length() - 1; j++) {
                char existingChar = name.charAt(j);
                if (firstChar == existingChar && !resultList.contains(existingChar)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                resultList.add(firstChar);
            }
        }

        return resultList;
    }


}
