package com.ziletech.collectionsquestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListApplication {

    public static void main(String[] args) {
        addElement();
        getElement();
        setElement();
        searchElement();
        isEmptyElement();
        copyElement();
        subListElement();
    }

    private static void addElement() {
        ArrayList<String> citys = new ArrayList<>();
        citys.add("Bengaluru");
        citys.add("Raipur");
        citys.add("Mumbai");
        citys.add("Kolkata");
        citys.add("Bilaspur");
        for (String city : citys) {
            System.out.println(city);

        }
        System.out.println(citys);
    }

    private static void getElement() {
        ArrayList<String> citys = new ArrayList<>();
        citys.add("MDGR");
        citys.add("Kanpur");
        citys.add("Pune");
        citys.add("AMPE");

        System.out.println(citys.get(3));
    }

    private static void setElement() {
        ArrayList<String> citys = new ArrayList<>();
        citys.add("Bengaluru");
        citys.add("Raipur");
        citys.add("Mumbai");
        citys.add("Kolkata");
        citys.add("Bilaspur");

        citys.set(2, "Surat");
        System.out.println(citys);
    }

    private static void searchElement() {
        ArrayList<String> citys = new ArrayList<>();
        citys.add("MDGR");
        citys.add("Kanpur");
        citys.add("Pune");
        citys.add("AMPE");

        if (citys.contains("Raipur")) {
            System.out.println("Raipur city in chhattisgarh");
        } else {
            System.out.println("Raipur city not in chhattisgarh");
        }
    }

    private static void isEmptyElement() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(225);
        numbers.add(123);
        numbers.add(890);
        numbers.add(893);
        numbers.add(68);

        System.out.println("-----------isEmpty");
        System.out.println("is array emplty! " +  numbers.isEmpty());
        numbers.removeAll(numbers);
        System.out.println("is array emplty!" +  numbers.isEmpty());
    }


    private static void copyElement() {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("225");
        numbers.add("123");
        numbers.add("890");
        numbers.add("893");
        numbers.add("68");
        System.out.println(numbers);
        ArrayList<String> citys = new ArrayList<>();
        citys.add("Bengaluru");
        citys.add("Raipur");
        citys.add("Mumbai");
        citys.add("Kolkata");
        citys.add("Bilaspur");
        System.out.println(citys);
        Collections.copy(citys, numbers);
        System.out.println(numbers);
        System.out.println(citys);

    }

    private static void subListElement() {
        ArrayList<String> citys = new ArrayList<>();
        citys.add("Bengaluru");
        citys.add("Raipur");
        citys.add("Mumbai");
        citys.add("Kolkata");
        citys.add("Bilaspur");
        System.out.println(citys);
        List<String> subList = citys.subList(0, 2);
        System.out.println(subList);

    }
}

