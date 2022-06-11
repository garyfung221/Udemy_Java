package com.company;

public class Bank {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    int PhoneNumber;

    public Bank() {
        this(542321,400,"GARY","gary@gmail.com",12341234);
        System.out.println("Empty constructor called");
    }

    public Bank(int accountNumber, double balance, String name, String email, int PhoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
        System.out.println("Account constructor with parameters called");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void deposit(double money) {
        this.balance += money;
        System.out.println("You're deposit " + money + " and your balance available : " + this.balance);
    }

    public void withdraw(double money) {
        double Check = this.balance - money;
        if (Check < 0) {
            System.out.println("Your balance available : " + this.balance + " is not enough to withdraw!!");
        } else {
            this.balance -= money;
            System.out.println("You're withdraw " + money + " and your balance available : " + this.balance);
        }
    }
}
