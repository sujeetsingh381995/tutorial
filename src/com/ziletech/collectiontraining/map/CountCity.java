package com.ziletech.collectiontraining.map;

import com.ziletech.dsa.practice.S;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCity {

    public static void main(String[] args) {
        String input = "Raipur,Bilashpur,Bengaluru,Karnataka,Kerala,Raigarh,Ambikapur";

        Map<Character, List<String>> cityGroup = getCityGroup(input);

        for (Character key:cityGroup.keySet()){
            System.out.println("----- "+ key+ " ==========");
            for (String city:cityGroup.get(key)){
                System.out.println(city);
            }
        }

    }

    private static Map<Character, List<String>> getCityGroup(String input) {

        Map<Character, List<String>> cityGroup = new HashMap<>();

        String[] cities = input.split(",");

        for (String city : cities) {
            Character firstChar = city.charAt(0);
            List<String> cityList = new ArrayList<>();

            if (cityGroup.containsKey(firstChar)) {
                cityList = cityGroup.get(firstChar);
                cityList.add(city);
            } else {
                cityList.add(city);
            }

            cityGroup.put(firstChar, cityList);
        }


        return cityGroup;


    }

}
