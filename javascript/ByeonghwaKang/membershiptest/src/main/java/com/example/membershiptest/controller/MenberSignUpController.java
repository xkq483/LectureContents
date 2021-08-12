package com.example.membershiptest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import service.SignUpService;

import java.io.PrintWriter;
import java.lang.reflect.Member;

@Slf4j
@Controller




public class MenberSignUpController {
    //@Autowired
    private SignUpService


    @GetMapping("/signup")
    public String getSignUP (Member member, Model model) {
        log.info("getSignUp");
        return "/member/signup";
    }

    @PostMapping("/signup")
    public String postSignUP (Member member, Model model) {
        log.info("postSignUp");

        model.addAllAttributes("msg" ,


        return "/member/signup/sucess";

    }



}
