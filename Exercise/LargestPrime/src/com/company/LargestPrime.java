package com.company;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if(number <=1){
            return -1;
        }
        for(int i = 2 ; i < number ; i++){
            if(number%i==0){
                number=number/i;
                i--;
            }
        }return number;
    }
}

/*
Prime 2 rules:
1.it only can't be divided by itself
2.the value can't be even number.

 */