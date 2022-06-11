package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxNumber = 0;
        int minNumber = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number:");
            boolean hasNext = scan.hasNextInt();
            if (hasNext) {
                int number = scan.nextInt();
                // assigned the first number input to min & max,To avoid the number be 0 , and it only will execute 1 time , because when you execute first will be false
                if(first){
                    first = false;
                    maxNumber = number;
                    minNumber = number;
                }

                if (number > maxNumber) {
                    maxNumber = number;
                } else if (number < maxNumber) {
                    minNumber = number;
                }

            } else {
                System.out.println("Invalid Number!");
                break;
            }

        }

            System.out.println("Maximum number :" + maxNumber);
            System.out.println("Minimum number :" + minNumber);

    }

}
