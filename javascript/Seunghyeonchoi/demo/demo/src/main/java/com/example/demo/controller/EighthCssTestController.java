package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
// 해당 컨트롤러 사용할 때 무조건 URL 위치가 기본적으로 /css가 들어감
@RequestMapping(value = "/css")
public class EighthCssTestController {


    @GetMapping("/basicTest")
    public String getBasicCssTest () {
        log.info("getBasicCssTest()");

        return "csstest/eighth/cssTest";
    }

    @GetMapping("/styleTest")
    public String getStyleTest () {
        log.info("getStyleTest()");

        return "csstest/eighth/styleTest";
    }

    @GetMapping("/marginTest")
    public String getMarginTest ()  {
        log.info("getMarginTest()");

        return "csstest/eighth/marginTest";
    }

    @GetMapping("idSelectTest")
    public String getIdSelectTest   ()  {
        log.info("getIdSelectTest()");;

        return "csstest/eighth/idSelectTest";
    }
}
