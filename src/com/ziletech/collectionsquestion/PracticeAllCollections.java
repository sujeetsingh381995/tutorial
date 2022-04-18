package com.ziletech.collectionsquestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class PracticeAllCollections {
    public static void main(String[] args) {
//        addElement();
        s();

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("Blue");
        colors.add("yellow");
        colors.add("Pink");
        colors.add("Green");
        for (String color:colors){
            System.out.println(color);
        }

        ArrayList<Integer>numbres = new ArrayList<>();
        numbres.add(1);
        numbres.add(2);
        numbres.add(4);
        numbres.add(8);
        for (Integer number:numbres){
            System.out.println(number);
        }
//
        ArrayList<Character> c = new ArrayList<>();
        c.add('S');
        c.add('S');
        c.add('T');
        c.add('T');
        c.add('A');
        c.add('A');
        c.add('S');
        c.add('S');
        for (Character cc : c){
            System.out.println(cc);
        }



        }
    private static void addElement() {
        HashSet<String> citys = new HashSet<>();
        citys.add("Bengaluru");
        citys.add("Bengaluru");
        citys.add("Bilaspur");
        citys.add("Raipur");
        citys.add("Raipur");
        citys.add("Mumbai");
        citys.add("Mumbai");
        citys.add("Kolkata");
        citys.add("Kolkata");
        citys.add("Chndigarh");
        for (String city : citys) {
            System.out.println(city);
        }

    }




//      String name = "Ashish Ravi Ravindra Kaushik Raj Pratik";
//      String[] names= name.split(" ");
//      HashMap<Character,Integer> map  = new HashMap<>();
//      for (int i = 0; i<names.length; i++){
//          char firstLattet = names[i].charAt(0);
//          if (!map.containsKey(firstLattet)){
//              map.put(firstLattet,1);
//          }else {
//              Integer cont = map.get(firstLattet);
//              map.put(firstLattet,cont+1);
//          }
//          for (Character key : map.keySet() ){
//              System.out.println(key+""+map.get(key));
//          }
//      }
//    }

    private static void  s(){
        String name = "rahul abhisek aman arunram rao krish parul";
        String[] names = name.split(" ");
        HashMap<Character,ArrayList<String>> map = new HashMap<>();
//        for (String s : names){
//            char first
//        }
//        for (String d : map.keySet() ){
//            System.out.println(d+" "+map.get(d));
//        }
    }

//        for (Character:d.keySet()){
//
//        }


        //A-1  --> key - count
        //R-3
        //K-1
        //P-1


//
//            String address = "word no seven line dafai khingapani koriya chattisgarh";
//            String[] names = address.split(" ");
//            HashMap<Character,Integer> map =new LinkedHashMap<>();
//            for(int i = 0; i<names.length; i++){
//                char fristLatter = names[i].charAt(0);
//                if(!map.containsKey(fristLatter)){
//                    map.put(fristLatter,1);
//                }else {
//                    Integer count = map.get(fristLatter);
//                    map.put(fristLatter,count+1);
//                }
//            }
//            for (Character key : map.keySet()){
//                System.out.println(key+" "+map.get(key));
//
//            }


//        String name = "Rahul Amit Bablu Stru Sonu Ram Sujeet";
//        String[] names = name.split(" ");
//        HashMap<Character,Integer> map = new HashMap<>();
//
//        for (int i = 0; i <names.length; i++){
//            char firstLatter = names[i].charAt(0);
//            if (map.containsKey(firstLatter)){
//                map.put(firstLatter,1);
//
//            }else {
//                Integer cont = map.get(firstLatter);
//                map.put(firstLatter , cont+1);
//            }
//
//        }
//        for (Character key : map.keySet()){
//            System.out.println(key+""+map.get(key));
//        }


//        String city = "Raipur Bilapur Ramgarh Ambikapur raigarh";
//        String[] names = city.split(" ");
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (int i= 0 ; i<names.length; i++){
//            char firstLatter = names[i].charAt(0);
//            if (!map.containsKey(firstLatter)){
//                map.put(firstLatter,1);
//            }else {
//                Integer count = map.get(firstLatter);
//                map.put(firstLatter,count+1);
//            }
//        }
//        for (Character key :map.keySet()){
//            System.out.println(key+" "+map.get(key));
//        }
    }



