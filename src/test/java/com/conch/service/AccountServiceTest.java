package com.conch.service;

import com.conch.domain.Account;
import com.conch.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by dachoi on 2017-06-13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AccountServiceTest {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private MongoOperations mongoOperations;

    @Before
    public void setUp() {
        resetMongoIntegrationTestDB();
    }

    @Test
    public void createAccountSuccess() {
        accountRepository.save(new Account("TEST"));
        accountRepository.save(new Account("TEST2"));
        List<Account> accountList = accountRepository.findAll();
        assertThat(accountList.size(), is(2));
    }

    private void resetMongoIntegrationTestDB() {
        deleteRepositoryIfExist(Account.class);
    }

    private <T> void deleteRepositoryIfExist(Class<T> t) {
        if (mongoOperations.collectionExists(t)) {
            mongoOperations.remove(new Query(), t.getSimpleName());
        }
    }
}