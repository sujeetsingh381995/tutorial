package com.ziletech.oops;

import java.util.*;

public class MultipleInheritance {

    public static void main(String[] args) {
//        C a = new C();
//        a.printA();
//        a.printB();
//        a.printC();

        // Collection - get()
        // Set - get()
        // HashSet - get(index)

       ArrayList<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(1);

        System.out.println(collection.get(1));

        for(Integer item : collection){
            System.out.println(item);
        }

       System.out.println(collection.get(0));
        System.out.println(collection.get(1));
    }

   public static void print(A a){
        System.out.println("--------");
        a.printA();
        System.out.println("-------");
   }

    public static void print1(B b){
        System.out.println("***********");
        b.printB();
        System.out.println("***********");
   }


}


interface A{
    void printA();
}

interface B extends A{
    void printB();
}

class C implements B{

    public void printA(){
        System.out.println("Printing A");
    }

    public void printB(){
        System.out.println("Printing B");
    }

    public void printC(){
        System.out.println("Printing C");
    }
}