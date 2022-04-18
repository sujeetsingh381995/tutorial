package com.ziletech.oops;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        printInfo(list);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A1");
        arrayList.add("A2");
        arrayList.add("A3");
        printInfo(arrayList);

        List<String> l = new LinkedList<>();
        l.add("A1");
        l.add("A2");
        l.add("A3");
        for(String item : l){
            System.out.println(item);
        }

    }

    private static void printInfo(List<String> list){
        System.out.println("--------------------------------");
        for (String item : list) {
            System.out.println(item);
        }
    }

    private static void printInfo(LinkedList<String> list){
        System.out.println("--------------------------------");
        for (String item : list) {
            System.out.println(item);
            System.out.println(1);
            System.out.println("S");
            System.out.println(true);
        }
    }
//    private static void printInfo(List<String> list){
//        System.out.println("--------------------------------");
//        for (String item : list) {
//            System.out.println(item);
//        }
//    }

}
