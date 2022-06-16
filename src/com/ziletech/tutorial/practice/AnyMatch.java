package com.ziletech.tutorial.practice;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
        String input = "ram,rohan,rahul,ramesh,sujeet,nagendra";

        System.out.println(anyMatch(input));

    }

    public static List<String> anyMatch(String input) {
        List<String> list = new ArrayList<>();
        String[] names = input.split(",");
        for (int i = 0; i <= names.length - 1; i++) {
            String name = names[i];
            char first = name.charAt(0);
            boolean found = false;
            for (int j = 0; j <= list.size() - 1; j++) {
                String exitingName = list.get(j);
                char exitingCh = exitingName.charAt(0);
                if (first == exitingCh) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                list.add(name);
            }
        }
        return list;
    }

}
