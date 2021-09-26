package com.hknyildz.oopj.ch10_77.bank;

public class Account {

    private final String name;
    private final String IBAN;
    private final String SecurityCode;
    private double balance;

    public Account(String name, String IBAN, String SecurityCode) {
        this.name = name;
        this.IBAN = IBAN;
        this.SecurityCode = SecurityCode;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


}
