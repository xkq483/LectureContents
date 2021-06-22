package com.example.project1.repository;


import com.example.project1.entity.Member;
import com.example.project1.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SignUpRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create (Member member) {
        String query = "insert into member (id, pw, name, phoneNumber, email, address) values (?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(query, member.getId(), member.getPw(), member.getName(), member.getPhoneNumber(), member.getEmail(), member.getAddress());
    }
}