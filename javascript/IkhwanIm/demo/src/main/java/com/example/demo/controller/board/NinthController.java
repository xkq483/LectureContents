package com.example.demo.controller.board;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping(value = "/css")
public class NinthController {

    @GetMapping("getPercentTest")
    public String getPercentTest() {
        log.info("getPercentTest()");

        return "/csstest/ninth/percentTest";
    }

    @GetMapping("getTransparencyTest")
    public String getTransparencyTest () {
        log.info("getTransparencyTest()");

        return "/csstest/ninth/transparencyTest";
    }

    @GetMapping("getBackgroundClipTest")
    public String getBackgroundClipTest () {
        log.info("getBackgroundClipTest");

        return "/csstest/ninth/backgroundClipTest";
    }

    @GetMapping("getGradientTest")
    public String getGradientTest () {
        log.info("getGradientTest()");

        return "/csstest/ninth/gradientTest";
    }
}
