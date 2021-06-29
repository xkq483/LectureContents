package com.example.demo.controller.board;

import com.example.demo.service.BoardService;
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
        //위에서 처음에 받게되는 boardNo은 어디서 시작되는지 궁금합니다.
        log.info("read");

        model.addAttribute(service.read(boardNo));
        //key값과 value가 없는데 그냥 service의 read메소드에 boardNo를 단순히 전달하는 역할인가요?
        //그렇다면 그냥 service.read(boardNo) 이렇게 써도 되는것 아닌지?

        return "/board/fourth/read";
    }

    @GetMapping ("/delete")
    public String delete(int boardNo, Model model) throws Exception {
        log.info("delete");

        service.delete(boardNo);

        model.addAttribute("msg", "삭제가 완료되었습니다.");

        return "/board/fourth/success";
    }

}
