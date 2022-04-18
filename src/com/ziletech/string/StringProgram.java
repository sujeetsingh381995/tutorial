package com.ziletech.string;

public class StringProgram {
    public static void main(String[] args) {
        String name = "narendra.damodar das modi";
        charAt(name);
        countWord();
        combineWord();
        contains(name);
        endsWith(name);
        equals();
        ignoreCase(name);
        empty(name);
        size(name);
        replace(name);
        startsWith(name);
        substring(name);
        split(name);
    }

    private static void split(String name) {
        System.out.println("Split---------");
        String[] words = name.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    private static void substring(String name) {
        System.out.println("substring----------");
        System.out.println(name.substring(0, 13));
        System.out.println(name.substring(5));
    }

    private static void startsWith(String name) {
        System.out.println("startsWith---------");
        System.out.println(name.startsWith("n"));
        System.out.println(name.startsWith("m"));
    }

    private static void replace(String name) {
        System.out.println("replace-----------");
        System.out.println(name.replaceAll("narendra", "Ziletech"));
    }

    private static void size(String name) {
        System.out.println("length-----------");
        System.out.println(name.length());
    }

    private static void empty(String name) {
        System.out.println("isEmpty----------------");
        System.out.println(name.isEmpty());
    }

    private static void ignoreCase(String name) {
        System.out.println("equalsIgnoreCase-----------");
        System.out.println(name.equalsIgnoreCase("Narendra.Damodar Das Modi"));
    }

    private static void charAt(String name) {
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(10));
    }

    private static void equals() {
        String word = "Hello";
        System.out.println("equals-----------");
        System.out.println(word.equals("Hello"));
        System.out.println(word.equals("hello"));
    }

    private static void endsWith(String name) {
        System.out.println("endsWith-----------");
        System.out.println(name.endsWith("i"));
        System.out.println(name.endsWith("r"));
    }

    private static void contains(String name) {
        System.out.println("contains-----------");
        System.out.println(name.contains("odar"));
        System.out.println(name.contains("odad"));
    }

    private static void combineWord() {
        String text = "Hello";
        String text1 = "World";
        String combind = "";
        char[] sentencs = text.toCharArray();
        char[] sentencs1 = text1.toCharArray();
        for (int i = 0; i<text.length(); i++){
            combind=combind+sentencs[i]+sentencs1[i];
        }
        System.out.println(" alternative characters--------------");
        System.out.println(combind);
    }

    private static void countWord() {
        String side = "ziletech com";
        char[] chars = side.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                count++;

            } else {
                break;
            }
        }
        System.out.println("" + count);
    }

}
