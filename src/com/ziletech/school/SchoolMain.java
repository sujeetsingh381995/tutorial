package com.ziletech.school;

import java.util.ArrayList;

public class SchoolMain {

    public static void main(String[] args) {
        School school = new School();
        school.setName("DAV");

        System.out.println(school.getName());
        System.out.println(school.getStudents());

        // null && empty
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"John","Doe"));
        students.add(new Student(2,"Sujeet","Singh"));
        students.add(new Student(3,"Yukti","Laheja"));
        students.add(new Student(4,"Nagendra","Chandrakar"));
        students.add(new Student(1,"John","Palmore"));
        school.setStudents(students);

        for(Student student : school.findByFirstName("John")){
            System.out.println("Found student : " + student.getFirstName() + " : " + student.getLastName());
        }

    }

}
