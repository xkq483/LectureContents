package com.example.demo.controller.javascript;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class TenthJavaScriptTestController {

    // 입력창을 띄어주는 동작 (HTML, CSS)
    @GetMapping("getJavaScriptPromptTest")
    public String getJavaScriptPromptTest() {
        log.info("getJavaScriptPromptTest()");

        return "javascript/tenth/prompt";
    }

    // 클릭하면 색상이 변하는 동작 (HTML, CSS)
    @GetMapping("/getQuerySelectTest")
    public String getQuerySelectTest() {
        log.info("getQuerySelectTest()");

        return "javascript/tenth/querySelect";
    }
    // 클릭하면 색상이 변하는 동작 (HTML, CSS, JS)
    @GetMapping("/getDivideElementTest")
    public String getDivideElementTest() {
        log.info("getDivideElementTest()");

        return "javascript/tenth/divideElement";
    }

    // 페이지 진입 시간을 보여주는 동작 (HTML, CSS, JS)
    @GetMapping("/getJavaScriptTimeTest")
    public String getJavaScriptTimeTest() {
        log.info("getJavaScriptTimeTest()");

        return "javascript/tenth/jsTime";
    }

    // 원가에 할인율이 적용된 값을 출력해주는 동작(HTML, CSS, JS)
    @GetMapping("/getSaleProductTest")
    public String getSaleProductTest() {
        log.info("getSaleProductTest()");

        return "javascript/tenth/saleProduct";
    }
}
