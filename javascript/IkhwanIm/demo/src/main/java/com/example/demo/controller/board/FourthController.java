package com.example.demo.controller.board;

import com.example.demo.entity.Board;
import lombok.extern.slf4j.Slf4j;
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

    @GetMapping("/register")
    public void getRegister (Board board, Model model) {
        log.info("getRegister");
    }

    @PostMapping("/register")
    public String postRegister (Board board, Model model) {
        log.info("postRegister()");

        //service.register(board);

        model.addAttribute("msg", "등록이 완료되었습니다!");

        return "/board/fourth/success";
    }
}