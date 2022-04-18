package com.ziletech.oops.overloading;

public class OverloadingApp {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("A1");
//        animal.print();
//        animal.print("*");
//        animal.print("HELLO WORLD");
        animal.print(2);
    }
}

class Animal{

    private String name;

    public void print(){
        System.out.println("Simple Print : " + name);
    }

//    public String print(){
//        System.out.println("Simple Print : " + name);
//        return "Some random text";
//    }

    public void print(String symbol){
        System.out.println("Print with symbol : " + symbol + name);
    }

    public Integer print(Integer number){
        System.out.println("Print with number : " + number + name);
        return number * 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}