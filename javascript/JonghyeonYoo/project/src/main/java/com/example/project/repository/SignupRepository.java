package com.example.project.repository;

import com.example.project.entity.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SignupRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Signup signup) throws Exception {
        String query = "insert into signup (id, password, name, phone, email, dateofbirth) values (?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(query, signup.getId(), signup.getPassword(), signup.getName(), signup.getPhone(),
                                signup.getEmail(), signup.getDateofbirth());
    }
}

