package com.ziletech.qna.session1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetExamples {

    //ARKP
    public static void main(String[] args) {

        String name = "Ashish Ravi Ravindra Kaushik Raj Pratik";
        String[] names = name.split(" ");
        HashSet<Character> hashSet = new LinkedHashSet<>();

        for(String n : names){
            hashSet.add(n.charAt(0));
        }

        for(Character c : hashSet){
            System.out.println(c);
        }
    }
}
