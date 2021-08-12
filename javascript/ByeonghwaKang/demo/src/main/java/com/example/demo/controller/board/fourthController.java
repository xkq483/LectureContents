package com.example.demo.controller.board;


import com.example.demo.entity.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.BoardService;

@Slf4j
@Controller
public class fourthController {
    @Autowired
    private BoardService service;

    @GetMapping("/register")
    public String getRegister (Board board, Model model) {
        log.info("getRegister");

        return "/board/fourth/register";
    }

    @PostMapping("/register")
    public String postRegister (Board board, Model model) throws Exception {
        log.info("postRegister()");
        log.info("Board: " + board);

        service.register(board);

        model.addAttribute("msg", "등록이 완료되었습니다");

        return "/board/fourth/success";
    }

    //!!!  포스트 매핑  com.example.demo.service.register(board); , @Autowired 주석을 풀고나니 오류가 뜹니다
    //com.example.demo.service.register(board); 주석을 풀면 게시글등록 > Whitelabel Error Page
    //@Autowired 주석을 풀면 런오류




}
