package com.ziletech.dsa.practice;


public class AllMatch {
    public static void main(String[] args) {
       String[] input = {"sujeet","singh","sohel","sharma"    };
        boolean allMatched = allMatch(input,'s');
        System.out.println(allMatched);
    }

    private static boolean allMatch(String[] input ,Character c){

        for (int i = 0; i <input.length ; i++) {
            String name = input[i];
            if (name.charAt(0)!=c){
                return false;
            }

        }
        return true;
    }
}
