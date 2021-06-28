package com.example.Project.repository;


import com.example.Project.entity.Board;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

@Repository
public class BoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Board board) throws Exception {
        String query = "insert into board (title, content, writer) values (?,?,?)";

        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getWriter());
    }


}
