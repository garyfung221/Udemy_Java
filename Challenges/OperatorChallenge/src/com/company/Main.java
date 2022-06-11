package com.company;

public class Main {


    //Questions :
    //
    // 40. Operator Precedence and Operator Challenge

    public static void main(String[] args) {

        double FirstDouble = 20.00d;
        double SecondDouble = 80.00d;
        double Step3_calculations = ((FirstDouble+SecondDouble)*100)%40.00;
        System.out.println(Step3_calculations);
        boolean Step3Result;

        if(Step3_calculations==0){
            Step3Result=true;
        }else{
            Step3Result=false;
        }

        System.out.println(Step3Result);
        if(Step3Result!=true){
            System.out.println("Got some remainder");
        }


    }
}
