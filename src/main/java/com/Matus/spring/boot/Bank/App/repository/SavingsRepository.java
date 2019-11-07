package com.Matus.spring.boot.Bank.App.repository;

import com.Matus.spring.boot.Bank.App.model.Saving;
import org.springframework.data.repository.CrudRepository;

public interface SavingsRepository extends CrudRepository<Saving, Long> {

}
