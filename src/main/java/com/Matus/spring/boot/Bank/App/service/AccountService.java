package com.Matus.spring.boot.Bank.App.service;

import com.Matus.spring.boot.Bank.App.model.Account;
import com.Matus.spring.boot.Bank.App.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    public void addAccount(Account account){
        accountRepository.save(account);
    }
    public List<Account> getAll(){
        List<Account> list = new ArrayList<>();
        accountRepository.findAll().forEach(list::add);
        return list;
    }
    public Account getAccount(Long id){
        return accountRepository.findById(id).orElse(null);
    }
    public void deleteAccount(Long id){
        accountRepository.deleteById(id);
    }
    public void updateAccount(Long id, Account account){
        accountRepository.save(account);
    }
}
