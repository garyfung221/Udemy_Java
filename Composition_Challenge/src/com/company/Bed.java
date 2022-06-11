package com.company;

public class Bed {
    private int size;
    private int person;

    public Bed(int size , int person){
        this.size = size;
        this.person = person;
    }
    //public method
    public void useBed(){
        System.out.println("Using the bed");
    }
    //private method
    private void sleep(){
        System.out.println("Sleep on the bed");
    }
}

