package com.example.TallerJava.entities;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long accountNumber;
    private double balance;
    private LocalDateTime creationDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="people")
    private People people;

    public Account() {
    }

    public Account(Long accountNumber, double balance, LocalDateTime creationDate, People people) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.creationDate = creationDate;
        this.people = people;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
