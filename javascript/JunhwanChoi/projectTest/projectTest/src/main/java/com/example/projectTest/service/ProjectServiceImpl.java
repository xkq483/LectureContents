package com.example.projectTest.service;

import com.example.projectTest.entity.Project;
import com.example.projectTest.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository repository;

    @Override
    public void register(Project project) {
        repository.create(project);
    }

    @Override
    public List<Project> list() throws Exception {
        return repository.list();
    }
}