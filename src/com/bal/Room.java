package com.bal;

/**
 * Created by localadmin on 7/27/16.
 */
public class Room {
    private String name;
    private Floor floor;
    private int width;
    private int length;
    private int height;
    private Paint paint;

    public Room(String name, Floor floor, int width, int length, int height, Paint paint) {
        this.name = name;
        this.floor = floor;
        this.paint = paint;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int floorCost (){
        return this.width*this.length*this.floor.getCost();
    }

    public int paintCost() {
        return this.length*this.height*2*this.paint.getCost() + this.width*this.height*2*this.paint.getCost();
    }

    //region getters/setters

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //endregion
}
