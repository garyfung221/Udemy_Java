package com.company;

public class Main {

    public static void main(String[] args) {


        //define variable to save return value
        int HighScore;

        //Pass 1500 to method to calculating what position should be And assign to HighScore variable
        HighScore=calculateHighScorePosition(1500);
        //display the HighPositionScore of Gary
        //because the return result is assigned to HighScore variable so that put into display method to replacing the value
        displayHighScorePosition("Gary",HighScore);

        HighScore=calculateHighScorePosition(900);
        displayHighScorePosition("Alex",HighScore);

        HighScore=calculateHighScorePosition(400);
        displayHighScorePosition("Peter",HighScore);

        HighScore=calculateHighScorePosition(50);
        displayHighScorePosition("Anson",HighScore);

        HighScore=calculateHighScorePosition(1000);
        displayHighScorePosition("YoYo",HighScore);

    }


    //No need to return
    public static void displayHighScorePosition(String PlayerName,int HighScorePosition){
        System.out.println(PlayerName+" managed to get into position "
                +HighScorePosition + " on the high score table");
    }
    //Need return
    public static int calculateHighScorePosition(int PlayerScore){
        if(PlayerScore >= 1000){
            return 1;
        }else if(PlayerScore >= 500 && PlayerScore < 1000){
            return 2;
        }else if(PlayerScore >= 100 && PlayerScore < 500 ){
            return 3;
        }else{
            return 4;
        }
    }
}