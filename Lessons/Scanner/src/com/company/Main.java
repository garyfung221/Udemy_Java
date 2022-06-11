package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scan.hasNextInt();

        if(hasNextInt==true){
            int YearOfBirth = scan.nextInt();

            scan.nextLine();

            System.out.println("Enter your name :");
            String name = scan.nextLine();

            int age = 2021-YearOfBirth;

            if(age>=0 && age<=100){
                System.out.println("Your name is "+name+" and you are "+YearOfBirth+" years old.");
            }else{
                System.out.println("Invalid year of birth.");
            }
        }else{
            System.out.println("Unable to parse year of birth.");
        }
    }
}
