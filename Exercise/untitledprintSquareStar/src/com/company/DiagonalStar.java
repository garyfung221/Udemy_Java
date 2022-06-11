package com.company;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if(number <5){
            System.out.println("Invalid Value");
            return;
        }
        for(int i = 0 ; i <number ; i++){
            for(int j = 0 ; j <number ; j++){
                //because 0 1 2 3 4  , and the number is 5 so that need to - 1
                if(j == 0 || j == number - 1 || i == 0 || i == number -1 || i == j || (i+j)==number-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




