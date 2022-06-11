package com.company;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, 5, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Dog not chew the food");
    }


    public void walk() {
        System.out.println("Dog walk");
    }

    @Override
    public void eat(){
        System.out.println("Dog eat");
        super.walk();
    }
}
