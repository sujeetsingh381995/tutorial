package com.ziletech.collectiontraining.map.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeE {
    public static void main(String[] args) {
        String input = "rohan,suraj,yukti,nagendra,sujeet,rahul";
        Map<Character,List<String>> groupName= getNameByGroup(input);

    }
  private static Map<Character, List<String>> getNameByGroup(String input){
        Map<Character,List<String>> mapGroup = new HashMap<>();
        String[] names = input.split(",");
        for (int i= 0; i<= names.length-1; i++){
            String name = names[i];
            Character c = name.charAt(0);
            if (mapGroup.containsKey(c)){
                List<String> list = mapGroup.get(c);
                list.add(name);
                mapGroup.put(c,list);

            }else {
                List<String> list = new ArrayList<>();
                list.add(name);
                mapGroup.put(c,list);
            }
        }
        return mapGroup;
  }
}
