package com.bal;

import java.util.ArrayList;

/**
 * Created by localadmin on 7/27/16.
 */
public class House {
    private String name;
    private ArrayList <Room> rooms;


    public House(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom (Room room){
        long c = this.rooms.stream().filter(r2 -> r2.getName().equals(room.getName())).count();
        if(c == 0) {
            this.rooms.add(room);
        }
    }

    public int floorCost () {
        return this.rooms.stream().map(v -> v.floorCost()).reduce(0, (a, v) -> a + v);
    }

    public int paintCost () {
        return this.rooms.stream().map(v -> v.paintCost()).reduce(0, (a, v) -> a + v);
    }

    public int totalCost () {
        return floorCost() + paintCost();
    }

    //region getters/setters
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion
}
