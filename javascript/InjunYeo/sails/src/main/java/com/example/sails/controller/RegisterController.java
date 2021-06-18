package com.example.sails.controller;

import com.example.sails.entity.UserAccount;
import com.example.sails.service.UserAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class RegisterController {

    @Autowired
    private UserAccountService service;

    @GetMapping("/userRegister")
    public String userGetRegister(UserAccount userAccount, Model model){
        log.info("userGetRegister()");

        return "register/userRegister";

    }

    @GetMapping("/success")
    public String success(){
        log.info("success");

        return "register/success";

    }

    @PostMapping("/userRegister")
    public String postUserRegister(UserAccount userAccount,Model model)throws Exception{
        log.info("postUserRegister()");
        log.info("userAccount"+userAccount);

        service.register(userAccount);

        model.addAttribute("msg","회원가입이 완료 되었습니다");

        return "register/success";
    }

}
