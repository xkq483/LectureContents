package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller

public class twelvecon {
    @GetMapping("/checkListWithArrayTest")
    public String getcheckListWithArrayTest() {
        log.info("getcheckListWithArrayTest()");

        return "/javascript/twelveth/checkListWithArrayTest";
    }
    @GetMapping("/checkListquiz")
    public String getcheckListquiz() {
        log.info("getcheckListquiz()");

        return "/javascript/twelveth/checkListquiz";
    }
    @GetMapping("/domTest")
    public String getdomTest() {
        log.info("getdomTest()");

        return "/javascript/twelveth/domTest";
    }
}
