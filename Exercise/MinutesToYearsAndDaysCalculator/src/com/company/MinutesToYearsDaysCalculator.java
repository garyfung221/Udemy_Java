package com.company;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes){

        if(minutes < 0 ){
            System.out.println("Invalid Value");
        }else if(minutes == 0){
            System.out.println(minutes+" min = 0 y and 0 d");
        }
        else{
            long hours = minutes/60;
            long days = hours/24;
            long years = days/365;
            long remainder = days%365;

            System.out.println(minutes+" min = "+years+" y and "+remainder+" d");

        }

    }
}
