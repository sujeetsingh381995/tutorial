package com.ziletech.tutorial;

public class StringPractice {
        public static void main(String[] args){

            String city = "Raipur Biaspur korba Banglor";

            String[] citys = city.split(" ");

            for(int i = citys.length-1; i>0; i--){
                System.out.print(citys[i]+" ");

            }
        }
    }


