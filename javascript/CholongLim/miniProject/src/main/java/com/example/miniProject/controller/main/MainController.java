package com.example.miniProject.controller.main;

import com.example.miniProject.entity.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
//@RequestMapping(value = "/member")
public class MainController {

    @GetMapping("/main")
    public String getMain() {
        log.info("getMain()");

        return "/main/mainHome";
    }
}