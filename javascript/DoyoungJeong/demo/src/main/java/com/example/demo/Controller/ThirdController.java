package com.example.demo.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class ThirdController {

    @GetMapping("/checkBoxTest")
    public String checkBoxTest() {
        log.info("checkBoxTest()");

        return "third/checkBox";
    }

    @GetMapping("/radioTest")
    public String radioTest() {
        log.info("radioTest()");

        return "/third/radio";
    }

    @GetMapping("/formRadioTest")
    public String formRadioTest() {
        log.info("formRadioTest()");

        return "third/formRadio";
    }

    @GetMapping("/test")
    public String test() {
        log.info("test()");

        return "redirect:/fontTest";
    }

    @GetMapping("/fieldsetLogInTest")
    public String fieldsetLogInTest() {
        log.info("fieldsetLogInTest");

        return "third/fieldsetLogIn";
    }

    @GetMapping("/numberRangeTest")
    public String numberRangeTest() {
        log.info("numberRangeInfo()");

        return "third/numberRange";
    }

    @GetMapping("/optgroupTest")
    public String optgroupTest() {
        log.info("optgroupTest()");

        return "third/optgroup";
    }

    @GetMapping("/buttonTest")
    public String buttonTest() {
        log.info("buttonTest()");

        return "third/button";
    }
}
