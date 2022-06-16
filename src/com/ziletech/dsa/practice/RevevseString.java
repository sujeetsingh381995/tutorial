package com.ziletech.dsa.practice;

public class RevevseString {

    public static void main(String[] args) {
        System.out.println(count("I'm the new newt wow newchange","new"));
    }


    //I'm the new newt, new
    static int count(String input, String word){
        //split
        //iterate
        //matching - count

        String[] words = input.split("\\s");
        int count = 0;
        for(int i=0; i <= words.length - 1; i++){
            if(words[i].startsWith(word)){
                count++;
            }
        }
        return count;
    }

}
