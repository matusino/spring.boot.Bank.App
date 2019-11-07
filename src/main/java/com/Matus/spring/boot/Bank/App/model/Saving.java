package com.Matus.spring.boot.Bank.App.model;

import javax.persistence.Entity;

@Entity
public class Saving extends Account {
    private String safetyDepositBox;

    public Saving(String safetyDepositBox) {
        this.safetyDepositBox = safetyDepositBox;
    }

    public Saving(String accountNumber, Double balance, String safetyDepositBox) {
        super(accountNumber, balance);
        this.safetyDepositBox = safetyDepositBox;
    }

    public Saving() {
    }

    public String getSafetyDepositBox() {
        return safetyDepositBox;
    }

    public void setSafetyDepositBox(String safetyDepositBox) {
        this.safetyDepositBox = safetyDepositBox;
    }
}
