package com.ziletech.object;

public class ObjectApplication {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor();
//        monitor1.model = 111;
        monitor1.setModel(100);
        monitor1.setModel(-123);

        System.out.println(monitor1.getModel());
//        monitor1.printInfo();
    }
}
