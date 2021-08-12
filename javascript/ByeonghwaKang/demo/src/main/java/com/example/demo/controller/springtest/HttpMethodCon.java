package com.example.demo.controller.springtest;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/http-method")

public class HttpMethodCon {
    @Autowired
    private BoardService service;

    @GetMapping("/modify")
    public  String getmethodModify (int boardNo, Model model) {
        log.info ("getmethodModify()");



        return "/httpmethod/modify";
    }

    @PostMapping("/modify")
    public  String PostmethodModify (Board board, Model model) {
        log.info("postmethodModify(): " + board);


        return "/httpmethod/success";
    }

    @GetMapping("/lists")
    public String getmethodLists (Board board, Model model)  {
        log.info("getmethodLists");


        return "/httpmethod/lists";
    }

    @GetMapping("/register")
    public String getmethodRegister (Board board, Model model) {
        log.info("getmethodRegister");

        return "/httpmethod/register";
    }

    @PostMapping("/register")
    public String postmethodRegister (Board board, Model model) {
        log.info("postmethodRegister()");
        log.info("Board: " + board);


        return "/httpmethod/success";
    }
    @GetMapping("/read/{boardNo}")
    public String getmethodRead (@PathVariable("boardNo") int boardNo) {
        log.info("getmethodRead(): " + boardNo);



        return "httpmethod/read";
    }

    @PostMapping("/remove")
    public String getmethodremove (int boardNo) {
        log.info("getmethodremove");



        return "httpmethod/success";


    }



}
