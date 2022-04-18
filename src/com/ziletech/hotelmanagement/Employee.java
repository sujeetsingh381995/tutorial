package com.ziletech.hotelmanagement;

import java.util.Date;

public class Employee {

    private String name;
    private String address;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void employeeDetails(Employee employee){
        System.out.println("--------------");
        System.out.println(employee.getName());
        System.out.println(employee.getAddress());
        System.out.println(employee.getAge());

        Employee[] employees = new Employee[4];

    }

}
