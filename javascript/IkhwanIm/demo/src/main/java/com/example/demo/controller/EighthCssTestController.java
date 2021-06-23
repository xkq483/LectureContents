package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
// 해당 컨트롤러를 사용할 때 무조건 URL 위치가 기본적으로 /css가 들어감
@RequestMapping(value = "/css")
public class EighthCssTestController {
    
    //결국 얘는 /css/basicTest 와 같음
    @GetMapping("/basicTest")
    public String getBasicCssTest () {
        log.info("getBasicCssTest()");

        return "csstest/eighth/cssTest";
    }

    @GetMapping("/styleTest")
    public String getStyleTest () {
        log.info("getStyleTest()");;

        return "csstest/eighth/styleTest";
    }

    @GetMapping("/marginTest")
    public String getMarginTest () {
        log.info("getMarginTest()");

        return "csstest/eighth/marginTest";
    }

    @GetMapping("/idSelectTest")
    public String getIdSelectTest() {
        log.info("getIdSelectTest()");

        return "csstest/eighth/idSelectTest";
    }

    @GetMapping("/allTest")
    public String getAllTest () {
        log.info("getAllTest()");

        return "csstest/eighth/allTest";
    }

    @GetMapping("/classSelectTest")
    public String getClassSelectTest() {
        log.info("getClassSelectTest()");

        return "csstest/eighth/classSelectTest";
    }

    @GetMapping("/tagClassSelectTest")
    public String getTagClassSelectTest() {
        log.info("getTagClassSelectTest()");

        return "csstest/eighth/tagClassSelectTest";
    }
}
