package com.example.personalProject2.controller;


import com.example.personalProject2.entity.BoardNotice;
import com.example.personalProject2.service.BoardServiceNotice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ControllerNoticeBoard {

    //Notice Board
    @Autowired
    private BoardServiceNotice serviceNotice;
    @GetMapping("/registerNotice")
    public String getRegisterNotice (BoardNotice boardNotice, Model modelNotice)    {
        log.info("getRegisterNotice()");

        return "/board/register/registerNotice";
    }
    @PostMapping("/registerNotice")
    public String postRegisterNotice (BoardNotice boardNotice, Model modelNotice) throws Exception  {
        log.info("postRegisterNotice()");
        log.info("BoardNotice: " + boardNotice);

        serviceNotice.registerNotice(boardNotice);

        modelNotice.addAttribute("msg", "공지 등록이 완료되었습니다");

        return "/board/success/success";
    }
    @GetMapping("/listsNotice")
    public String getListsNotice (Model modelNotice) throws Exception   {
        log.info("getListsNotice()");

        modelNotice.addAttribute("listsNotice", serviceNotice.listNotice());

        return "/board/lists/listsNotice";
    }

}
