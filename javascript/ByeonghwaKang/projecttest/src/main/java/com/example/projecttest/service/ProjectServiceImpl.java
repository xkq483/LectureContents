package com.example.projecttest.service;

import com.example.projecttest.entity.Product;
import com.example.projecttest.entity.Project;
import com.example.projecttest.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository repository;

    @Override
    public void register(Product product) {
        repository.create(product);
    }

    @Override
    public List<Product> list() throws Exception {
        return repository.list();
    }







}
