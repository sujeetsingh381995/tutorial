package com.ziletech.building;

public class Room {
    private int number;
    private String type;
    private String color;

    public Room(int number, String type, String color) {
        this.number = number;
        this.type = type;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

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
}
