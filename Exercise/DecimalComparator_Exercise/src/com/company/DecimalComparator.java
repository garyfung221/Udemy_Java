package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double A,double B) {
        int convert = (int)(A*1000);
        int convert2 = (int)(B*1000);
        System.out.println(convert);
        System.out.println(convert2);

        if(convert-convert2==0){
               return true;
           }
           return false;
        }
}
