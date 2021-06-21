package com.example.projectTest.service;

import com.example.projectTest.entity.Project;

import java.util.List;

public interface ProjectService {
    public void register(Project project);

    public List<Project> list() throws Exception;

}
