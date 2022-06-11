package com.company;

public class Main {

    public static void main(String[] args) {

        int topScore = 80;

        int SecondTopScore = 81;

/*
condition is requred two conditions :

condition 1 :
topScore grater than 90

condition 2 :
SecondTopScore less than or equal to 90

*/
        if((topScore > 90) || (SecondTopScore <= 90) ){
            System.out.println("Either or both of the conditions are true");
        }

/*
condition 1 :
Require topScore grater than 90
topScore = 80
so that's false

condition 2:
Require SecondTopScore Less than or equal to 90
SecondTopScore = 81
so that's true

So that will print it out !

because one of them is true.
*/

    }
}
