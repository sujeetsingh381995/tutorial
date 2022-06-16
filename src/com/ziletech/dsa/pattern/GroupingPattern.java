package com.ziletech.dsa.pattern;

import java.util.HashMap;
import java.util.Map;

public class GroupingPattern {

    public static void main(String[] args) {
        String input= "javaa2bloga.com";
        Map<Character, Integer> charCount = findDuplicate(input);
        for(Character c : charCount.keySet()){
            if(charCount.get(c) > 1){
                System.out.println("Char : " + c + " is having count  of " + charCount.get(c));
            }
        }
    }

    public static Map<Character, Integer> findDuplicate(String input){
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i=0; i <= input.length()-1; i++){
            char c = input.charAt(i);
            if(countMap.containsKey(c)){                    // if id exists
                countMap.put(c, countMap.get(c) + 1);       // update the records
            }else{
                countMap.put(c,1);                          // insert the records
            }
        }
        return countMap;
    }
}
