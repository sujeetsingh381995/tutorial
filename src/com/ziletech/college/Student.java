package com.ziletech.college;

public class Student {
    String name;
    String year;
    int season;
    int rollNumber;


    public void print(Student student){
        System.out.println( "Name"+student.name);
        System.out.println("Year"+student.year);
        System.out.println("Season "+student.season);
        System.out.println("Roll Number "+student.rollNumber);
        System.out.println("-------------");

    }



}
