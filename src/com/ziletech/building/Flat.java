package com.ziletech.building;

import java.util.ArrayList;

public class Flat {
    private String type;
    private ArrayList<Room> rooms;

    public Flat(String type,ArrayList<Room>rooms) {
        this.type =type;
        this.rooms=rooms;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}
