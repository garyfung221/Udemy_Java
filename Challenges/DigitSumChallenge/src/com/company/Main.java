package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));


    }
    public static int sumDigits(int number){
        if(number>=10){
            int sum=0;
            int save=0;
            while(number>0){
                save = number%10; //125%10 = 5  //12%10 = 2 //1%1 = 1
                sum+=save; //0+5 // 5 + 2 // 5 + 2 + 1
                number = number/10; // 125/10 = 12 // 12/10 = 1 // 1/10 = 0

            }
            return sum;
        }else{
            return -1;
        }
    }

}

