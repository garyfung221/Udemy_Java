package com.company;

public class Desk {
    private String color;
    private double width;
    private double length;
    private int isDesk = 0;

    public Desk(String color , double width , double length){
        this.color = color;
        this.width = width;
        this.length = length;
        isDesk=1;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public int getIsDesk(){
        return isDesk;
    }
}
