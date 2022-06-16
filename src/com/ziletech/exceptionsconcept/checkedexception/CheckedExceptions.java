package com.ziletech.exceptionsconcept.checkedexception;




public class CheckedExceptions {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.print(4556);

    }
}
class Calculator{

    public void print(Integer calculat) {
        System.out.println("Calculator");
        new AdvanceCalculator().print((calculat));
        System.out.println("AAAAAAA Ending");
    }
}

class AdvanceCalculator{

    public void print(Integer calculat) throws RuntimeException {
        System.out.println("BBBBBBB");
        new SuperCalculator().print(calculat);

    }
}


class SuperCalculator{

    public void print(Integer calculat) {
        System.out.println("SuperCalculator");
        if(calculat == null){
            throw new NullPointerException() ;
        }
            throw new ArithmeticException();

    }
}
