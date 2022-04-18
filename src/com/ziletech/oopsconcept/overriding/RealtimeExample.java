package com.ziletech.oopsconcept.overriding;

public class RealtimeExample {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Decorator decorator = new StarDecorator();
        printer.print(decorator);

        printer.print(new DashDecorator());

    }
}


class Printer {

    public void print(Decorator decorator) {
        System.out.println();
        for (int i = 0; i < 30; i++) {
            System.out.print(decorator.getSymbol());
        }
        System.out.println();
        System.out.println(decorator.getTitle());
        System.out.println(decorator.getDesc());
        decorator.executeFooter();
        for (int i = 0; i < 30; i++) {
            System.out.print(decorator.getSymbol());
        }
        System.out.println();
    }
}

interface Decorator {
    char getSymbol();

    String getTitle();

    String getDesc();

    void executeFooter();
}

class StarDecorator implements Decorator {

    public char getSymbol() {
        return '*';
    }

    public String getTitle() {
        return "Start Title";
    }

    public String getDesc() {
        return "Hello to star decorator";
    }

    public void executeFooter() {

    }
}

class DashDecorator implements Decorator {

    public char getSymbol() {
        return '-';
    }

    public String getTitle() {
        return "Dash Title";
    }

    public String getDesc() {
        return "Hello to dash decorator";
    }

    public void executeFooter() {
        for (int i = 0; i < 30; i++) {
            System.out.print("|");
        }
        System.out.println();
    }
}