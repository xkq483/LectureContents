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

    @GetMapping("/prob77")
    public String getProb77() {
        log.info("getProb77()");

        return "/vue/prob77";
    }
}
