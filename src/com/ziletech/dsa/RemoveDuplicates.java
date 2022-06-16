package com.ziletech.dsa;


import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] input = {3,4,7,1,3,1};
        System.out.println(removeDuplicate(input));
    }

    private static List<Integer> removeDuplicate(int[] input){

        List<Integer> result = new ArrayList<>();
        for(int i=0; i<input.length; i++){
            int first = input[i];
            boolean found = false;
            for(int j=i+1; j < input.length; j++){
                int second = input[j];
                if(first == second){
                    found = true;
                    break;
                }
            }
            if(!found){
                result.add(first);
            }
        }
        return result;
    }

}
