package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int num1 , int num2){
        int HCF=0;
        if(num1<10||num2<10){
            return -1;
        }
        //find their common HCF , if you set i< num 2 and method(15,30) 15 after HCF it 15 do not have
        for(int i = 1 ; i < num1; i++ ){
            //%i==0 because if you == 0 it means can divide by the number so that is one of the number can divide the number
            if((num1%i==0)&&(num2%i==0)){
                HCF=i;
            }
        }
        return HCF;
    }
}
