package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int order = 1 ;




       while(counter<10){

           System.out.println("Please input number" + "#" + order + ":");
           boolean hasNext = scan.hasNextInt();
           if(hasNext) {
               order++;
               counter++;
               if(counter<=10) {
                   int GetNumber = scan.nextInt();
                   sum += GetNumber;

               }
               if(counter==10){
                   System.out.println("The sum is :"+sum);
                   break;
               }

           }else{
               System.out.println("Invalid Number");
           }
           scan.nextLine(); //handle end of line (enter key)

       }

        scan.close();
    }

}








