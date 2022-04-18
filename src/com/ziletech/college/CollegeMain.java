package com.ziletech.college;

import java.util.Date;

public class CollegeMain {


    public static void main(String[] args) {

//        collegeinfo ----------->

        College college = new College();
        college.setOpeningDate(new Date());
        college.setCollegeName(" DKS college ");
        college.setAddress(" kabir Nagar Raipur");

        int[] numbers = new int[3];
        numbers[0] = 456;
        numbers[1] = -986;
        numbers[2] = 886;

        college.setContactNumbers(numbers);

//        collegeInfo.getContactNumbers()[0] = 456;
//        collegeInfo.getContactNumbers()[1] = 986;
//        collegeInfo.getContactNumbers()[2] = 886;

        System.out.println(college.getCollegeName());
        System.out.println(college.getAddress());

        for (int i = 0; i < college.getContactNumbers().length; i++) {
            System.out.println("Contact Number " + college.getContactNumbers()[i]);
        }

//       Course----------->

        Course course = new Course();
        course.name = " BCA ";
        course.branche = "IT";
        course.duration = 3;
        course.fees = 25000;

        Course course1 = new Course();
        course1.name = "BE";
        course1.branche = "civil";
        course1.duration = 4;
        course1.fees = 80000;

        Course course2 = new Course();
        course2.name = "BSC";
        course2.branche = "science";
        course2.duration = 3;
        course2.fees = 8000;

        college.courses = new Course[3];
        college.courses[0] = course;
        college.courses[1] = course1;
        college.courses[2] = course2;
        System.out.println("--------Course");
        for (int i = 0; i < college.courses.length; i++) {
            college.courses[i].printCoures(college.courses[i]);

        }

        //        Student ----------->

        Student student = new Student();
        student.name = " Singh";
        student.year = "  1st";
        student.season = 2;
        student.rollNumber = 12;

        Student student1 = new Student();
        student1.name = " Kumar";
        student1.year = "  2st";
        student1.season = 1;
        student1.rollNumber = 41;

        college.students = new Student[2];
        college.students[0] = student;
        college.students[1] = student1;
        System.out.println("--------Course");

        for (int i = 0; i < college.students.length; i++) {
            college.students[i].print(college.students[i]);
        }

    }

}
