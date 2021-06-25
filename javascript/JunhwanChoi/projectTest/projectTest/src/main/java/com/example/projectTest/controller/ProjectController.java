package com.example.projectTest.controller;

import com.example.projectTest.entity.Project;
import com.example.projectTest.service.ProjectService;
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
    public String getRegister (Project project, Model model) {
        log.info("getRegister()");

        return "/project/register";
    }

    @PostMapping("/register")
    public String postRegister (Project project, Model model) throws Exception {
        log.info("postRegister()");
        log.info("Project: " + project);

        service.register(project);
        model.addAttribute("msg", "등록이 완료되었습니다!");

        return "/project/success";
    }

    @GetMapping("/lists")
    public String getLists (Model model) throws Exception {
        log.info("getLists(): " + service.list());

        model.addAttribute("project", service.list());

        return "/project/lists";
    }
    @GetMapping("/mainPage")
    public String getmainPage() {
        log.info("getmainPage()");

        return "/project/mainPage";
    }

    @GetMapping("/news")
    public String getnewsPage() {
        log.info("getnewsPage()");

        return "/project/news";
    }

    @GetMapping("/reservation")
    public String getrsvPage() {
        log.info("getrevPage()");

        return "/project/reservation";
    }

    @GetMapping("/backupTest")
    public String backupTest() {
        log.info("backupTest()");

        return "/project/backupTest";
    }

    @GetMapping("/read")
    public String getRead(int signupNo, Model model) throws Exception {
        log.info("read");

        model.addAttribute(service.read(signupNo));

        return "project/read";
    }

    @PostMapping("/remove")
    public String remove(int signupNo, Model model) throws Exception {
        log.info("remove");

        service.remove(signupNo);

        model.addAttribute("msg", "탈퇴가 완료되었습니다!");

        return "project/success";
    }

    @GetMapping("/modify")
    public String getModify (int signupNo, Model model) throws Exception {
        log.info("getModify()");

        model.addAttribute(service.read(signupNo));

        return "/project/modify";
    }

    @PostMapping("/modify")
    public String postModify (Project project, Model model) throws Exception {
        log.info("postModify(): " + project);

        service.modify(project);
        model.addAttribute("msg", "수정이 성공적으로 완료되었습니다!");

        return "/project/success";
    }



}
