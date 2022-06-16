package com.ziletech.onlineqns;

//public class OverridingQna {
//
//}
//class Mobile {
//    String str = "";
//    Mobile() {
//        str += "Mobile is : ";
//    }
//}
//class Airtel extends Mobile {
//    Airtel() {
//        str += "Airtel";
//    }
//}
// class Docomo extends Mobile {
//    Docomo() {
//        str += "Docomo";
//    }
//    public static void main(String args[]) {
//        Mobile d = new Docomo();
//        System.out.println(d.str);
//    }
//}
//
//
////  ==================================================================
//
//class MeritCampus
//{
//    public static void main(String [] args)
//    {
//
//    }
//}
//class Merit
//{
//    Merit(String s)
//    {
//
//    }
//
//    Merit()
//    {
//
//    }
//}
//
//class Campus extends Merit
//{
//    Campus()
//    {
//
//    }
//
//    Campus(String s)
//    {
//        super(s);
//    }
//
//    void insert()
//    {
//        //LINE M
//    }
//}
//==========================================================







class Producer
{
    void story()
    {
        System.out.println("No story");

    }
}
class Director extends Producer
{
    void story()
    {
        super.story();
        System.out.println("With story");
    }
}
class Hero extends Director
{
    void story()
    {
        super.story();
        System.out.println("Good Movie");
    }

}
public class Movie
{
    public static void main(String[] args)
    {
        Hero hero=new Hero();
        hero.story();
    }
}
