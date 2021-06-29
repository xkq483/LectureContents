package com.example.personalProject.controller;

import com.example.personalProject.eutity.Member;
import com.example.personalProject.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Slf4j
@Controller
public class joinController {

        @Autowired
        private MemberService service;


        @GetMapping("/join")
        public String getProb66(Member member, Model model) {
            log.info("getjoin()");

            return "/joinHTML/join";
        }

        @PostMapping("/join")
        public String postProb66(Member member, Model model) throws Exception {
            log.info("postJoin()");

            log.info("Member: " + member);

             /* 비밀번호 길이 체크 로직 시작 */
            String pw = member.getUserPass();
            if (pw.length() <= 8 || pw.length() > 20 ){
                // model.addAttribute("alertMsg", "8~ 20 이내의 비밀번호를 기재해주세요");
                return "redirect:/join";
            }
            /* 비밀번호 길이 체크 로직 끝 */
            service.join(member);

            // msg 라는 속성값에 "등록이 완료되었습니다!"을 맵핑함
            // key: msg, value: "등록이 완료되었습니다!" 라고 생각하면 편함
            model.addAttribute("msg", "가입이 완료되었습니다!");

            return "/joinHTML/joinSuccess";
        }
      /*
        @GetMapping("/login")
    public String getLogin (Member member, Model model){

        }*/
    
    }

