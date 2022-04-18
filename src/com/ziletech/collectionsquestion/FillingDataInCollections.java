package com.ziletech.collectionsquestion;

import java.util.*;

public class FillingDataInCollections {

    // String txt = "Abhishek Bhupendra ............";

    //  A - Abhishek
    //    - Amar
    //  B - Bhupendra
    //    - Bijesh
    //  C - Chandra

    public static void main(String[] args) {

        HashMap<Character, Set<String>> nameMap = new HashMap<>();

        Set<String> namesA = new HashSet<>();

        namesA.add("abhishek");
        namesA.add("Amar");
        nameMap.put('A',namesA);

        Set<String> namesB = new TreeSet<>();
        namesB.add("Deepak");
        namesB.add("Bijesh");
        namesB.add("Abhishek");
        namesB.add("Bikranjit");
        nameMap.put('B',namesB);

        for(Character key : nameMap.keySet()){
            System.out.println("----- Category : " + key + "------");
            for(String name : nameMap.get(key)){
                System.out.println(name);
            }
        }
    }
}
