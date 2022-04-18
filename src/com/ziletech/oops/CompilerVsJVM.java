package com.ziletech.oops;

public class CompilerVsJVM {

    public static void main(String[] args) {
//        compilerTest();

//        Compiler = JVM
//        Cat obj = new Cat();

//        Animal obj1 = new Cat(); // 100%
//        obj1.setName("A");
//        obj1.setHybrid <--- X

//        Animal obj1 = new String(); // 100%
//        obj1.setName("A");
//        obj1.setHybrid

//        Cat obj = new Animal();
//        obj.setName("A");
//        obj.setHybrid("H1");

//        Cat c = new Dog();
//        Dog d = new Cat();

//        System.out.println(obj);
//        obj.print();
    }

    private static void compilerTest() {
        Dog dog = null;   // there is no compilation error
        dog.setName("A"); // null.setName("A") - NullPointerException
        dog.setType("T1");


        Dog dog1 = new Dog();
        dog1.setName("B"); //Dog - jvm

    }

}


class Animal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("This is animal");
    }
}

class Dog extends Animal{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void print(){
        System.out.println("This is Dog");
    }
}

class Cat extends Animal{
    private String hybrid;
    private String name;

    public String getHybrid() {
        return hybrid;
    }

    public void setHybrid(String hybrid) {
        this.hybrid = hybrid;
    }

    public void print(){
        System.out.println("This is Cat");
    }
}

