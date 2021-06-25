package com.example.jswithspring.controller.javascript;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class TenthJavaScriptTestController {

    @GetMapping("getJavaScriptPromptTest")
    public String getJavaScriptPromptTest() {
        log.info("getJavaScriptPromptTest()");

        return "/javascript/tenth/prompt";
    }

    @GetMapping("/getQuerySelectTest")
    public String getQuerySelectTest() {
        log.info("getQuerySelectTest()");

        return "/javascript/tenth/querySelect";
    }

    @GetMapping("/getDivideElementTest")
    public String getDivideElementTest () {
        log.info("getDivideElementTest()");

        return "/javascript/tenth/divideElement";
    }

    @GetMapping("/getJavaScriptTimeTest")
    public String getJavaScriptTimeTest () {
        log.info("getJavaScriptTimeTest()");

        return "/javascript/tenth/jsTime";
    }
}
