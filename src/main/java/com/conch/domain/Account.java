package com.conch.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by dachoi on 2017-06-13.
 */
@Data
@Document(collection = "Account")
@NoArgsConstructor
public class Account {
    @Id
    private String accountId;
    @Indexed
    private String username;

    public Account(String username) {
        this.username = username;
    }
}
