package com.ziletech.practice;


import java.util.ArrayList;
import java.util.List;

public class PatternPractice {

    public static void main(String[] args) {
        String input = "Ajit,Anju,Bhima,Krishna,Kusum";
        // output : [Ajit, Bhima, Krishna]
        System.out.println(getUniqueNames(input));
//        System.out.println(getDuplicateCharacters("AliveIsAwesome"));
    }

    public static List<Character> getDuplicateCharacters(String input){
        List<Character> result = new ArrayList<>();
        //AliveIsAwesome
        for(int i=0; i<= input.length()-1; i++){

            char c = input.charAt(i);
            boolean found = false;

            for(int j=0; j <= result.size()-1; j++){
                if(result.get(j) == c){
                    found = true;
                }
            }
            if(!found){
                result.add(c);
            }
        }
        return result;
    }


    private static List<String> getUniqueNames(String input){
        List<String> result = new ArrayList<>();
        //split
        String[] names = input.split(",");
        //Iterate
        for(int i=0; i <= names.length -1; i++){
            String name = names[i];
            char c = name.charAt(0);

            // match the first letter in the result
            // any match
            boolean found = false;

            for(int j=0; j <= result.size()-1; j++){
                if(result.get(j).charAt(0) == c){   // any - OR
                    found = true;
                    break;
                }
            }
            if(!found){
                result.add(name);
            }

        }
        // false => add to the list
        return result;
    }

}

/**
 * Any Match
 *
 * boolean found = true;
 * for(int i=0; i < items.length-1; i++){
 *     if(items[i] != 'C') //matched
 *     {
 *         found = false;
 *     }
 * }
 *
 *
 *
 */