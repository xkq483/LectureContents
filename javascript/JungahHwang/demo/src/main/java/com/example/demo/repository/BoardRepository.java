package com.example.demo.repository;

import com.example.demo.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Board board) throws Exception {
        String query = "insert into board (title, content, writer) values (? ,? ,?)";
        // insert into board: DB에 있는 board 테이블에 값을 집어넣는다.
        // (title, content, writer): board 내에 있는 컬럼
        // values (?,?,?): 값을 넣을 것인데 무엇을 넣을 지 모른다는 뜻
        // * 사용자가 입력한 정보가 저장됨 (mysql에서 select * from board; 를 치면 입력한 정보를 확인할 수 있음) *

        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getWriter());

    }
}
















