package com.example.personalProject2.controller;


import com.example.personalProject2.entity.BoardFree;
import com.example.personalProject2.service.BoardServiceFree;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ControllerFreeBoard {

    //Notice Board
    @Autowired
    private BoardServiceFree serviceFree;
    @GetMapping("/registerFree")

    public String getRegisterFree (BoardFree boardFree, Model modelFree)    {
        log.info("getRegisterFree()");

        return "/board/register/registerFree";
    }
    @PostMapping("/registerFree")
    public String postRegisterFree (BoardFree boardFree, Model modelFree) throws Exception  {
        log.info("postRegisterFree()");
        log.info("BoardFree: " + boardFree);

        serviceFree.registerFree(boardFree);

        modelFree.addAttribute("msgFree", "게시물 등록이 완료되었습니다");

        return "/board/success/successFree";
    }
    @GetMapping("/listsFree")
    public String getListsFree (Model modelFree) throws Exception   {
        log.info("getListsFree()");

        modelFree.addAttribute("listsFree", serviceFree.listFree());

        return "/board/lists/listsFree";
    }

}
