package com.ziletech.collections;

import java.util.HashMap;

public class MapApplication {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2,"TWO");
        map.put(4,"hello");
        map.put(5,"FIVE");

        //keys
        System.out.println(" ==== keys ====");
        for(Integer v : map.keySet()){
            System.out.println(v);
        }

        System.out.println("===== values ====");
        for(String v : map.values()){
            System.out.println(v);
        }

        //get by key
        System.out.println("===== get by key ====");
        System.out.println(map.get(4));

        //remove
        map.remove(2);
        System.out.println("==== After remove ===");
        for(String v : map.values()){
            System.out.println(v);
        }
    }
}
