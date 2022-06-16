package com.ziletech.qna.session2;

import java.io.IOException;

public class PolymorphismMain {

    public static void main(String[] args) {
//        case1_return_type();
//        case2_arguments();
//        case3_unchecked_exception();
        Vehicle vehicle = new Car();
        try {
            vehicle.deliver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void case3_unchecked_exception() {
        Vehicle vehicle = new Car();
        vehicle.pay();
    }

    private static void case2_arguments() {
        Vehicle vehicle = new Car();
        vehicle.takeOrder(2);
    }

    private static void case1_return_type() {
        Vehicle vehicle = new Car();
        Object number = vehicle.getWheels();
        System.out.println(number);
    }
}

/*
 Public - anywhere
 Protected - within package and outer with children
 Default - within package
 Private - within class
 */
class Vehicle{

    void print(){
        throw new RuntimeException("Did not handle anything.");
    }

    public Number getWheels(){
        return 2;
    }

    public void takeOrder(Number orderNo){
        System.out.println("Order for vehicle : " + orderNo);
    }

    public void clean(Integer times, String message){
        System.out.println("Cleaning message from vehicle by times " + times);
    }

    public void pay() throws NullPointerException{
        throw new RuntimeException("Exception from vehicle");
    }

    public void deliver() throws Exception{
        throw new Exception("Checked exception from vehicle");
    }
}

class Car extends Vehicle{

     protected void print() {
        System.out.println("Printing car details");
    }

    public Integer getWheels(){
         return 4;
    }

    //Overloading
    public void takeOrder(Integer orderNo){
        System.out.println("Order for car : " + orderNo);
    }

    //Overloading
    public void clean(String message, Integer times){
        System.out.println("Cleaning from car message by times " + times);
    }

    //Unchecked exception
    public void pay() throws RuntimeException{
        throw new RuntimeException("Exception from car");
    }

    //checked exception
    public void deliver() throws IOException {
        throw new IOException("Checked exception from car");
    }

}