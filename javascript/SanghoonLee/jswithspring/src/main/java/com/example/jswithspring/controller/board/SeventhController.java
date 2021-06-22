package com.example.jswithspring.controller.board;

import com.example.jswithspring.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class SeventhController {

    @Autowired
    private BoardService service;

    @GetMapping("/read")
    public String getRead (int boardNo, Model model) throws Exception {
        log.info("read");

        model.addAttribute(service.read(boardNo));

        return "board/seventh/read";
    }
}
