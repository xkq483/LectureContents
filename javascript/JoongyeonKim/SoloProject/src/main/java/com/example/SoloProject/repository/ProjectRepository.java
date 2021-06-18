package com.example.SoloProject.repository;

import com.example.SoloProject.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ProjectRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Project project) throws Exception {
        String query = "insert into board (title, content, writer) values (?, ?, ?)";

        jdbcTemplate.update(query, project.getTitle(), project.getContent(), project.getWriter());
    }
}