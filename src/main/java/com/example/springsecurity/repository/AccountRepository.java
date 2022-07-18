package com.example.springsecurity.repository;

import com.example.springsecurity.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository  extends JpaRepository<Account, Long> {
    Optional<Account> findAccountByUsername(String username);
}
