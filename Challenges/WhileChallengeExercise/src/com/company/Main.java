package com.company;

public class Main {

    public static void main(String[] args) {
       int number = 0;
       while(number < 15 ){
           number++;
           if(number <=5 ){
               System.out.println("Skipping number "+number);
               continue;
           }
           System.out.println("number = "+number);
           if(number >= 10){
               System.out.println("Breaking at "+number);
               break;
           }
       }
    }

    /*Output :
    Skipping number 1
    Skipping number 2
    Skipping number 3
    Skipping number 4
    Skipping number 5
    number 6
    number 7
    number 8
    number 9
    Breaking at 10



     */
    public static boolean isEvenNumber(int number) {
        int check = number % 2;
            if(check==0){
                return true;
            }else{
                return false;
            }
    }
}
