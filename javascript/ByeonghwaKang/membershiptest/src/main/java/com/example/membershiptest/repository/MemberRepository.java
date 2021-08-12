package com.example.membershiptest.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.reflect.Member;

public class MemberRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Member member) {
        String query = "insert into member (name, DeclaringClass, getModifiers) values (? , ? , ?)";

        jdbcTemplate.update(query, member.getName(), member.getDeclaringClass(), member.getModifiers());
    }



}
