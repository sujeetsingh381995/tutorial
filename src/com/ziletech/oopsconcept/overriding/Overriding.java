package com.ziletech.oopsconcept.overriding;

public class Overriding{

    public static void main(String[] args) {

    }
}

class Vehicle {

    private String model;

    public void print() {
        System.out.println("Vehicle model# " + model);
    }

    public void print(String x) {
        System.out.println("Vehicle model with symbol # " + model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
class Bus extends Vehicle {


}