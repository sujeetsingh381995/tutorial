package com.ziletech.exceptions;

import java.io.IOException;

public class SimpleExceptionApp {

    public static void main(String[] args) {
//        printDouble(null);
        printDouble2(0);
//        printDoubleWithFinally(null);
    }

    public static void printDouble(Integer i){
        try{
            System.out.println("Start");
            for (int j = 0; j < 5; j++) {
                System.out.println("wow " + j);
                System.out.println(2/i);
            }
            System.out.println("End");
        }catch(NullPointerException e){
            System.out.println("Null exception occurred");
            e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception occurred");
            e.printStackTrace();
        }
        System.out.println("This is end of main method.");
    }

    public static void printDouble1(Integer i){
        try{
            System.out.println("Start");
            for (int j = 0; j < 5; j++) {
                System.out.println("wow " + j);
                System.out.println(2/i);
            }
            System.out.println("End");
        }catch(NullPointerException | ArithmeticException e ){
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
        System.out.println("This is end of main method.");
    }

    public static void printDouble2(Integer i){
        try{
            System.out.println("Start");
            for (int j = 0; j < 5; j++) {
                System.out.println("wow " + j);
                System.out.println(2/i);
            }
            System.out.println("End");
        }catch(RuntimeException e ){
            System.out.println("Exception occurred");
            e.printStackTrace();
        }finally{
            System.out.println("Hello finally");
        }
        System.out.println("This is end of main method.");
    }


    public static void printDoubleWithFinally(Integer i){
        try{
            System.out.println("Start");
            for (int j = 0; j < 5; j++) {
                System.out.println("wow " + j);
                System.out.println(i*2);
            }
            System.out.println("End");
        }finally {
            System.out.println("finally is called");
        }
        System.out.println("This is end of main method.");
    }

    public static void printDoubleWithFinally2(Integer i){
        try{
            System.out.println("Start");
            for (int j = 0; j < 5; j++) {
                System.out.println("wow " + j);
                System.out.println(i*2);
            }
            System.out.println("End");
        }finally{
            System.out.println("Finally blocked is called.");
        }
        System.out.println("This is end of main method.");
    }

}
