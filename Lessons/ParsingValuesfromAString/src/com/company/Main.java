package com.company;

public class Main {

    public static void main(String[] args) {

        //define String value = 2018.125
	    String a ="2018.125";
	    //Output : 2018.125 (STRING)
        System.out.println("str : "+a);

        //convert the String to double , it need to define new variable to save it.
        // but don't do calculate and "..." print text in here , because it may bug.
        double b = Double.parseDouble(a);


        //Output : 2018.125 (INT)
        System.out.println("parseInt : "+b);

        //plus 1 to 2018.125(STRING)
        a+=1;

        //plus 1 to 2018.125(INT)
        b+=1;

        //Output : 2018.1251
        System.out.println("A String + 1 : "+a);

        //Output : 2019.125
        System.out.println("parseInt + 1 : "+b);

    }
}
