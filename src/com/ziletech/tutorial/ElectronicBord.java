package com.ziletech.tutorial;

public class ElectronicBord{

    public static void main (String[] args){

        int[] sum = new int[100];

        for(int i=0; i<100;i++) {
            System.out.println(sum[i]);
        }
        Bord bordFirst = new Bord();

        bordFirst.bordName = "samsung";
        bordFirst.size = 6.1;
        bordFirst.load = "6 A";

        Bord bordSecond = new Bord();
        bordSecond.bordName = "conic";
        bordSecond.size = 6.5;
        bordSecond.load = "12 A";

        Bord bordthird = new Bord();
        bordthird.bordName = "sony";
        bordthird.size = 5.5;
        bordthird.load = "24 A";

        Bord[] bords = new Bord[3];
        bords[0] = bordFirst;
        bords[1] = bordSecond;
        bords[2] = bordthird;

        for(int i=0; i<3; i++){
            System.out.println("----------");
            System.out.println(bords[i].bordName);
            System.out.println(bords[i].size);
            System.out.println(bords[i].load);

        }




    }

}
