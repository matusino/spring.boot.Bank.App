package com.Matus.spring.boot.Bank.App.model;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String Snn;
    @Nullable
    private String phoneNumber;
    @Nullable
    private String age;

    public Person(Long id, String firstName, String lastName, String snn, @Nullable String phoneNumber, @Nullable String age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Snn = snn;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSnn() {
        return Snn;
    }

    public void setSnn(String snn) {
        Snn = snn;
    }

    @Nullable
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@Nullable String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Nullable
    public String getAge() {
        return age;
    }

    public void setAge(@Nullable String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(Snn, person.Snn) &&
                Objects.equals(phoneNumber, person.phoneNumber) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, Snn, phoneNumber, age);
    }
}
