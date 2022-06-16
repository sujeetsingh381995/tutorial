package com.ziletech.polymorphism;

public class OverloadingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10,20));
        System.out.println(calculator.add("Raipur"));
        System.out.println(calculator.add(10,20,30));
    }
}

class  Calculator{
    public int add(int a , int b){
        return a+b;
    }
    public String add(String city){
        return city;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
