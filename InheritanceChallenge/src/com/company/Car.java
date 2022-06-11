package com.company;

public class Car extends Vehicle{
    public Car(int wheels, String color, String model) {
        super(wheels, color, model);
    }

    @Override
    public void handSteering() {
        super.handSteering();
    }

    @Override
    public void changingGears() {
        super.changingGears();
    }

    @Override
    public void Moving(int speed) {
        super.Moving(speed);
    }
}
