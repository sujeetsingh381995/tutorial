package com.ziletech.collections;

import java.util.HashSet;

public class SetApplication {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(30);
        numbers.add(30);//ignore
        numbers.add(50);

        numbers.remove(30);

        System.out.println("set size : " + numbers.size());
        for(Integer number : numbers){
            System.out.println(number);
        }

    }
}
