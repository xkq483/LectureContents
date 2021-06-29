package com.example.SoloProject.repository;

import com.example.SoloProject.entity.Member;
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
public class SignUpRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Member member) {
        String query = "insert into member (name, id, pw) values (?, ?, ?)";

        jdbcTemplate.update(query, member.getName(), member.getId(), member.getPw());


    }

    public List<Member> list() throws Exception {

        List<Member> results = jdbcTemplate.query(
                "select member_no, id, pw, reg_date from member " +
                        "where member_no > 0 order by member_no desc",

                new RowMapper<Member>() {
                    @SneakyThrows
                    @Override
                    public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Member member = new Member();

                        member.setMemberNo(rs.getInt("member_no"));
                        member.setId(rs.getString("id"));
                        member.setPw(rs.getString("pw"));

                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        member.setRegDate(sdf.parse(rs.getDate("reg_date") + " " + rs.getTime("reg_date")));

                        return member;
                    }
                }
        );
        return results;
    }
}