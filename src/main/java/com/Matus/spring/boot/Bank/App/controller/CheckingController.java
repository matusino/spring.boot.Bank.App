package com.Matus.spring.boot.Bank.App.controller;

import com.Matus.spring.boot.Bank.App.model.Checking;
import com.Matus.spring.boot.Bank.App.model.Person;
import com.Matus.spring.boot.Bank.App.repository.CheckingRepository;
import com.Matus.spring.boot.Bank.App.service.CheckingCrudService;
import com.Matus.spring.boot.Bank.App.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CheckingController {

    private final CheckingCrudService checkingCrudService;
    private final PersonService personService;
    private final CheckingRepository checkingRepository;

    public CheckingController(CheckingCrudService checkingCrudService, PersonService personService, CheckingRepository checkingRepository) {
        this.checkingCrudService = checkingCrudService;
        this.personService = personService;
        this.checkingRepository = checkingRepository;
    }

    @GetMapping("/person/{id}/checking")
    public List<Checking> getAllChecking(@PathVariable Long id){
        return checkingCrudService.getAll(id);
    }

    @GetMapping("/checking/{id}")
    public Checking getOneAcc(@PathVariable Long id){
        return checkingCrudService.get(id);
    }

    @PostMapping("person/{id}/checking")
    public void addCheckingAccount(@RequestBody Checking checking, @PathVariable Long id){
        Person person = personService.getPerson(id);
        checking.setPerson(person);
        checkingCrudService.addCheckingAccount(checking);
    }
    @PutMapping("/person/{id}/checking/{checkingId}")
    public Checking updateChecking(@PathVariable Long checkingId, @RequestBody Checking checking){
        return checkingRepository.findById(checkingId).map(comment -> {
        comment.setCardNumber(checking.getCardNumber());
        comment.setAccountNumber(checking.getAccountNumber());
        comment.setBalance(checking.getBalance());
        return checkingRepository.save(comment);
        }).orElse(null);
//        https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/

    }
    @DeleteMapping("/person/{id}/checking/{checkingId}")
    public void deleteChecking(@PathVariable Long id){
        checkingCrudService.deleteCheckingAcc(id);
    }

    public void kakanec(){

    }

}
