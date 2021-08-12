package com.example.demo.controller;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller

public class Eleventhjavacon {

    @GetMapping("/localeStringTest")
    public String getlocaleStringTest () {
        log.info("getlocaleStringTest");

        return "/javascript/eleventh/localeStringTest";
    }

    @GetMapping("/customObjectTest")
    public String getcustomObjectTest () {
        log.info("getcustomObjectTest");

        return "/javascript/eleventh/customObjectTest";
    }
    @GetMapping("/destDayTEST")
    public String getDestDayTEST () {
        log.info("getDestDayTEST");

        return "/javascript/eleventh/destDayTEST";
    }
}
