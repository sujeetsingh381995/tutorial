package com.ziletech.string;

import javax.sound.midi.Soundbank;

public class StringPractise {

    public static void main(String[] args) {

//        count a number of characters ends at given matched character.

        String mail = "sujeet@ziletech.com";
        char[] cars = mail.toCharArray();
        int count = 0;

        for (int i = 0; i < cars.length; i++) {
            count++;
        }
        System.out.println(count);
        System.out.println("------------------");

//      alternative characters of two strings

        String middleName = "Kumar";
        String lastName = "Singh";

        char[] chars = middleName.toCharArray();
        char[] chars1 = lastName.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result = result + chars[i] + chars1[i];
        }
        System.out.println(result);
        System.out.println("------------------");


        String name = "1.Ngengra 2.Yukti 3.Mahesh ";
        String[] names = name.split(" ");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].replace(".", ". "));

        }
        System.out.println("------------------");


        String[] strings = new String[3];
        strings[0] = "1. singh Rahul Male";
        strings[1] = "2. sahi Rohit Male";
        strings[2] = "3. das Poonam female";


        for (int i = 0; i < strings.length; i++) {
            String row = strings[i];
            String[] nam = row.split(" ");
            String output = nam[0] + " " + nam[2] + " " + nam[1] + " " + nam[3];
            System.out.println(output);

        }
        System.out.println("------------------");

        String s = "  Times Internet Limited. All rights reserved   ";
        System.out.println(s.contains("reserve"));
        System.out.println("------------------");

        String columnPrint = "RAMNARAYAN";
        for (int i = 0; i < columnPrint.length(); i++) {
            System.out.println(columnPrint.substring(i, i + 1));
        }
        System.out.println("------------------");
        System.out.println(s.toLowerCase());

        System.out.println("------------------");
        System.out.println(s.toUpperCase());

        System.out.println("------------------");
        System.out.println(s.trim());


    }

    public static String reverseString(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }
}
