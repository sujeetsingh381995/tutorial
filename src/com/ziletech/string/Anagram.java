package com.ziletech.string;


import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String first = "";
        String second = "";

       boolean status =  checkAnagram(first,second);
       if(status){
           System.out.println(first+second);
       }else {
           System.out.println(first+second);
       }

    }

    private static boolean checkAnagram(String first, String second){
        boolean status = true;
        if (first.length()!= second.length()){
            status = false;
        }else {
            char[] firstString = first.toLowerCase().toCharArray();
            char[] secondString = second.toLowerCase().toCharArray();
            Arrays.sort(firstString);
            Arrays.sort(secondString);
           status = Arrays.equals(firstString,secondString);
        }
        return status;
    }
}
