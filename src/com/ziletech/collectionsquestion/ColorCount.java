package com.ziletech.collectionsquestion;

import java.util.HashMap;
import java.util.Map;

public class ColorCount {

    public static void main(String[] args) {

        String[] colors = {"RED","GREEN","RED","BLUE","RED","BLUE","YELLOW","WHITE","WHITE"};

        HashMap<String, Integer> countMap = new HashMap<>();
        for(String color : colors){
            if(countMap.containsKey(color)){
                int count = countMap.get(color);
                countMap.put(color, count+1);
            }else{
                countMap.put(color, 1);
            }
        }

        for(String key : countMap.keySet()){
            System.out.println("Color : " + key + " , count : " + countMap.get(key));
        }

    }

}
