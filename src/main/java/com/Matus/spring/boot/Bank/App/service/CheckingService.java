package com.Matus.spring.boot.Bank.App.service;

import org.springframework.stereotype.Service;

@Service
public interface CheckingService {
    String createDebitCardNumber();
    String createRandomPin();
}
