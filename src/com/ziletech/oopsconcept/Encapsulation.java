package com.ziletech.oopsconcept;


public class Encapsulation {
    public static void main(String[] args){
        Electronic<java.io.Serializable> electronic = new Electronic<>();
        electronic.setDeviceName("mobile");
        electronic.setFeature("Letest version");
        electronic.setPrice("");
        electronic.print();

    }
}
class Electronic <P>{
    private String deviceName;
    P price;
    private P feature;

    public void setDeviceName(String deviceName){
        this.deviceName= deviceName;
    }
    public String getDeviceName(){
        return deviceName;
    }

    public void setPrice(P price){
        this.price=price;
    }
    public P getPrice(){
        return price;

    }

    public void setFeature(P feature){
        this.feature=feature;
    }
    public P getFeature(){
        return feature;
    }

    public void print(){
        System.out.println(getDeviceName());
        System.out.println(getFeature());
        System.out.println(getPrice());

    }

}