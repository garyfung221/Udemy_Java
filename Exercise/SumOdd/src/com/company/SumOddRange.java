package com.company;

public class SumOddRange {
    public static boolean isOdd(int number){
        if(number<0){
            return false;
        }
        if(number%2!=0){
            return true;
        }else{
            return false;
        }
    }
    public static int sumOdd (int start , int end){
        int sum = 0;
        if(start>0 && end>0 && end >= start){
            for(int i = start ; i <= end ; i++ ){
                if(isOdd(i)==true){
                    sum +=i;
                }
            }
            return sum;
        }
        return -1;
    }
}

//1.new method called sumOdd (int start , int end)
//2.for loop to sum all numbers in that range : ( start > end if is odd sum it )
//3.using isOdd method to check the range of the number is that odd number
//4.return sum
//end >= start , start and end > 0