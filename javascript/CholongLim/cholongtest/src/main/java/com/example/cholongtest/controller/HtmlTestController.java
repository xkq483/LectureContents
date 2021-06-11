package com.example.cholongtest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;
@Slf4j
@Controller
public class HtmlTestController {
//    HtmlTestController가 제어하는 요소를 디버깅하도록 서포트하는 객체
//    static final Logger log = LoggerFactory.getLogger(HtmlTestController.class);

    @GetMapping("/")
    public String firstIndex (){
        // 위에 Logger 사용하는 방식은 Lombok이 없을 경우 사용함

        log.info("firstTndex() 실행");
        return "htmlHi";
    }
}