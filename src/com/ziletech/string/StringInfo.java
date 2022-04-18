package com.ziletech.string;

public class StringInfo {
    public static void main(String[] args){
        String name = "Nagendra Chandrakar";
        String address="raipur";
        System.out.println(name +" "+address);
        
        System.out.println("Length   : " + name.length());
        
        System.out.println("Length : " + address.length());
        
        System.out.println("charAt : " + name.charAt(6));
        System.out.println("-----");
        System.out.println("charAt ent: " + name.charAt(name.length()-1));
        
        System.out.println(8+9+"Singh"+8+2 +(9+7)+"sujeet");
        
        System.out.println("Substring 2  : " + name.substring(0,6));
        
        System.out.println("Equals  : " + name.equals("Nagendra Chandrakae"));
        
        System.out.println("equalsIgnoreCase: " + name.equalsIgnoreCase("nagenDra chhandrakat"));
        
        
        char[]chars;
       
        chars = name.toCharArray();            

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        
        String txt = "my name is nagendra chandrakar";
        String[] words = txt.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        
    }
    
    
}
