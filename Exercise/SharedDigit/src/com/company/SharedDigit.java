package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1 , int num2) {
            if((num1<=10||num1>99)||(num2<=10||num2>99)){
                return false;
            }
            int Num1Digit=0;
            int Num2Digit=0;
            int count1=0;
            int count2=0;
            while(count1==0){
                Num1Digit=num1%10; //2  //last digit
                num1=num1/10; // 12/10 = 1  //first digit
                count1++;
            }
            while(count2==0){
                Num2Digit=num2%10; //3  //last digit
                num2=num2/10; //2 //first digit
                count2++;
            }

        if((Num1Digit==num2)||(Num1Digit==Num2Digit)||(Num2Digit==num1)||(Num2Digit==Num1Digit)||(num1==num2)){
            return true;
        }
         return false;
    }


}
