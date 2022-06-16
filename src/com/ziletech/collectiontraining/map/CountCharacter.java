package com.ziletech.collectiontraining.map;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static void main(String[] args) {
        String input = "Figurative language and expansive vocabulary";
        Map<Character, Integer> result = countDuplicateWords(input);
        for (Character k : result.keySet()) {
            System.out.println(k + "  " + result.get(k));
        }
    }

    private static Map<Character, Integer> countDuplicateWords(String input) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i <= input.length() - 1; i++) {
            char key = input.charAt(i);
            if (count.containsKey(key)) {
                count.put(key, count.get(key) + 1);
            } else {
                count.put(key, 1);
            }
        }
        return count;
    }
}
