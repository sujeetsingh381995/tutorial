package com.ziletech.tutorial;

public class ExceptionExample {

    public static void main(String[] args) {

        System.out.println("statment 1");
        System.out.println("statment 2");
        System.out.println("statment 3");

        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("statment 5");
        System.out.println("statment 6");

    }



    public static  void add(Integer firstNumber,Integer secondNumber){
        System.out.println(firstNumber+secondNumber);
    }
    public static  void devide(int firstNumber,int secondNumber){
        System.out.println(firstNumber/secondNumber);
    }


}
