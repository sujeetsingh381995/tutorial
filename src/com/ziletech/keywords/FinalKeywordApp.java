package com.ziletech.keywords;

public class FinalKeywordApp {

    public static void main(String[] args) {
        String s = new String("ABC");
        final int max = 10;
        for (int i = 0; i < max; i++) {
            System.out.println(i);
        }
//        max = 30;
        for (int i = 0; i < max; i++) {
            System.out.println("*");
        }
    }
}

final class Calculator{
    final String message = "HELLO";
    public int sum(int n1, int n2){
        //message = "Change me";
        return n1 + n2;
    }
}

class Vehicle{
    public final void print(){
        System.out.println("Printing vehicle");
    }
}