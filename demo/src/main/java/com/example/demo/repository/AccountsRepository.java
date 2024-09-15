package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Account;

public interface AccountsRepository extends JpaRepository<Account, String> {

}
