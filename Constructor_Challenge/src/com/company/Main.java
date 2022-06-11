package com.company;

public class Main {

    public static void main(String[] args) {

        //default constructor       NAME:Default Name  CD:500   EM:default@email.com
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());


        //second constructor        NAME:Default Name  CD:500   EM:unknown@email.com

        //set the NAME: Default Name > GARY      CD: 500 > 1000
        VipCustomer person2 = new VipCustomer("GARY",1000);
        //Now : NAME:GARY       CD:1000     EM:default@email.com


        System.out.println(person2.getName());

        //third constructor         NAME:Default Name  CD:500   EM:default@email.com
        VipCustomer person3 = new VipCustomer("ALEX",2000,"alex@gmail.com");
        //set the NAME: Default Name > ALEX      CD: 500 > 2000     EM: default@email.com > alex@gmail.com

        System.out.println(person3.getName());
    }
}
