package com.ziletech.oopsconcept;

public class Inheritance {
    public static void main(String[] args) {
        Mobile tv = new Mobile();
        tv.setType("Electronics");
        tv.setModal("Panasonic");
        tv.setColor("Black");
        tv.setPrice(50000);
        tv.setSize("32 Inch");
        tv.printTv();


        Ac ac = new Ac();
        ac.setType("Electronics");
        ac.setModal("Samsung");
        ac.setColor("Blue");
        ac.setPrice(125000);
        ac.setCapacity(21.2);
        ac.printAc();


        Pc pc = new Pc();
        pc.setType("Electronics");
        pc.setModal("Dell");
        pc.setColor("Red");
        pc.setPrice(235410);
        pc.setConfiguration("Intel Core i5");
        pc.setSize("22 Inch");
        pc.printPc();

        Mobile mobile = new Mobile();



    }
}

class Electronics {
    private String type;
    private String color;
    private int price;
    private String modal;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }
}

class Tv extends Electronics {
    private String size;

    public void printTv(){
        System.out.println(" ---- Tv");
        System.out.println(" Type  : " + getType());
        System.out.println(" Model : " + getModal());
        System.out.println(" Color : " + getColor());
        System.out.println(" Size  : " + getSize());
        System.out.println(" Price : " + getPrice());

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

class Ac extends Electronics {
    private double capacity;

    public void printAc(){
        System.out.println("-------Ac");
        System.out.println(" Type     :   " + getType());
        System.out.println(" Model    : " + getModal());
        System.out.println(" Color    : " + getColor());
        System.out.println(" Price    : " + getPrice());
        System.out.println(" Capacity :"+ getCapacity());

    }


    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}

class Pc extends Tv {
    private String configuration;

    public void printPc(){
        System.out.println("-------Pc   ");
        System.out.println(" Type     : " + getType());
        System.out.println(" Model    : " + getModal());
        System.out.println(" Color    : " + getColor());
        System.out.println(" Price    : " + getPrice());
        System.out.println(" Capacity : " + getConfiguration());
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }


}
class Mobile extends Pc {
    private int storage;

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void printMobile(){
        System.out.println(getModal());
    }

}
