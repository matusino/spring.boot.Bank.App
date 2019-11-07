package com.Matus.spring.boot.Bank.App.service;

import com.Matus.spring.boot.Bank.App.model.Person;
import com.Matus.spring.boot.Bank.App.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void addPerson(Person person){
        personRepository.save(person);
    }

    public Person getPerson(Long id){
       return personRepository.findById(id).orElse(null);
    }

    public List<Person> getAll(){
        List<Person> list = new ArrayList<>();
        personRepository.findAll().forEach(list::add);
        return list;
    }

    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }

    public void updatePerson(Long id, Person person){
        personRepository.save(person);
    }
}
