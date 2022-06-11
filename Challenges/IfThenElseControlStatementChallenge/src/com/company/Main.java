package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = score + ( levelCompleted * bonus );
            System.out.println("Your final score was " + finalScore);
        }

        boolean GameOver = true;
        int Score = 10000;
        int LeveCompleted = 8;
        int Bonus = 200;

        if(GameOver){
            int FinalScore = Score + ( LeveCompleted * Bonus );
            System.out.println("Your new final score was " + FinalScore);
        }

    }
}
