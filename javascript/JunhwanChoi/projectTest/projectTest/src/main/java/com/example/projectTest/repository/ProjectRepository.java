package com.example.projectTest.repository;

import com.example.projectTest.entity.Project;
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
public class ProjectRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Project project) {
        String query = "insert into project (username, birth, id, password) values (?, ?, ?, ?)";

        jdbcTemplate.update(query, project.getUsername(), project.getBirth(), project.getId(),project.getPassword());
    }

    public List<Project> list() throws Exception {
        List<Project> results = jdbcTemplate.query(
                "select username, birth, id, password, reg_date from project "/* +
                        "where project_no > 0 order by project_no desc"*/,
                new RowMapper<Project>() {
                    @SneakyThrows
                    @Override
                    public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Project project = new Project();

                        project.setUsername(rs.getString("username"));
                        project.setBirth(rs.getInt("birth"));
                        project.setId(rs.getString("id"));
                        project.setPassword(rs.getString("password"));

                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        project.setRegDate(sdf.parse(rs.getDate("reg_date") + " " + rs.getTime("reg_date")));

                        return project;
                    }
                }
        );

        return results;
    }
}
