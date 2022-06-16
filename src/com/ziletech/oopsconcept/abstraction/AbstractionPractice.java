package com.ziletech.oopsconcept.abstraction;

public class AbstractionPractice {
    public static void main(String[] args) {
        Electronics electronics = new Electronics() {

            public int getStorage() {
                return 128;
            }


            public int getRam() {
                return 6;
            }
        };
          electronics.setColor("Wight");
          electronics.setPrice(50000);
//          electronics.setModal("note");
          electronics.print();

    }
}


abstract class Electronics{
    private int price;
    private  String color;



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print(){
        System.out.println(getColor() + getPrice()+getStorage()+getRam());
    }

    public abstract int getStorage();
    public abstract int getRam();
}
class Samsung extends Electronics{
private String modal;

    public void print(){
        System.out.println(getModal());
    }


    public int getStorage() {
        return 128;
    }


    public int getRam() {
        return 6;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }
}
class Nokia extends Samsung{
    private String feature;

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
