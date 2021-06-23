package com.example.personalProject2.repository;

import com.example.personalProject2.entity.BoardNotice;
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
public class BoardRepositoryNotice {

    @Autowired
    private JdbcTemplate jdbcTemplateNotice;

    //메서드 앞에 throws Exception 이라고 붙이고 throw new Exception 구문에서 강제로 예외처리를 발생시킵니다.
    public void create(BoardNotice boardnotice) throws Exception  {
        String queryNotice = "insert into boardnotice (titlenotice, contentnotice, writernotice) values (?, ?, ?)";

        jdbcTemplateNotice.update(queryNotice, boardnotice.getTitleNotice(), boardnotice.getContentNotice(),
                boardnotice.getWriterNotice());
    }
    public List<BoardNotice> listNotice() throws Exception {
         List<BoardNotice> results = jdbcTemplateNotice.query(
                 "select board_no_notice, titlenotice, contentnotice, writernotice, reg_date_notice from boardnotice " +
                        "where board_no_notice > 0 order by board_no_notice desc",

                new RowMapper<BoardNotice>() {
                    @SneakyThrows
                    @Override
                    public BoardNotice mapRow(ResultSet rs, int rowNum) throws SQLException {
                        BoardNotice boardNotice = new BoardNotice();

                        boardNotice.setBoardNoNotice(rs.getInt("board_no_notice"));
                        boardNotice.setTitleNotice(rs.getString("titlenotice"));
                        boardNotice.setContentNotice(rs.getString("contentnotice"));
                        boardNotice.setWriterNotice(rs.getString("writernotice"));

                        SimpleDateFormat sdfNotice = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        boardNotice.setRegDateNotice(sdfNotice.parse(rs.getDate("reg_date_notice") + " " +
                                rs.getTime("reg_date_notice")));

                        return boardNotice;
                    }
                }
        );

         return results;
    }
}
