package com.example.demo.controller;

import com.example.demo.entity.PurchasingSignUp;
import com.example.demo.service.PurchasingSignUpService;
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
    private PurchasingSignUpService purchasingSignUpService;

    @GetMapping("/signUp")
    public String getSignUp (PurchasingSignUp purchasingSignUp, Model modelSignUp) {
        log.info("getSignUp()");

        return "/board/signUp/signUp";
    }

    @PostMapping("/signUp")
    public String postSignUp (PurchasingSignUp purchasingSignUp, Model modelSignUp) throws Exception {
        log.info("postSignUp()");

        log.info("PurchasingSignUp: " + purchasingSignUp);

        purchasingSignUpService.signUp(purchasingSignUp);

        // msg 라는 속성값에 "등록이 완료되었습니다!"을 맵핑함
        // key: msg, value: "등록이 완료되었습니다!" 라고 생각하면 편함
        modelSignUp.addAttribute("signUpMSG", "회원가입이 완료되었습니다!");

        return "/board/signUp/signUpComplete";
    }
}
