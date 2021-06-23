package com.example.miniProject.controller.membership;

import com.example.miniProject.entity.Membership;
import com.example.miniProject.service.MembershipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;


@Slf4j
@Controller
public class MembershipController {


    @Autowired
    private MembershipService service;

    @GetMapping("/memRegister")
    public String getMemRegister(Membership membership, Model model) {
        log.info("getMemRegister");

        return "/membership/register";
    }

    @PostMapping("/memRegister")
    public String postRegister (Membership membership, Model model) throws Exception {
        log.info("postRegister()");
        log.info("Membership: " + membership);

        service.register(membership);
        model.addAttribute("signUp","회원 가입이 완료되었습니다!");

        return "/membership/success";
    }
}
