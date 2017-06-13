package com.conch.controller;

import com.conch.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dachoi on 2017-06-13.
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/account/{username}", method = RequestMethod.GET)
    @ResponseStatus( HttpStatus.OK )
    public void createUser(@PathVariable String username) {
        accountService.createAccount(username);
    }
}
