package com.ziletech.classes;

public class ForLoopArray {

    public static void main(String[] args) {

        int[] bags = new int[7];
        String[] days =new String[7];
        bags[0] = 9;
        bags[1] = 25;
        bags[2] = 12;
        bags[3] = 3;
        bags[4] = 33;
        bags[5] = 5;
        bags[6] = 45;

        days[0]= "sunday";
        days[1]= "monday";
        days[2]= "Sunday";
        days[3]= "Sunday";
        days[4]= "Sunday";
        days[5]= "Sunday";
        days[6]= "Sunday";


        int total = 0;
        for (int i = 0; i < bags.length; i++) {
            total = total + bags[i];
        }
        System.out.println(total);

        int lessden = 0;
        int equals = 0;
        int gretarden = 0;

        for (int i = 0; i < bags.length; i++) { //10

            if (bags[i] < 10) {         //true   //false   //false
                lessden = lessden + bags[i];
            }else if (bags[i] == 10) {  //x      //false   //true
                equals = equals + bags[i];
            }else if (bags[i] > 10) {   //x      //true    //x
                gretarden = gretarden + bags[i];

            }

        }
        System.out.println("lessden "+ lessden);
        System.out.println("Equals " + equals);
        System.out.println("Gretarden " + gretarden);

        int weekendCound=0;
        int weekDayCound=0;
        for (int i=0; i<bags.length;i++){
           if (days[i]=="sunday" || days[i]=="satarday"){
               weekendCound=weekendCound+bags[i];
           }else {
               weekDayCound =weekDayCound+bags[i];
           }
        }
        System.out.println(weekDayCound);
        System.out.println(weekendCound);

    }
}
