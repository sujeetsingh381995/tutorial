package com.ziletech.school;

import java.util.ArrayList;

public class School {

    private String name;
    private ArrayList<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> findByFirstName(String firstName) {
        ArrayList<Student> foundStudents = new ArrayList<>();
        for (Student student : students) {
//            if(student.getFirstName().equals(firstName)){
            if (student.isMyName(firstName)) {
                foundStudents.add(student);
            }
        }
        return foundStudents;
    }

}
