package com.company;

public class Vehicle {
    private int wheels;
    private String color;
    private String model;

    public Vehicle(int wheels, String color, String model) {
        this.wheels = wheels;
        this.color = color;
        this.model = model;
    }

    public void handSteering(){
        System.out.println("Car is hand Steering");
    }
    public void changingGears(){
        System.out.println("Car is changing Gears");
    }
    public void Moving(int speed){
        System.out.println("Car Moving and the speed is "+speed);
    }
}
