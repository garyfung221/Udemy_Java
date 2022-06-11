package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                count++;
                System.out.println(i);
                if (count == 5) {
                    break;

                }
            }
        }
        System.out.println("The sum is : " + sum);
    }
}

//1.create a for statement using a range of numbers from 1 to 1000
//2.Sum all the numbers that can be divided with both 3 and also with 5
//3.print out the number if the number can be divided with both 3 and also with 5
//4.break out if you find 5 numbers that met the above conditions
//5.print sum