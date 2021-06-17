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
public class FourthController {

    // 스프링이 자동으로 객체를 찾을 수 있게 서포트함
    //@Autowired
    //private BoardService service;

    // thymeleaf에서는 아래와 같이 특정한 객체를 입력으로 받으면
    // HTML에서 th:object와 같은 키워드를 통해 정보를 획득할 수 있다.
    // 즉 board 객체의 정보를 획득할 수 있음을 의미한다.
    @GetMapping("/register")
    public String getRegister (Board board, Model model) {
        log.info("getRegister");

        return "/board/fourth/register";
    }

    @PostMapping("/register")
    public String postRegister (Board board, Model model) {
        log.info("postRegister()");

        //service.register(board);

        model.addAttribute("msg", "등록이 완료되었습니다!");

        return "/board/fourth/success";
    }
}
