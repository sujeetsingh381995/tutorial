package com.ziletech.schoolmanagement;

public class SchoolDetails {
    private String schoolName;
    private String address;
    private int contactNumber;
    private String email;

    public void setSchoolName(String schoolName){
        this.schoolName=schoolName;
    }
    public String getSchoolName(){
        return schoolName;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
    public void setContactNumber(int number){
        this.contactNumber=contactNumber;

    }
    public int getContactNumber(){
        return contactNumber;
    }
    public void setEmail(String email){
        this.email= email;
    }
    public String getEmail(){
        return email;
    }
}
