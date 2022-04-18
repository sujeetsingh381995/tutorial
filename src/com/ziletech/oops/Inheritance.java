package com.ziletech.oops;

public class Inheritance {

    // Compiler [ syntax check ] ----> class ----> JVM [ execute the code ]
    //.jar - contains all the project compiled files

    // Compiler Error
    // Exceptions

    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.setModel("B01");
        bike.setColor("Red");
        bike.setHandle("Straight");
        bike.print();

        Car car = new Car();
        car.setModel("CA01");
        car.setColor("Green");
        car.setFuelType("Diesel");
        car.print();
    }
}

class Vehicle{

    private String model;
    protected String color;

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }
}

class Bike extends Vehicle{

    private String handle;
    public void print(){
        System.out.println(" ---- Bike Info ----");
        System.out.println(" Model : " + getModel() );
        System.out.println(" Handle Type : " + handle );
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
}

class Car extends Vehicle{
    private String fuelType;

    public void print(){
        System.out.println("---- Car Info -----");
        System.out.println(" model : " + getModel());
        System.out.println(" fuel type : " + getFuelType());
    }
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

