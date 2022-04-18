package com.ziletech.collectionsquestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetApplication {
    public static void main(String[] args) {
//        addElement();
//        elementSize();
//        convertHashSetToArray();
        convertHashSetToArrayList();
    }

    private static void addElement() {
        HashSet<String> citys = new HashSet<>();
        citys.add("Bengaluru");
        citys.add("Bengaluru");
        citys.add("Raipur");
        citys.add("Raipur");
        citys.add("Mumbai");
        citys.add("Mumbai");
        citys.add("Kolkata");
        citys.add("Kolkata");
        citys.add("Bilaspur");
        citys.add("Bilaspur");
        for (String city : citys) {
            System.out.println(city);
        }

    }

    private static void elementSize() {
        HashSet<String> citys = new HashSet<>();
        citys.add("Bengaluru");
        citys.add("Bengaluru");
        citys.add("Raipur");
        citys.add("Mumbai");
        citys.add("Mumbai");
        citys.add("Kolkata");
        citys.add("Kolkata");
        citys.add("Bilaspur");
        System.out.println("-------size");
        System.out.println(citys.size());

    }

    private static void convertHashSetToArray() {
        HashSet<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("Black");
        colors.add("White");
        String[] newColor = new String[colors.size()];
        colors.toArray(newColor);
        for (String color : newColor) {
            System.out.println(color);
        }
        System.out.println("--------");
    }

    private static void convertHashSetToArrayList() {
        HashSet<String> citys = new HashSet<>();
        citys.add("Bengaluru");
        citys.add("Raipur");
        citys.add("Raipur");
        citys.add("Mumbai");
        citys.add("Mumbai");
        citys.add("Kolkata");
        citys.add("Bilaspur");
        citys.add("Bilaspur");
        List<String> cityList = new ArrayList<>(citys);
        System.out.println(cityList);

    }
}
