package com.ziletech.college;

public class Course {
   String name;
   String branche;
   int duration;
   int fees;

   public void printCoures(Course course){

      System.out.println("Name " + course.name);
      System.out.println("Branche " + course.branche);
      System.out.println("Duration "+ course.duration);
      System.out.println("Fees " + course.fees);
      System.out.println("-------------");


   }

}
