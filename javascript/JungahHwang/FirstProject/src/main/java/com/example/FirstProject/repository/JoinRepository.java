package com.example.FirstProject.repository;

import com.example.FirstProject.entity.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JoinRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Join join) throws Exception{
        String query = "insert into join_mem (id, pw, name, tel, addr) values (?, ?, ?, ?, ?)";

        jdbcTemplate.update(query, join.getId(),join.getPw(),join.getName(),
                            join.getTel(), join.getAddr());





















    }


}
