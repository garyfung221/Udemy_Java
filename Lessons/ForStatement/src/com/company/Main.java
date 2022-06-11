package com.company;

public class Main {

    public static void main(String[] args) {


        for (int number = 1; number < 7; number += 2) {
            System.out.println(number);
        }


        double A = Math.sqrt(6);
        System.out.println(A);

        int count = 0;
        for (int i = 10; i < 50; i++) {
            //if you don't leave the check boolean it'll be default to true
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }




        public static boolean isPrime ( int n){
            //rule 1 prime number must be over 1
            if (n == 1) {
                return false;
            }

        /*
        if n = 4  ,
        4 / 2 = 2 ,
        2 is less than or equal to 2 ,
        i = 2 , n = 4,
        4%2
        i++
         */
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

