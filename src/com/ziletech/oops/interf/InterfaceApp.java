package com.ziletech.oops.interf;

public class InterfaceApp {

    public static void main(String[] args) {
//        Car car = new Car();
//        Bike bike = new Bike();
//        Vehicle vehicle = new Bike();
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        Airplane airplane = new Airplane();
        driveInfo(car);
        driveInfo(bike);
        driveInfo(airplane);
        flayInfo(airplane);

        //Runtime Polymorphism
        Vehicle v = new Car(); //Car
        System.out.println("Vehicle 1 :" + v);
        v = new Bike(); //Bike
        System.out.println("Vehicle 2 :" + v);
        v = new Airplane(); // Airplane
        System.out.println("Vehicle 3 :" + v);

    }


    public static void driveInfo(Vehicle vehicle){
        System.out.println("---------------------------------");
        vehicle.drive();
        System.out.println("It has "+ vehicle.getTyres() + " wheel.");
        System.out.println("----------------------------------");
    }

    public static void flayInfo(Flyable flyable){
        System.out.println("********************");
        flyable.fly();
        System.out.println("********************");
    }

}

class Car implements Vehicle{

    public void drive(){
        System.out.println("Driving car");
    }

    public int getTyres(){
        return 4;
    }

}

class Bike implements Vehicle{

    public void drive(){
        System.out.println("Driving bike");
    }

    public int getTyres(){
        return 2;
    }

    public void kick(){
        System.out.println("Kicking bike");
    }
}

class Airplane implements Vehicle, Flyable{

    public void drive(){
        System.out.println("Driving airplane");
    }

    public int getTyres(){
        return 6;
    }

    public void fly() {
        System.out.println("I am flying Airplane");
    }
}