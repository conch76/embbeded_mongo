package com.conch.repository;

import com.conch.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by dachoi on 2017-06-13.
 */
public interface AccountRepository extends MongoRepository<Account, String> {
}
