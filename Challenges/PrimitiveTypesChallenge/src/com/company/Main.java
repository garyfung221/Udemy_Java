package com.company;

public class Main {

    public static void main(String[] args) {

        byte NewByteValue = 10;
        short NewShortValue = 20;
        int NewIntValue = 50;
        long NewLongValue = 50000L+((NewByteValue+NewShortValue+NewIntValue)*10);



        System.out.println(NewLongValue);

        short shortTotal = (short)(1000 + 10*(NewByteValue + NewShortValue + NewIntValue));

        System.out.println(shortTotal);



    }
}
