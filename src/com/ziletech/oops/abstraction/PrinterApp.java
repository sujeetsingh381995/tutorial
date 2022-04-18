package com.ziletech.oops.abstraction;

public class PrinterApp {

    public static void main(String[] args) {
        Printer printer = new NewStarPrinter();
        printer.print();
    }
}

abstract class Printer{

    public void print(){
       System.out.println("______________________");
        for (int i = 0; i < getCount(); i++) {
            System.out.print(getSymbol());
        }
        System.out.println();
        System.out.println("______________________");
    }

    public abstract char getSymbol();
    public abstract int getCount();

}

abstract class DefaultCountPrinter extends Printer{
    public int getCount(){
        return 20;
    }
}

abstract class DefaultSymbolPrinter extends Printer{
    public char getSymbol(){
        return '*';
    }
}

class StarPrint extends DefaultSymbolPrinter{
    public int getCount(){
        return 30;
    }
}

class PipePrinter extends Printer{

    public char getSymbol() {
        return '|';
    }
    public int getCount(){
        return 50;
    }
}

class HashPrinter extends DefaultCountPrinter{
    public char getSymbol(){
        return '#';
    }
}

abstract class GenericPrinter extends Printer{

    public char getSymbol(){
        return '*';
    }
    public int getCount(){
        return 30;
    }
}

class NewStarPrinter extends GenericPrinter{

}


