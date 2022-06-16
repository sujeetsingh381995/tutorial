package com.ziletech.oopsconcept.teach;

public class InheritanceP {
    public static void main(String[] args){
        Bike bike = new Bike();
        bike.setDeviceName("Yamaha");
        bike.setFeature("version 3");
        bike.setPrice(85000);
        bike.setColor("wight");
        bike.setModal(2021);
        bike.print();

        Electronic pb = new PowerBank();
        pb.setDeviceName("Power Bank ");
        pb.setFeature("Letest version ");
        pb.setPrice(2000);
        pb.print();

    }
}
class Electronic{
   private String deviceName;
   private String feature;
   private int price;

   public void setDeviceName(String deviceName){
       this.deviceName= deviceName;
   }
    public String getDeviceName() {
        return deviceName;
    }
    public void setFeature(String feature){
       this.feature= feature;
    }
    public String getFeature(){
       return feature;
   }
   public void setPrice(int price){
       this.price=price;
   }
   public int getPrice(){
       return price;
   }

   protected void print(){
       System.out.println(getDeviceName());
       System.out.println(getFeature());
       System.out.println(getPrice());
   }
}

class Bike extends Electronic{
    private String color;
    private int modal;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModal() {
        return modal;
    }

    public void setModal(int modal) {
        this.modal = modal;
    }
//    public void print(){
//        System.out.println(getColor());
//        System.out.println(getModal());
//    }
}
class PowerBank extends Electronic{

}
