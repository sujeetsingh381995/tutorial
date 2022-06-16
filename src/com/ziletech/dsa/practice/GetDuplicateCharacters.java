package com.ziletech.dsa.practice;

import java.util.ArrayList;
import java.util.List;

public class GetDuplicateCharacters {
    public static void main(String[] args) {
        String input = "Raipur,Bilashpur,Bengaluru,Karnataka,Kerala,Raigarh,Ambikapur";
        int[] input1 = {1, 3, 4,3,1, 7, 6, 2, 3, 7, 1};
        System.out.println(getDuplicateCharacters(input));

    }

    private static List<String> getDuplicateCharacters(String input) {
        List<String> list = new ArrayList<>();
        String [] names = input.split(",");
        for (int i = 0; i <=input.length()-1 ; i++) {




        }


        return list;
    }

}
