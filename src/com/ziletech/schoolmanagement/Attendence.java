package com.ziletech.schoolmanagement;

public class Attendence {

    private String studentName;
    private int rollNumber;
    private int seasen;

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber=rollNumber;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public void setSeasen(int seasen){
        this.seasen=seasen;

    }
    public int getSeasen(){
        return seasen;
    }

}
