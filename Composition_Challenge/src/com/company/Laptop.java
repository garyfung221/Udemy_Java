package com.company;

public class Laptop {
    private String color;
    private String brand;

    public Laptop(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    private void putOnDesk(){
        System.out.println("Laptop was put on desk");
    }

    //public method
    public void turnOn (){
            putOnDesk();
            System.out.println("Turn on the Laptop");

    }

    //private method
    private void runProgram(){
        System.out.println("execute the program");
    }
}
