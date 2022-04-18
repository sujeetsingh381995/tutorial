package com.ziletech.hotelmanagement;

public class HotalMain {

    public static void main(String[] args) {

        Hotel hotal = new Hotel();
        hotal.setName(" Maharaja ");
        hotal.setAddress("Bengaluru");
        hotal.setMobile(2254165);
        hotal.setEmail("grandhotal@gmail.com");
        hotal.printDetails(hotal);

        Hotel hotalSec = new Hotel();
        hotalSec.setName("ashoka");
        hotalSec.setAddress("raipur");
        hotalSec.setMobile(65465656);
        hotalSec.setEmail("ash@gmail.com");
        hotalSec.printDetails(hotalSec);

        Hotel hotalThird = new Hotel();
        hotalThird.setName("sukhsagar");
        hotalThird.setAddress("raipur");
        hotalThird.setMobile(5546464);
        hotalThird.setEmail("s@gmail.com");
        hotalThird.printDetails(hotalThird);

        Room room = new Room();
        room.setRoomNumber(1);
        room.setAvailable(true);
//        room.checkIn = new Date();
        room.setAmount(1000);
        room.printRoomDetails(room);

        Employee employee = new Employee();
        employee.setName( "sp");
        employee.setAddress("bsp");
        employee.setAge(23);
        employee.employeeDetails(employee);

        Restaurant restaurant = new Restaurant();
        restaurant.setRestaurantName("Piccadily");
        restaurant.setMenu("Biryani");
        restaurant.setCategory(false);
        restaurant.restaurantDetails(restaurant);
    }

}
