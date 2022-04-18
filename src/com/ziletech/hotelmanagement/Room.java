package com.ziletech.hotelmanagement;

import java.util.Date;

public class Room {

    private int roomNumber;
    private boolean isAvailable;
    private int amount;
    private Date checkIn;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public void printRoomDetails(Room room) {
        System.out.println("--------------");
        System.out.println(room.roomNumber);
        System.out.println(room.amount);
        System.out.println(room.checkIn);

        if (room.isAvailable) {
            System.out.println("AC Room");
        } else {
            System.out.println("Non AC Room");
        }

    }

}
