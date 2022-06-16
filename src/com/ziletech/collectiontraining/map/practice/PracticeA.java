package com.ziletech.collectiontraining.map.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PracticeA {

    public static void main(String[] args) {
        String input = "rohan,suraj,yukti,nagendra,sujeet,rahul";

        Map<Character, List<String>> nameGroup = getNameGroup(input);

        for (Character key : nameGroup.keySet()) {
            System.out.println("-> " + key + " <-");
            for (String value : nameGroup.get(key)) {
                System.out.println("--->  " + value);
            }
        }
    }

    private static Map<Character, List<String>> getNameGroup(String input) {
        Map<Character, List<String>> nameGroup = new HashMap<>();
        String[] names = input.split(",");
        for (String name : names) {
            Character firstChar = name.charAt(0);
            List<String> nameList = new ArrayList<>();

            if (nameGroup.containsKey(firstChar)) {
                nameList = nameGroup.get(firstChar);
                nameList.add(name);
            } else {
                nameList.add(name);
            }
            nameGroup.put(firstChar, nameList);
        }
        return nameGroup;
    }
}
