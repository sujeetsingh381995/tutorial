package com.ziletech.collectiontraining.map.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    public static void main(String[] args) {
        String input = "rohan,suraj,yukti,nagendra,sujeet,rahul";
        Map<Character,List<String>> groupName =getNameByGroup(input);
        for (Character c :groupName.keySet()){
            System.out.println("key "+c+" names "+groupName.get(c));
        }

    }
    private static Map<Character, List<String>> getNameByGroup(String input){
        Map<Character,List<String>> mapList = new HashMap<>();
        String[] names = input.split(",");
        for (String name : names){
            Character firstChar = name.charAt(0);
            if (mapList.containsKey(firstChar)){
                List<String> list =mapList.get(firstChar);
                list.add(name);
                mapList.put(firstChar,list);
            }else {
                List<String> list = new ArrayList<>();
                list.add(name);
                mapList.put(firstChar,list);
            }
        }
        return mapList;
    }
}
