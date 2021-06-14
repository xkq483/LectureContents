package com.example.test.controlr;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Slf4j
@Controller
public class HtmlTestController {


    @GetMapping("/")
    public String firstIndex() {
        log.info("firstIndex() 실행");

        return "test";
    }
}
