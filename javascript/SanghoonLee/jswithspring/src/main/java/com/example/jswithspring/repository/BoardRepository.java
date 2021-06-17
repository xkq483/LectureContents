package com.example.jswithspring.repository;

import com.example.jswithspring.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Board board) throws Exception {
        // insert into board: DB에 있는 board 테이블에 값을 집어넣겠다.
        // (title, content, writer): board 테이블 내에 있는 컬럼들임
        // values (?, ?, ?): 뭔가 값을 넣을것인데 아직 미정이란 뜻
        String query = "insert into board (title, content, writer) values (?, ?, ?)";

        // jdbcTemplate.update(): 이것을 통해 실제 DB상의 값을 갱신함
        // query: 구동시킬 DB의 쿼리
        // 나머지 3개: query에 있는 ?에 배치할 값들을 결정함
        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getWriter());
    }
}
