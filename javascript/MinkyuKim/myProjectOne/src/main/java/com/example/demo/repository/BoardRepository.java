package com.example.demo.repository;

import com.example.demo.entity.SignUpBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void create(SignUpBoard signUpBoard) throws Exception {

        String query = "insert into signUpBoard (id, pw, name, phoneNumber, em, address) values (?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(query, signUpBoard.getId(), signUpBoard.getPw(), signUpBoard.getName(), signUpBoard.getPhoneNumber(), signUpBoard.getEm(), signUpBoard.getAddress());

    }
}
