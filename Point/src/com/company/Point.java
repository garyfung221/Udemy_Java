package com.company;

public class Point {

    private int x;
    private int y;

    public Point(){

    }
    public Point (int x , int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //* Method named distance without any parameters,
    // it needs to return the distance
    // between this Point and Point 0,0 as double.

    //if we don't create the two parameter method for the return , this method will be error

    public double distance(){
        return distance(0,0);
    }

    //* Method named distance with two parameters x, y both of type int,
    // it needs to return the distance
    // between this Point and Point x,y as double.

    //this.x = 6  this.y = 5   x = 0    y =0

    public double distance(int x , int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }



    //* Method named distance with parameter another of type Point,
    // it needs to return the distance
    // between this Point and another Point as double.


    //the xy 3,1 is assigned to name:second object  , and object  passing the Point p
    public double distance(Point p){
        return Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y));
        //p.x = 3  p.y = 1    this.x = 6   this.y = 5
    }
}