package com.ziletech.pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchPattern {

    public static void main(String[] args) {

        String[] names = {"Kishor", "Kishan", "Kim", "Kajol","Sujeet"};

        System.out.println(group(names));
        System.out.println(groupCount(names));


        boolean allMatched = allMatched(names,'K');
        System.out.println("All matched : " + allMatched);
//
//        boolean anyMatch = anyMatch(names, 'K');
//        System.out.println("Any matched : " + anyMatch);
    }

    /*
      S = 1
      K = 4
     */
    private static Map<Character, Integer> groupCount(String[] names){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i <= names.length-1; i++){
            char c = names[i].charAt(0);
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c, count+1);
            }else{
                map.put(c,1);
            }
        }
        return map;
    }

    private static  Map<Character, List<String>> group(String[] names) {
        Map<Character, List<String>> map = new HashMap<>();

       // "Kishor", "Kishan", "Kim", "Kajol","Sujeet"

        // K => "Kishor", "Kishan", "Kim", "Kajol"
        // S => "Sujeet"

        for(int i=0; i<= names.length-1; i++){
            String name = names[i];
            char c = name.charAt(0);
            if(map.containsKey(c)){
                List<String> existingNames = map.get(c);
                existingNames.add(name);
                map.put(c, existingNames);
            }else{
                List<String> newNames = new ArrayList<>();
                newNames.add(name);
                map.put(c, newNames);
            }
        }
        return map;
    }

    private static boolean anyMatch(String[] names, char c){
        for(int i=0; i <= names.length -1; i++){
            if(names[i].charAt(0) == c){
                return true;
            }
        }
        return false;
    }

    private static boolean allMatched(String[] names, Character c) {
        for(int i=0; i<= names.length-1; i++){
            if(names[i].charAt(0) != c){
                return false;
            }
        }
        return true;
    }


}
