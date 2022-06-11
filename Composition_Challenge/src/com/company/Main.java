package com.company;

public class Main {

    public static void main(String[] args) {

        Bed b = new Bed(200,1);
        Desk d = new Desk("white",100,100);
        Laptop l = new Laptop("black","HP");
        WaterBottle wb = new WaterBottle(2000,"blue",new AvailableWater(400));



	    Room r = new Room(b,d,l,wb);

        //Asking a question
        System.out.println("Is that the laptop put on the desk ?");

        //calling the Room > laptop > turnOn method
        r.getLaptop().turnOn();

        //The space line
        System.out.println();


        //Asking a question
        System.out.println("How many water available on this water bottle ?");

        //calling the Room > WaterBottle > seeBottle method
        r.getWaterBottle().seeBottle();
    }
}
