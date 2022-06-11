package com.company;


public class Main {

    public static void main(String[] args) {
        String month = "June";
        switch(month.toUpperCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
