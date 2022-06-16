package com.ziletech.exceptions;

public class ThrowExceptionApp {

    public static void main(String[] args) {
        print2(-1);
    }

    private static void print(Integer number) {
        System.out.println("Original number : " + number);
        try {
            System.out.println("Double number : " + multiplyBy2(number));
        }catch (RuntimeException e){
            System.out.println("Double number : " + 0);
            e.printStackTrace();
        }
    }

    private static void print2(Integer number) {
        System.out.println("Original number : " + number);
        try {
            System.out.println("Double number : " + multiplyBy2(number));
        }catch (RuntimeException e){
            System.out.println("Double number : " + number * 2);
            e.printStackTrace();
        }
        System.out.println("Print2 ended");
    }

    private static Integer multiplyBy2(Integer number){
        if(number == 0){
            throw new RuntimeException("Are you an idiot ");
        }
        if(number < 0){
            throw new NegativeNumberException();
        }
        return number * 2;
    }

}
