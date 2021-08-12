package com.example.demo.controller.javascript;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller

public class TenthJavaScriptPromtTestCon {


    @GetMapping ("/getJavaScriptPromtTest")

    public String getJavaScriptPromtTest() {
        log.info("getJavaScriptPromtTest");

        return "/javascript/tenth/prompt";
    }

    @GetMapping ("/getQuerySelectTest")

    public String getQuerySelectTest() {
        log.info("getQuerySelectTest");

        return "/javascript/tenth/QuerySelect";
    }

    @GetMapping ("/getDivideElementTest")

    public String getDivideElementTest() {
        log.info("getDivideElementTest");

        return "/javascript/tenth/DivideElementTest";
    }


    @GetMapping ("/getMouseOverTest")

    public String getMouseOverTest() {
        log.info("getMouseOverTest");

        return "/javascript/tenth/MouseOver";
    }
    @GetMapping ("/geInvisibilityTest")

    public String geInvisibilityTest() {
        log.info("geInvisibilityTest");

        return "/javascript/tenth/Invisibility";
    }
}
