package com.example.demo.controller.vue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller

public class FirstVueCon {
    @GetMapping("/vueIndex")
    public String getIndex () {
        log.info("getIndex");

        return "/vue/index";
    }
    @GetMapping("/vueForTest")
    public String getvueForTest () {
        log.info("vueForTest(): 뷰로 for문을 맥이자!");

        return "/vue/second/vueForTest";
    }


}


