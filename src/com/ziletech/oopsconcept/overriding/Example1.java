package com.ziletech.oopsconcept.overriding;

public class Example1 {

    public static void main(String[] args) {
        A a = new A();
        a.print();
        a = new B();
        a.print();
        a = new C();
        a.print();
    }
}

class A{
    public void print(){
        System.out.println("Printing A");
    }
}

class B extends A{
    public void print(){
        for (int i = 0; i < 5; i++) {
            System.out.println("BBBBBBBBBBB");
        }
    }
}

class C extends B{
    public void print(){
        for (int i = 0; i < 2; i++) {
            System.out.println("----------- C-----------");
        }
    }
}