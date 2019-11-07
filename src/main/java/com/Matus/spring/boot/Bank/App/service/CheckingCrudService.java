package com.Matus.spring.boot.Bank.App.service;

import com.Matus.spring.boot.Bank.App.model.Checking;
import com.Matus.spring.boot.Bank.App.repository.CheckingRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CheckingCrudService{

    private final CheckingRepository checkingRepository;


    public CheckingCrudService(CheckingRepository checkingRepository) {
        this.checkingRepository = checkingRepository;
    }

    public List<Checking> getAll(Long id){
        List<Checking> list = new ArrayList<>();
        checkingRepository.findByPersonId(id).forEach(list::add);
        return list;
    }

    public Checking get(Long id){
        return checkingRepository.findById(id).orElse(null);
    }

    public void addCheckingAccount(Checking checking){
        checkingRepository.save(checking);
    }

    public void updateChecking(Long id, Checking checking){
        checkingRepository.save(checking);
    }

    public void deleteCheckingAcc(Long id){
        checkingRepository.deleteById(id);
    }
}
