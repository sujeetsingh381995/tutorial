package com.ziletech.exceptions.checked;

public class CheckedExceptionMain {

    public static void main(String[] args) {
        A a = new A();
        try {
            a.print(null);
        } catch (IllegalArgumentException | MessageEmptyException | MessageNullException e) {
            e.printStackTrace();
        }
        System.out.println("End of main method");
    }
}

class A{

    public void print(String message) throws MessageEmptyException, MessageNullException {
        System.out.println("AAAAAAA");
        new B().print(message);
        System.out.println("AAAAAAA Ending");
    }
}

class B{

    public void print(String message) throws MessageEmptyException, MessageNullException {
        System.out.println("BBBBBBB");
        new C().print(message);
        System.out.println("BBBBBBB Ending");
    }
}

class C{

    public void print(String message) throws MessageEmptyException, MessageNullException {
        System.out.println("CCCCCCC");
        if(message == null){
            throw new MessageNullException();
        }
        if(message.isEmpty()){
            throw new MessageEmptyException();
        }
        System.out.println("Actual message is : " + message);
        System.out.println("CCCCCCC Ending");
    }
}
