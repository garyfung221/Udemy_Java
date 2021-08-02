package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(getDurationString(61,00));
        System.out.println(getDurationString(3945));


    }

    public static String getDurationString(double minutes, double seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = 0;
            if (minutes >= 60) {
                hours=(int)minutes/60;
            }if (seconds >= 60) {
                minutes=seconds/60;
            }
            return hours + "h " + (int)minutes%60 + "m " + (int)seconds%60 + "s ";
        }
        return "Invalid value";
    }
    public static String getDurationString(double seconds){

        if(seconds>=0){
            int minutes =0;
            if(seconds>=60){
                minutes=(int)seconds/60;
            }
            return getDurationString(minutes,(int)seconds%60);

        }else{
            return "Invalid value";
        }
    }
}
