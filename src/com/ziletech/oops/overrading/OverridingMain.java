package com.ziletech.oops.overrading;

public class OverridingMain {

    public static void main(String[] args) {
        Vehicle vehicle = new MarutiCar();
        vehicle.setModel("M1");
        vehicle.print("hello");
    }
}

class Vehicle{

    private String model;

    public void print(){
        System.out.println("Vehicle model# " + model);
    }

    public void print(String x){
        System.out.println("Vehicle model with symbol # " + model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Car extends Vehicle{

    public void print(Integer x){
        System.out.println("Car model# " + getModel());
    }
}

class MarutiCar extends Car{
    public void print(){
        System.out.println("Maruti model# " + getModel());
    }
}

class Bike extends Vehicle{

}

