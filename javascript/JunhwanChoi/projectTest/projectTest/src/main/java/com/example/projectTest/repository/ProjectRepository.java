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
        String query = "insert into project (name, price, description) values (?, ?, ?)";

        jdbcTemplate.update(query, project.getName(), project.getPrice(), project.getDescription());
    }

    public List<Project> list() throws Exception {
        List<Project> results = jdbcTemplate.query(
                "select project_no, name, price, description, reg_date from project " +
                        "where project_no > 0 order by project_no desc",
                new RowMapper<Project>() {
                    @SneakyThrows
                    @Override
                    public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Project project = new Project();

                        project.setProjectNo(rs.getInt("project_no"));
                        project.setName(rs.getString("name"));
                        project.setPrice(rs.getInt("price"));
                        project.setDescription(rs.getString("description"));

                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        project.setRegDate(sdf.parse(rs.getDate("reg_date") + " " + rs.getTime("reg_date")));

                        return project;
                    }
                }
        );

        return results;
    }
}