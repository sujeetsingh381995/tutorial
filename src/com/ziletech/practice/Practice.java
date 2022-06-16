package com.ziletech.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {
        String input = "Ajit,Anju,Bhima,Krishna,Kusum";
//        groupTest(input);
        System.out.println(getUniqueNamesByFirstLetter(input));
    }
    private static void groupTest(String input) {
        Map<Character, List<String>> result = groupByFirstLetter(input);

        for (Character c : result.keySet()) {
            System.out.println("char : " + c + " names: " + result.get(c));
        }
    }
    public static List<String> getUniqueNamesByFirstLetter(String input) {
        List<String> result = new ArrayList<>();
        String[] names = input.split(",");
        for (int i = 0; i <= names.length - 1; i++) {
            String name = names[i];
            if (!isResultHasName(result, name)) {
                result.add(name);
            }
        }
        return result;
    }
    private static boolean isResultHasName(List<String> result, String name) {

//        String input = "Ajit,Anju,Bhima,Krishna,Kusum";
        // result = [Ajit, Bhima, Krishna]
        boolean found = false;
        for (int i = 0; i <= result.size() - 1; i++) {
            String existingName = result.get(i);
            if (existingName.charAt(0) == name.charAt(0)) {
                found = true;
                break;
            }
        }
        return found;
    }









    public static Map<Character, List<String>> groupByFirstLetter(String input) {
        Map<Character, List<String>> resultMap = new HashMap<>();
        //split
        String[] names = input.split(",");
        //iterate
        for (int i = 0; i <= names.length - 1; i++) {
            //match first letter and update or insert
            String name = names[i]; //stuck
            Character c = name.charAt(0);
            if (resultMap.containsKey(c)) {
                List<String> list = resultMap.get(c);
                list.add(name);
                resultMap.put(c, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(name);
                resultMap.put(c, list);
            }
        }
        return resultMap;
    }

}

