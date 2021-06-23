package com.example.sails.service;

import com.example.sails.entity.UserAccount;
import com.example.sails.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl implements UserAccountService{

    @Autowired
    private UserAccountRepository repository;


    @Override
    public void register(UserAccount userAccount) throws Exception {
        repository.create(userAccount);
    }
}
