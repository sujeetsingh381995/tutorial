package com.ziletech.collections;

import java.util.ArrayList;

public class ListApplication {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);   //arr[0]=10
        numbers.add(30);
        numbers.add(50);
        numbers.add(60);
        Integer n = 50;
        numbers.remove(n);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("ABC");
        stringList.add("XYZ");
        stringList.remove("ABC");


        for(int i=0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));  //arr[i]
        }
        System.out.println("======");
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;

        for(int number : arr){
            System.out.println(number);
        }
        System.out.println("======");

        //enhanced for loop
        for(Integer number : numbers){
            System.out.println(number);
        }

        //by index
        System.out.println(numbers.get(1));

    }

}
