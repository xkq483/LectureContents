package com.example.FirstProject.controller;

import com.example.FirstProject.entity.Join;
import com.example.FirstProject.service.JoinService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class JoinController {
    @Autowired
    private JoinService service;

    @GetMapping("/join")
    public String join (Join join, Model model) throws Exception{
        log.info("join()");
        return "join/join_p";
    }

    @PostMapping("/join")
    public String joinForm (Join join, Model model) throws Exception{
        log.info("joinForm()");
        service.register(join);
        model.addAttribute("success", "회원가입이 완료되었습니다!");
        return "join/success";
    }
}
