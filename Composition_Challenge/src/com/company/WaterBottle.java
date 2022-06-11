package com.company;

public class WaterBottle {
    private double bottleSize;
    private String color;
    AvailableWater availableWater;

    public WaterBottle(double bottleSize , String color ,AvailableWater availableWater){
        this.bottleSize = bottleSize;
        this.color = color;
        this.availableWater = availableWater;
    }
    public void seeBottle(){
        System.out.println("Open the bottle");
        System.out.print("The bottle was available ");
        waterNow();
    }

    private void waterNow(){
        System.out.println(availableWater.getWater()+" ml water");
    }
}
