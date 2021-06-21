package com.example.market.controller;

import com.example.market.entity.Market;
import com.example.market.service.marketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
class marketcontroller {


    @Autowired
    private marketService service;
    @GetMapping("/register")
    public String getRegister (Market market, Model model) {
        log.info("getRegister()");

        return "/market/register";
    }

    @PostMapping("/register")
    public String postRegister (Market market, Model model) throws Exception {

        log.info("postRegister()");

        log.info("market:" + market);


        service.register(market);

        return "/market/success";
    }



    @GetMapping("/lists")
    public String getlist (Model model) throws Exception{
        log.info("getList():"+service.list());

        model.addAttribute("market",service.list());

        return "/Market/lists";
    }
    @GetMapping("/homepage")
    public String homepage (){
        log.info("homepage()");
        return "/Market/homepage";
    }
}
