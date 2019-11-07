package com.Matus.spring.boot.Bank.App.impl;

import com.Matus.spring.boot.Bank.App.service.CheckingService;

import java.util.Random;

public class CheckingServiceImpl implements CheckingService {
    @Override
    public String createDebitCardNumber() {
        Random random = new Random();
        Long randomNumber = Math.round(random.nextFloat() * Math.pow(10,12));
        return String.valueOf(randomNumber);
    }

    @Override
    public String createRandomPin() {
        Random random = new Random();
        int randomPin = random.nextInt(9000)+1000;
        return String.valueOf(randomPin);
    }
}
