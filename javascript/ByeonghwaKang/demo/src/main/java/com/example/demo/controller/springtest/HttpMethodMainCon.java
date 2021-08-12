package com.example.demo.controller.springtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller

public class HttpMethodMainCon {

    @GetMapping("/main")
    public String getMain() {
        log.info("getMain()") ;

        return "httpmethod/main";
    }
}
