package com.company;

public class Testing {
    private int x;
    public static int y;

    static{
        y = 2000;
    }

    public Testing(int x ){
        this.x = x ;
    }
    public void printXY(){
        System.out.println("X : "+x+" Y :"+y);
    }

}
