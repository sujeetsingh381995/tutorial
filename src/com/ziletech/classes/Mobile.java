package com.ziletech.classes;

import java.util.Date;

public class Mobile {

    String model;
    String os;

    void printInfo(){
        int count = 1;
        Date date = new Date();
        System.out.println("Today's Date : " + date);
        System.out.println("Model: " + model + " OS: " + os);

        int i = count;
        for (; i < count +  5; i++) {
            System.out.println(i);
        }
        count = count + 5;
    }

    public int getCount(int oldCount){
        return oldCount + 5;
    }

}
