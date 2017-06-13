package com.conch.service;

import com.conch.domain.Account;
import com.conch.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dachoi on 2017-06-13.
 */
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public void createAccount(String username) {
        accountRepository.save(new Account(username));
    }
}
