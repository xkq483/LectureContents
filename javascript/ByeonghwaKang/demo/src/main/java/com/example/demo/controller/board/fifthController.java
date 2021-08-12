package com.example.demo.controller.board;


import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller


public class fifthController {
    @Autowired
    private BoardService service;

    @GetMapping("/lists")
    public String getLists (Board board, Model model) throws Exception {
        log.info("getLists");

        model.addAttribute("lists", service.list());

        return "/board/fifth/lists";
    }
}
