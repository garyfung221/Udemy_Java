package com.company;

public class Main {

    public static void main(String[] args) {


        calcFeetAndInchesToCentimeters(6,0);




    }
    public static double calcFeetAndInchesToCentimeters(double feet , double inches){
        if(feet >= 0 &&(inches >= 0 && inches <= 12)){
            double test=((feet*12)+inches)*2.54;
            System.out.println(feet + " feet " + inches + " inches = "+test);
            return ((feet*12)+inches)*2.54;

        }
        System.out.println("Invalid feet or inches parameter!");
        return -1;
    }

}
