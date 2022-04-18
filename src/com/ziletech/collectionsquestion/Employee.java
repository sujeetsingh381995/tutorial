package com.ziletech.collectionsquestion;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String department;


    public void setId(int employeeId) {
        this.id = employeeId;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }


}
