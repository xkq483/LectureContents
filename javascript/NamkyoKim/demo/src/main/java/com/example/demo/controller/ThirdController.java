package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class ThirdController {
    @GetMapping("/checkboxTest")
    public String checkboxTest(){

        log.info("checkboxTest()");

        return "/third/checkbox";
    }
}
