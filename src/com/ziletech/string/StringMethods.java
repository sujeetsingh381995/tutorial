package com.ziletech.string;

public class StringMethods {

    public static void main(String[] args) {
        String text = " Hello World                       ";
        String result = text.replaceAll("hello", "bye");
        System.out.println(text);
        System.out.println(result);

        //substring
        System.out.println(text.substring(2,text.length())); //startIndex
        System.out.println(text.substring(2,5)); // startIndex, endIndex
                                                //endIndex - x
        String lowerText = text.toLowerCase();
        System.out.println(lowerText);

        System.out.println(text.toUpperCase());
        System.out.println(text.trim());

    }
}
