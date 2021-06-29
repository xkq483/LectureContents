package com.example.SoloProject.controller;

import com.example.SoloProject.entity.Member;
import com.example.SoloProject.service.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/member")
// 서로 같은 이름의 맵핑이 있을 때 오류가 나오는 것을 막기위해 하나 더 만들어 주는것이다 /member/lists
public class MemberController {

    @Autowired
    private SignUpService memberservice;

    @GetMapping("/lists")
    public String getList (Model model) throws Exception {
        log.info("getList():"+ memberservice.list());

        model.addAttribute("member", memberservice.list());

        return "/member/memberIdList";
    }

    @GetMapping("/signup")
    public String getSignUp (Member member, Model model) {
        log.info("getSignUp()");

        return "/member/signup";
    }

    @PostMapping("/signup")
    public String postSignUp (Member member, Model model) {
        log.info("postSignUp(): " + member);
        log.info("Member: " + member);

        String pw = member.getPw();
        if (pw.length() <= 8) {
            return "redirect:/member/signup";
        }

        memberservice.signup(member);

        model.addAttribute("msg", "등록이 완료되었습니다!");

        return "/member/success";
    }
}
