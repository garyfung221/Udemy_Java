package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double avg = 0;

        while (true) {
            boolean hasNext = scan.hasNextInt();
            if (hasNext) {
                int number = scan.nextInt();
                sum += number;
                count++;
            } else {
                avg = Math.round((double) sum / count);
                System.out.println("SUM = " + sum + " AVG = " + (long) avg);
                break;
            }
        }
    }
}
