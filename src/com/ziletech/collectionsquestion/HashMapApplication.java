package com.ziletech.collectionsquestion;

import java.util.HashMap;
import java.util.Map;

public class HashMapApplication {

    public static void main(String[] args) {
        addElement();
        elementSize();
        isEmptyElement();
        searchElement();
        getElement();
    }

    private static void addElement() {
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(2, "red");
        colors.put(6, "green");
        colors.put(4, "Black");
        colors.put(7, "White");
        System.out.println(colors);

        for (Map.Entry result : colors.entrySet()) {
            System.out.println(result.getKey() + " " + result.getValue());
        }
        System.out.println("---------");
        for (Integer color : colors.keySet()) {
            System.out.println(color);
        }
        for (String color : colors.values()) {
            System.out.println(color);
        }
        System.out.println("----------");
    }

    private static void elementSize() {
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1, "red");
        colors.put(5, "green");
        colors.put(16, "Black");
        colors.put(17, "White");
        System.out.println(colors.size());
        System.out.println("----------");
    }

    private static void isEmptyElement() {
        HashMap<Integer, String> citys = new HashMap<>();
        citys.put(1, "MDGR");
        citys.put(2, "Kanpur");
        citys.put(3, "Pune");
        citys.put(4, "AMPE");
        System.out.println("is array emplty! " + citys.isEmpty());
        citys.clear();
        System.out.println("is array emplty! " + citys.isEmpty());

    }

    private static void searchElement() {
        HashMap<String, Integer> colos = new HashMap<>();
        colos.put("red", 1);
        colos.put("green", 2);
        colos.put("Black", 3);
        colos.put("White", 4);
        colos.put("Blue", 5);
        if (colos.containsKey("green")) {
            System.out.println("Color in the list");
        } else {
            System.out.println("Color is not in the list");
        }
        if (colos.containsValue(6)) {
            System.out.println("Number in the list");
        } else {
            System.out.println("Number is not in the list");
        }

    }
    private static void getElement(){
        HashMap<Integer,String> colos = new HashMap<>();

        colos.put(1,"red");
        colos.put(2,"green");
        colos.put(3,"Black");
        colos.put(4,"White");
        colos.put(5,"Blue");

//        String result= colos.get(3);
        System.out.println(colos.get(3));
    }

}
