package com.company;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
            case 3:case 4:case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println(switchValue+5);
                break;
            default:
            System.out.println("Was not 1 or 2");
            break;
        }
    }
}
