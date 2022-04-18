package com.ziletech.exam;

public class Application {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        vehicle.print();
    }
}

class Vehicle{

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void print(){
        System.out.println("Hello " + number);
    }
}

class Car extends Vehicle{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}