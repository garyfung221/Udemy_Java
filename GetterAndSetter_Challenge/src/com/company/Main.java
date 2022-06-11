package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank service = new Bank();

        System.out.println(service.getEmail());
        System.out.println();
	    service.withdraw(100);
        service.deposit(50);
        service.withdraw(100);
        service.deposit(51);
        service.withdraw(100);
    }
}
