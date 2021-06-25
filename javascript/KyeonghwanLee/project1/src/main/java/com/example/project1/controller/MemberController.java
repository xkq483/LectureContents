package com.example.project1.controller;

import com.example.project1.entity.Member;
import com.example.project1.service.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberController {

    @Autowired
    private SignUpService service;

    @GetMapping("/signup")
    public String getSignUp (Member member, Model model) {
        log.info("getSignUp()");

        return "/member/signup";
    }

    @PostMapping("/signup")
    public String postSignUp (Member member, Model model) {
        log.info("postSignUp(): " + member);

        service.signup(member);
        model.addAttribute("msg", "가입이 완료되었습니다!");

        return "/member/success";
    }
}
