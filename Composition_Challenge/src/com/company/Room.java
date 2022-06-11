package com.company;

public class Room {
    private Bed bed;
    private Desk desk;
    private Laptop laptop;
    private WaterBottle waterBottle;

    public Room(Bed bed, Desk desk, Laptop laptop , WaterBottle waterBottle) {
        this.bed = bed;
        this.desk = desk;
        this.laptop = laptop;
        this.waterBottle = waterBottle;
    }

    public Bed getBed() {
        return bed;
    }

    public Desk getDesk() {
        return desk;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public WaterBottle getWaterBottle() {
        return waterBottle;
    }
}
