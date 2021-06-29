package com.example.SoloProject.service;

import com.example.SoloProject.entity.Member;
import com.example.SoloProject.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private SignUpRepository repository;

    @Override
    public void signup(Member member) {
        repository.create(member);
    }

    @Override
    public void login(Member member) {
        repository.create(member);
    }

    @Override
    public List<Member> list() throws Exception {
        return repository.list();
    }
}