package com.example.jswithspring.controller.javascript;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class EleventhJavaScriptTestController {

    @GetMapping("/localeStringTest")
    public String getLocaleStringTest () {
        log.info("getLocaleStringTest()");

        return "/javascript/eleventh/localeStringTest";
    }

    @GetMapping("/customObjectTest")
    public String getCustomObjectTest () {
        log.info("getCustomObjectTest()");

        return "/javascript/eleventh/customObjectTest";
    }
}
