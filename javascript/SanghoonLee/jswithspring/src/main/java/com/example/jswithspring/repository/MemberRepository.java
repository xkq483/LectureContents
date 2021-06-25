package com.example.jswithspring.repository;

import com.example.jswithspring.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Member member) throws Exception {
        String query = "insert into member (id, pw) values (?, ?)";

        jdbcTemplate.update(query, member.getId(), member.getPw());
    }
}
