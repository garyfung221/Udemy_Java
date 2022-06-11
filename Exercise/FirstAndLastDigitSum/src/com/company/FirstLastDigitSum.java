package com.company;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int tmp;
        int sum=0;
        int save=number;

            while(number>=10){
                number = number/10;
                if(number<10){
                    sum+=number;
                    break;
                }
            }
            tmp = save%10;
            sum +=tmp;
             if(save==sum){
                 sum+=+sum;
             }
        return sum;
    }
}
