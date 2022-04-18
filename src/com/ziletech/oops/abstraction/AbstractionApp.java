package com.ziletech.oops.abstraction;

public class AbstractionApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Bike();
        vehicle.print();
    }
}

abstract class Vehicle{

    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public void print(){
        System.out.println("Model# " + model
                + " and wheels : " + getWheel()
                + " and handle type : " + getHandleType());
    }

    public abstract int getWheel();

    public abstract String getHandleType();
}

class Car extends Vehicle{

    public int getWheel() {
        return 4;
    }

    public String getHandleType() {
        return "Steering";
    }
}

class Bike extends Vehicle{

    public int getWheel() {
        return 2;
    }

    public String getHandleType() {
        return "Handle";
    }
}