package com.company;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1 , int num2 , int num3){
        if((num1<10||num1>1000)||(num2<10||num2>1000)||(num3<10||num3>1000)){
            return false;
        }


        int count2 = 0;
        int Num2LastDigit = 0;
        int Num2FirstDigit = 0;

        int count1 = 0;
        int Num1LastDigit = 0;
        int Num1FirstDigit = 0;


        int count3 = 0;
        int Num3LastDigit = 0;
        int Num3FirstDigit = 0;


        while (count3==0){
            Num3LastDigit=num3%10; // 71%10 = 1
            Num3FirstDigit=num3/10; //71/10 = 7
            count3++;
        }
        while (count2==0){
            Num2LastDigit=num2%10; // 22%10 = 2
            Num2FirstDigit=num2/10; // 22/10 = 2
            count2++;
        }
        while (count1==0){
            Num1LastDigit=num1%10; // 44%10 = 1
            Num1FirstDigit=num1/10; // 44/10 = 4
            count1++;
        }

        if((Num1LastDigit==Num3LastDigit)||(Num2LastDigit==Num3LastDigit)){
            return true;
        }

        return false;
    }
    //if num 1 or num 2 has 1 digit number is one of the num3 = return ture
    public static boolean isValid(int number){
        if(number>=10&&number<=1000){
            return true;
        }
        return false;
    }
}
