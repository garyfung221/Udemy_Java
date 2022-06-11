package com.company;

public class VipCustomer {
    private String name;
    private double CreditLimit;
    private String EmailAddress;

    public VipCustomer(){
        this("Default Name",500,"default@email.com");
    }
    public VipCustomer(String name , double CreditLimit){
        this(name , CreditLimit , "unknown@email.com");
    }
    public VipCustomer(String name , double CreditLimit , String EmailAddress){
        this.name=name;
        this.CreditLimit=CreditLimit;
        this.EmailAddress=EmailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }
}
