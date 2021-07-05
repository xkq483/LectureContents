package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class FirstVueController {

    @GetMapping("/")
    public String getIndex() {
        log.info("getIndex()");

        return "/vue/index";
    }

    @GetMapping("/vueForTest")
    public String getVueForTest() {
        log.info("getVueForTest()");

        return "/vue/vueForTest";
    }

    @GetMapping("/prob78")
    public String getProb78() {
        log.info("getProb78()");

        return "/vue/prob78";
    }
}
