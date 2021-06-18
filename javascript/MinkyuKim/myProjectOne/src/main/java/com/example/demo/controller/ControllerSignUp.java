package com.example.demo.controller;

import com.example.demo.entity.SignUpBoard;
import com.example.demo.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ControllerSignUp {

    @Autowired
    private BoardService service;

    @GetMapping("/signUp")
    public String getSignup (SignUpBoard signUpBoard, Model model) {
        log.info("getSignup()");

        return "/board/first/signUp";
    }

    @PostMapping("/signUp")
    public String postSignup (SignUpBoard signUpBoard, Model model) throws Exception {
        log.info("postSignUp()");

        log.info("signUpBoard: " + signUpBoard);

        service.signUp(signUpBoard);

        // msg 라는 속성값에 "등록이 완료되었습니다!"을 맵핑함
        // key: msg, value: "등록이 완료되었습니다!" 라고 생각하면 편함
        model.addAttribute("msg", "회원등록이 완료되었습니다!");

        return "/board/fourth/signUpComplete";
    }
}
