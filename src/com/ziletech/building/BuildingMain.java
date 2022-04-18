package com.ziletech.building;

import java.util.ArrayList;

public   class BuildingMain {

    public static void main(String[] args) {

        Building2 building = new Building2();

        building.setName("Ambetkar #40");
        building.setAddress("Doddanekkundi");
        building.setSwimingPool("200x600");
        building.setNumber(885642644);

        ArrayList<Room> rooms = new ArrayList<>();
        ArrayList<Flat> flats = new ArrayList<>();
        ArrayList<Floor> floors = new ArrayList<>();

        rooms.add(new Room(1, "BedRoom", "Blue"));
        rooms.add(new Room(2, "kitchen", "wight"));

        flats.add(new Flat("1BHK", rooms));
        ArrayList<Room> firstRooms = new ArrayList<>();
        firstRooms.add(new Room(3, "Hall", "yellow"));
        flats.add(new Flat("2BHK", firstRooms));
        floors.add(new Floor(1, flats));

        building.setFlors(floors);

        System.out.println("Name    : " + building.getName());
        System.out.println("Swimming Pool    : " + building.getSwimmingPool());
        System.out.println("Address : " + building.getAddress());
        System.out.println("Contact : " + building.getNumber());
        System.out.println();

        for (Floor floor : building.getFlors()) {
            System.out.println("  Floor : " + floor.getNumber());
            for (Flat flat : floor.getFlats()) {
                System.out.println();
                System.out.println("    Flat Type  : " + flat.getType());
                for (Room room : flat.getRooms()) {
                    System.out.println();
                    System.out.println("         Room Number  : " + room.getNumber());
                    System.out.println("         Room Type    : " + room.getType());
                    System.out.println("         Room Color   : " + room.getColor());
                }
            }
        }
    }

}



