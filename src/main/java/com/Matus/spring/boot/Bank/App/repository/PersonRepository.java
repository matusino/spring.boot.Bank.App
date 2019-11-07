package com.Matus.spring.boot.Bank.App.repository;

import com.Matus.spring.boot.Bank.App.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
