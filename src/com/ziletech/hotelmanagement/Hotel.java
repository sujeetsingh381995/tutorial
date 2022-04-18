package com.ziletech.hotelmanagement;

public class Hotel {
    private String name;
    private String address;
    private int mobile;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getMobile() {
        return mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    public void printDetails(Hotel hotal) {
        System.out.println("..................");
        System.out.println(hotal.getName());
        System.out.println(hotal.getAddress());
        System.out.println(hotal.getMobile());
        System.out.println(hotal.getEmail());

    }

}
