package com.ziletech.collectiontraining.map.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {

    public static void main(String[] args) {
        String input = "rohan,suraj,yukti,nagendra,sujeet,rahul";
        Map<Character,List<String>> group = groupName(input);
        for (Character key : group.keySet()){
            System.out.println("key"+key+"value"+group.get(key));
        }
    }

    private static Map<Character, List<String>> groupName(String input) {
        Map<Character, List<String>> groupList = new HashMap<>();
        String[] names = input.split(",");
        for (int i = 0; i <= names.length; i++) {
            String name = names[i];
            Character fC = name.charAt(0);
            if (groupList.containsKey(fC)) {
                List<String> list = groupList.get(fC);
                list.add(name);
                groupList.put(fC, list);

            } else {
                List<String> list = new ArrayList<>();
                list.add(name);
                groupList.put(fC, list);
            }

        }
        return groupList;
    }
}
