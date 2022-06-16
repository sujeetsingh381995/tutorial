package com.ziletech.exceptionsconcept;

public class Arithmetic {
    public static void main(String[] args){
//        calculator(5,0);
        System.out.println("Exam started!");
        try {
            printResult(190);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        System.out.println("Exam is over!");
    }
    public static void calculator(int first , int second){

        System.out.println("Normal Calculator");
      try {
          System.out.println(first/second);
//          sujeet();
          System.out.println("Total Number");
      }catch (RuntimeException r){
//          System.out.println("error encountered");
          r.printStackTrace();
      }finally {
          System.out.println("This Number ia invalid");
      }

        System.out.println("First Number :  " + first);
    }

    public static void printResult(int result){
        if(result < 0 || result > 100){
            throw new IllegalArgumentException("You can pass between 0 to 100");
        }
        System.out.println(" You got " + result + "%");
    }

}
