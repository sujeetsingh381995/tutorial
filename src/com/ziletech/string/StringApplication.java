package com.ziletech.string;

public class        StringApplication {

    public static void main(String[] args) {

        //concate
        String name ="John Doe";
        String title = new String("John Doe");
        String fullName = name + " " + title;
        String random1 = 1 + 2 + "hello" + 3 + 6 + "world"; //3hello36world
        String random2 = 1 + 2 + "hello" + (3 + 6) + "world"; //3hello9world
        String random3 = 1 + 2 + "hello" + (3 + (6+"nice")) + "world"; //3hello36niceworld

        //methods
        //Ex: John Doe
        System.out.println("Name                : " + name);
        System.out.println("Length              : " + name.length());
        System.out.println("Char At 0           : " + name.charAt(0));
        System.out.println("Char At end         : " + name.charAt(name.length()-1));
        System.out.println("Substring 1         : " + name.substring(5));
        System.out.println("Substring 2         : " + name.substring(0,6)); //includeIndex, excludeIndex
        System.out.println("Equals              : " + name.equals("John doe"));// case sensitive
        System.out.println("equalsIgnoreCase    : " + name.equalsIgnoreCase("jOHn doe"));// case sensitive
        System.out.println("------ Byte Array ---");


        //toCharArray : Break into characters
        char[] chars = new char[name.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = name.charAt(i);
        }
        //OR
        chars = name.toCharArray();             //<-----

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }


        //split : Break into characters
        //My name is john


        System.out.println("---- Printing slit words ----");
        String txt = "My name is john";
        String[] words = txt.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

}

