package com.ziletech.tutorial.practice;

public class AllMatch {
    public static void main(String[] args) {

        String input = "sujeet skumar singh";
        boolean allMatched = allMatch(input,'s');
        System.out.println(allMatched);
    }

    private static boolean allMatch(String input, char s) {

        String[] names = input.split(" ");
        for (int i = 0; i <=names.length-1 ; i++) {
            String name = names[i];
            if (name.charAt(0)!=s){
                return false;
            }
        }

        return true;
    }
}
