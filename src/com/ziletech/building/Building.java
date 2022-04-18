package com.ziletech.building;

import java.util.ArrayList;

public class Building {
    private String name;
    private String address;
    private int number;
    private ArrayList<Floor> flors;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Floor> getFlors() {
        return flors;
    }

    public void setFlors(ArrayList<Floor> flors) {
        this.flors = flors;
    }
}

class Building2 extends Building{

    private String swimingPool;

    public String getSwimmingPool() {
        return swimingPool;
    }

    public void setSwimingPool(String swimingPool) {
        this.swimingPool = swimingPool;
    }
}
