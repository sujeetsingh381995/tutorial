package com.ziletech.collectiontraining.map.practice;

import java.util.ArrayList;
import java.util.List;

public class UniqueNameByFirstLatter {
    public static void main(String[] args) {
        String input = "amit,rahul,sonu,nagendra,sujeet, yukti,arun,ramesh";
        List<String> uniqueList = unique(input);
        System.out.println(uniqueList);

    }

    private static List<String> unique(String input) {
        List<String> list = new ArrayList<>();
        String[] names = input.split(",");
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (!isListHasName(list,name)){
                list.add(name);
            }
        }

        return list;
    }

    private static boolean isListHasName(List<String> list, String name) {
        for (int i=0;i<=list.size()-1;i++){
            String existingName = list.get(i);
            if(existingName.charAt(0)==name.charAt(0)){
                return true;
            }
        }
        return false;
    }
}
