package com.example.Project.repository;


import com.example.Project.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Board board) throws Exception {
        String query = "insert into board (title, content, writer) values (?,?,?)";

        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getWriter());
    }
}
