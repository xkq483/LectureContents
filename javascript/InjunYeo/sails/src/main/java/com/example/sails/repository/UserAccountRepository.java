package com.example.sails.repository;


import com.example.sails.entity.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserAccountRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(UserAccount userAccount) throws Exception{
        String query = "insert into useraccount (name,id,password,email) values (?,?,?,?)";

        jdbcTemplate.update(query,userAccount.getName(),userAccount.getId(),userAccount.getPassword(),userAccount.getEmail());
    }
}
