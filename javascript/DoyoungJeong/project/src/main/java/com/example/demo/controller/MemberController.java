package com.example.demo.controller;

import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;
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
    private MemberService service;

    @GetMapping("/memberSignup")
    public String getMemberSignup(Member member, Model model) {
        log.info("getMemberSignup()");

        return "/member/memberSignup";
    }

    @PostMapping("/memberSignup")
    public String postSignupSuccess(Member member, Model model) throws Exception {
        log.info("postMemberSignup()");

        service.memberSignup(member);
        model.addAttribute("msg", "가입되셨습니다!");

        return "/member/signupSuccess";
    }

    @GetMapping("/memberList")
    public String getMemberList(Member member, Model model) throws Exception {
        log.info("getMemberList()");

        model.addAttribute("memberList", service.list());
        return "/member/memberList";
    }
}
