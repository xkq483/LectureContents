package com.example.personalProject2.repository;

import com.example.personalProject2.entity.BoardFree;
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
public class BoardRepositoryFree {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //메서드 앞에 throws Exception 이라고 붙이고 throw new Exception 구문에서 강제로 예외처리를 발생시킵니다.
    public void create(BoardFree boardfree) throws Exception  {
        String queryFree = "insert into boardfree (titlefree, contentfree, writerfree) values (?, ?, ?)";

        jdbcTemplate.update(queryFree, boardfree.getTitleFree(), boardfree.getContentFree(),
                boardfree.getWriterFree());
    }
    public List<BoardFree> listFree() throws Exception {
        List<BoardFree> results = jdbcTemplate.query(
                "select board_no_free, titlefree, contentfree, writerfree, reg_date from boardfree " +
                        "where board_no_free > 0 order by board_no_free desc",

                new RowMapper<BoardFree>() {
                    @SneakyThrows
                    @Override
                    public BoardFree mapRow(ResultSet rs, int rowNum) throws SQLException {
                        BoardFree boardFree = new BoardFree();

                        boardFree.setBoardNoFree(rs.getInt("board_no_free"));
                        boardFree.setTitleFree(rs.getString("titlefree"));
                        boardFree.setContentFree(rs.getString("contentfree"));
                        boardFree.setWriterFree(rs.getString("writerfree"));

                        SimpleDateFormat sdfFree = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        boardFree.setRegDateFree(sdfFree.parse(rs.getDate("reg_date") + " " +
                                rs.getTime("reg_date")));

                        return boardFree;
                    }
                }
        );

        return results;
    }
}
