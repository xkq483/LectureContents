package com.example.SoloProject.service;

import com.example.SoloProject.entity.Project;
import com.example.SoloProject.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Service는 여기서 register가 여러 방식으로 동작할 수 있음을 명시한다.
// 또한 Controller의 Autowired에 자동으로 연결되도록 서포트한다.
@Service
public class ProjectServicelmpl implements ProjectService {

    @Autowired
    private ProjectRepository repostory;

    @Override
    public void register(Project project) throws Exception{
        repostory.create(project);
    }
}