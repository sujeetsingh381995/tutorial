package com.ziletech.dsa.forloop;

public class ForLoopPractice {

    public static void main(String[] args) {
        String city = "Raipur";
        String[] chars = city.split("");
        for (int i=city.length()-1; i>=0; i--){
            System.out.print(chars[i]);
        }
    }



}
