/*
package com.example.first.controller.member;

import com.example.first.entity.Board;
import com.example.first.service.BoardService;
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

    @GetMapping("/register")
    public String getRegister (Member member, Model model) {
        log.info("getRegister()");

        return "/member/register";
    }

    @PostMapping("/register")
    public String postRegister (Member member, Model model) throws Exception {
        log.info("postRegister()");
        log.info("Member: " + member);

        service.register(member);

        // msg 라는 속성값에 "등록이 완료되었습니다!"을 맵핑함
        // key: msg, value: "등록이 완료되었습니다!" 라고 생각하면 편함
        model.addAttribute("msg", "등록이 완료되었습니다!");

        return "/board/fourth/success";
    }

}
*/
