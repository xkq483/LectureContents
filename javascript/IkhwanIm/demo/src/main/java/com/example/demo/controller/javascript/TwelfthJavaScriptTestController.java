package com.example.demo.controller.javascript;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class TwelfthJavaScriptTestController {

    @GetMapping("/checkListWithArrayTest")
    public String getCheckListWithArrayTest () {
        log.info("getCheckListWithArrayTest()");

        return "/javascript/twelfth/checkListWithArrayTest";
    }
}
