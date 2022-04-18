package com.ziletech.oopsconcept;



public class Practice{
    public static void main(String[] args) {
        Pp p =new Pp();
        p.m1();
        C v = new  C ();
        v.m1();
        v.m2();
    }
}




class Pp {
    public void m1(){
        System.out.println("parent");
    }
}
 class C  extends Pp {
    public void m2(){
        System.out.println("child");
    }
}