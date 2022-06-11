package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Gary",500);
        System.out.println(newScore);
        calculateScore(100);
        calculateScore();
        System.out.println(5);


    }
    public static int calculateScore(String playName,int score){
        System.out.println("Player "+playName+" scored "+score);
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " +score +" points");
        calculateScore("GARY",55);
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name , no player score ");
        return 0;
    }


}
