package com.example.SoloProject.service;

import com.example.SoloProject.entity.Member;

import java.util.List;

public interface SignUpService {
    public void signup(Member member);

    public void login(Member member);

    public List<Member> list() throws Exception;
}
