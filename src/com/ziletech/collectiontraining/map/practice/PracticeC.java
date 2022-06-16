package com.ziletech.collectiontraining.map.practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    public static void main(String[] args) {
        String input = "rohan,suraj,yukti,nagendra,sujeet,rahul";
        Map<Character,List<String>> groupList = groupByFirstChar(input);
        for (Character c : groupList.keySet()){
            System.out.println("key  "+c+"  value  "+groupList.get(c));
        }
    }
    private static Map<Character, List<String>>groupByFirstChar(String input){
        Map<Character,List<String>> groupList = new HashMap<>();
        String[] names = input.split(",");
        for (String name : names){
          Character firstChar =  name.charAt(0);
          if (groupList.containsKey(firstChar)){
              List<String> list = groupList.get(firstChar);
              list.add(name);
              groupList.put(firstChar,list);

          }else {
              List<String> list = new ArrayList<>();
              list.add(name);
              groupList.put(firstChar,list);
          }

        }
        return groupList;
    }
}
