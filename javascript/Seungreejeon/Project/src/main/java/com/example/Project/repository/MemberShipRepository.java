package com.example.Project.repository;


import com.example.Project.entity.Membership;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberShipRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Membership membership) {
        String query = "insert into membership (name, password, user_id, address) values (?,?,?,?)";

        jdbcTemplate.update(query, membership.getName(), membership.getPassword(), membership.getUser_id(), membership.getAddress());
    }
}
