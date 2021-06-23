package com.example.Project.controller.membership;


import com.example.Project.entity.Membership;
import com.example.Project.service.MembershipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberShipController {

    @Autowired
    private MembershipService membershipService;

    @GetMapping("/login")
    public String getM_Login() {
        log.info("getLogin");

        return "/membership/m_login";
    }

    @GetMapping("/m_register")
    public String getM_Register(Membership membership, Model model) throws Exception {
        log.info("getM_register()");

        return "/membership/m_register";
    }

    @PostMapping("/m_register")
    public String postM_Membership(Membership membership, Model model) throws Exception {
        log.info("postM_Register()");
        log.info("membership: " + membership);

        membershipService.M_register(membership);

        model.addAttribute("msg", "회원가입되었습니다.");

        return "/membership/m_success";
    }
}
