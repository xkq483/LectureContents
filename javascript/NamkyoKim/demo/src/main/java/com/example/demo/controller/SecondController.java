package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class SecondController {
    @GetMapping("/test")
        public String dohtmlTest (){
            log.info("doHtmlTest()");

            return "second/htmltest";
    }
}
