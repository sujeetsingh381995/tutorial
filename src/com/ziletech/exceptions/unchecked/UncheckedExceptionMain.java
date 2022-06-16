package com.ziletech.exceptions.unchecked;

public class UncheckedExceptionMain {

    public static void main(String[] args) {
        A a = new A();
        try{
             a.print(null);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        System.out.println("End of main method");
    }
}

class A{
    public void print(String message){
        System.out.println("AAAAAAA");
        new B().print(message);
        System.out.println("AAAAAAA Ending");
    }
}

class B{

    public void print(String message) {
        System.out.println("BBBBBBB");
        new C().print(message);
        System.out.println("BBBBBBB Ending");
    }
}

class C{

    public void print(String message) {
        System.out.println("CCCCCCC");
        if(message == null || message.isEmpty()){
            throw new IllegalArgumentException("You provided empty message");
        }
        System.out.println("Actual message is : " + message);
        System.out.println("CCCCCCC Ending");
    }
}