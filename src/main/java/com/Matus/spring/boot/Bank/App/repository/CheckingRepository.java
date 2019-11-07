package com.Matus.spring.boot.Bank.App.repository;

import com.Matus.spring.boot.Bank.App.model.Checking;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CheckingRepository extends CrudRepository<Checking, Long> {
    List<Checking> findByPersonId(Long id);

}
