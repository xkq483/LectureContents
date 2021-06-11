package com.example.jswithspring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class FirstController {

    @GetMapping("/htmlList")
    public String doHtmlList () {
        log.info("doHtmlList()");

        return "first/list.html";
    }

    @GetMapping("/imageTest")
    public String doImageTest () {
        log.info("doImageTest()");

        return "first/image.html";
    }
}
