package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int startingNumber;
        int reverse = 0;
        int lastDigit;
        if(number<0){
            number = number * - 1;
        }
        startingNumber = number;
        while(number>0){
            lastDigit = number % 10 ;
            reverse = reverse * 10 ;
            reverse += lastDigit;
            number = number/10;
            System.out.println(reverse);
            if(startingNumber==reverse){
                return true;
            }
        }
        return false;
    }
}
/*
1.define startingNumber to save the starting number(passing from method) using to compare the final
2.reverse to save the final number using to compare
3.if(number<0) <-it mean if the number if negative number * -1 to convert to positive and assigned to number to replaced the old value.
4.startingNumber = number , to assigned to convert process result to startingNumber , if don't do that it will be still negative number



While Statement
1.Check the while condition is that >0 , if yes execute
2.number(707) % 10 = 7 assigned to lastDigit , so now lastDigit is 7
3.reverse(0) * 10 = 0
4.lastDigit (7) save into reverse = 0+7 , so reverse = 7
5.number = number(707)/10 = 70 , it will be assigned to number/10 to number and placed it , so that now number = 70
6.Check the while condition is that > 0 , if yes execute
7.number is 70 now , number(70)%10 = 0 and assigned to lastDigit and replaced the old value , so lastDigit is 0
8.reverse(7)*10 = 70 and assigned to reverse , replaced the old value , so now reverse = 70
9.reverse(70) + lastDigit(0) , 70 + 0 = 70 , so now reverse is 70
10.number(70)/10 = 7 , and assigned to number to replace the old value , so that now number is 7
11.check while condition is that > 0 , if yes execute
12.number(7)%10 = 7 , and assigned to lastDigit to replaced the old value , so that now lastDigit is 7
13.reverse(70)*10 = 700 and assigned to reverse , replaced the old value , so that reverse is 700 now
14.reverse(700) + lastDigit(7) , so reverse is 707 now
15.number(7)/10 = 0 , and assigned to number to replaced the old value , so that number is 0 now .
16.check while condition is that number > 0 , it false , so that exit the while loop
17.check is that startingNumber(707) is that equal to reverse(707) , if yes return true , if not return false.

 */