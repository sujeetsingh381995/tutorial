package com.ziletech.oopsconcept;

public class InheritancePravtice {

    public static void main(String[] args) {
        ElectronicDevices devices = new Speaker();
        devices.setName("switch ");
        devices.setModal("TI676");
        devices.setPrice(25000);
        devices.printInfo();

//        Speaker speaker = new Speaker();
//        speaker.setAmprCapacity("30W");
//        speaker.printInfo();
//
//        Speaker speaker = new Speaker();
//        speaker.setAmprCapacity("30W");
//        speaker.printSpeaker();
////
        Switch s = new Switch();
        s.setSoundCapacity("100Hz");
        s.setColor("White");
        s.printSwitch();

    }

}

class ElectronicDevices {
    String name;
    String modal;
    int price;

    public void printInfo() {
        System.out.println("Compony "+ getName());
        System.out.println("Modal   "+ getModal());
        System.out.println("Price   "+ getPrice());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Speaker extends ElectronicDevices {
    String amprCapacity;

//    public void printSpeaker() {
//        System.out.println(getAmprCapacity());


//    } public void printInfo() {
//        System.out.println(getAmprCapacity());
//    }

    public String getAmprCapacity() {
        return amprCapacity;
    }

    public void setAmprCapacity(String amprCapacity) {
        this.amprCapacity = amprCapacity;
    }
}

class Switch extends Speaker {

  String soundCapacity;
  String color;

  public void  printSwitch(){
      System.out.println(getSoundCapacity());
      System.out.println(getColor());
  }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSoundCapacity() {
        return soundCapacity;
    }

    public void setSoundCapacity(String soundCapacity) {
        this.soundCapacity = soundCapacity;
    }
}
