package com.Matus.spring.boot.Bank.App.model;

import javax.persistence.Entity;

@Entity
public class Checking extends Account {

    private String cardNumber;

    public Checking() {
    }

    public Checking(String accountNumber, Double balance, String accountNumber1) {
        super(accountNumber, balance);
        this.cardNumber = accountNumber1;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
