package com.example.jswithspring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class firstController {
    @GetMapping("/htmlList")
    public String doHtmlList () {
        log.info("doHtmlList()");

        return "first/list";
    }


    @GetMapping("/imageTest")
    public String imageTest() {
        log.info("imageTest");
        return "first/image.html";
    }

    @GetMapping("/fontTest")
    public String doFontTest () {
        log.info("doFontTest()");

        return "first/font";
    }

    @GetMapping("firstTableTest")
    public String f9rstTableTest () {
    log.info("secondTableTest()");

    return "first/tableTest2";
    }
}
