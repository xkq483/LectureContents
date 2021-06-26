package com.example.Quiz.service;

import com.example.Quiz.entity.Member;

public interface MemberService {
    public void signup(Member member) throws Exception;
    public void login(Member member) throws Exception;
}
