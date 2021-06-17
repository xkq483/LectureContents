package com.example.jswithspring.controller.board;

import com.example.jswithspring.entity.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class FifthController {

    // 스프링이 자동으로 객체를 찾을 수 있게 서포트함
    //@Autowired
    //private BoardService service;

    @GetMapping("/register")
    public void getRegister (Board board, Model model) {
        log.info("getRegister");
    }

    @PostMapping("/register")
    public void postRegister (Board board, Model model) {
        log.info("postRegister()");

        //service.register(board);

        model.addAttribute("msg", "등록이 완료되었습니다!");

        return "/board/fifth/success";
    }
}
