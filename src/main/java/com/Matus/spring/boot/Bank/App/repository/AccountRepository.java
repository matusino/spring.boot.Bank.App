package com.Matus.spring.boot.Bank.App.repository;

import com.Matus.spring.boot.Bank.App.model.Account;
import org.springframework.data.repository.CrudRepository;


public interface AccountRepository extends CrudRepository<Account, Long> {
}
