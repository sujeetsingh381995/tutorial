package com.ziletech.qna.onlinequestions;

public class Questions {
}

class A {
    void m1(String x){
        System.out.println("One");
    }
}

class B extends A {
    public void m1(String x){
        System.out.println("Two");
        super.m1(null);
    }
}

class Test{
    public static void main(String[] args){
        A a = new B();
        a.m1(null);
    }
}