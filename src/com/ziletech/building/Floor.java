package com.ziletech.building;

import java.util.ArrayList;

public class Floor {
    private int number;
    private ArrayList<Flat> flats;

    public Floor(int number,ArrayList<Flat>flats) {
        this.number=number;
        this.flats=flats;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Flat> getFlats() {
        return flats;
    }

    public void setFlats(ArrayList<Flat> flats) {
        this.flats = flats;
    }
}
