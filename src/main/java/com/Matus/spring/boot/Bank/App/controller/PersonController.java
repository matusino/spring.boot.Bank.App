package com.Matus.spring.boot.Bank.App.controller;

import com.Matus.spring.boot.Bank.App.model.Person;
import com.Matus.spring.boot.Bank.App.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/person")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping("/person/{id}")
    public Person get(@PathVariable Long id){
        return personService.getPerson(id);
    }

    @RequestMapping("/person")
    public List<Person> getAll(){
        return personService.getAll();
    }
    @DeleteMapping("/person/{id}")
    public void delete(@PathVariable Long  id){
        personService.deletePerson(id);
    }

    @PutMapping("/person/{id}")
    public void updatePerson(@PathVariable Long id, @RequestBody Person person){
        personService.updatePerson(id,person);
    }

    @GetMapping("/person/account")
    public void getAllAccountsOfPerson(){

    }
}
