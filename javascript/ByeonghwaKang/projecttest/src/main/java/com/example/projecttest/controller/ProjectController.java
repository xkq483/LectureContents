package com.example.projecttest.controller;

import com.example.projecttest.entity.Product;
import com.example.projecttest.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller

public class ProjectController {
    @Autowired
    private ProjectService service;


    @GetMapping("/register")
    public String getRegister (Product product, Model model) {
        log.info("getRegister()");

        return "/project/register";
    }

    @PostMapping("/register")
    public String postRegister (Product product, Model model) throws Exception {
        log.info("postRegister()");
        log.info("Product: " + product);

        service.register(product);
        model.addAttribute("msg", "등록이 완료되었습니다!");

        return "/project/success";
    }

    @GetMapping("/lists")
    public String getLists (Model model) throws Exception {
        log.info("getLists(): " + service.list());

        model.addAttribute("product", service.list());

        return "/project/lists";
    }
    @GetMapping ("/home")
    public String getHome () throws Exception {
        log.info("getLists(): " + service.list());


        return "/project/home";
    }

}


