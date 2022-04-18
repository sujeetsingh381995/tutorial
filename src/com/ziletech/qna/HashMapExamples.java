package com.ziletech.qna;

import java.util.HashMap;

public class HashMapExamples {

    public static void main(String[] args) {

        String name = "Ashish Ravi Ravindra Kaushik Raj Pratik";

        String[] names = name.split(" ");

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i < names.length; i++){
            char firstLetter = names[i].charAt(0);

            if(!map.containsKey(firstLetter)){
                map.put(firstLetter,1);
            }else{
                Integer count = map.get(firstLetter);
                map.put(firstLetter, count + 1);
            }
        }

        for(Character key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        //A-1  --> key - count
        //R-3
        //K-1
        //P-1

    }

}
