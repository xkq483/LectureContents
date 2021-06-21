package com.example.demo.controller.board;


import com.example.demo.entity.Board;
import com.example.demo.entity.Customer;
import com.example.demo.service.BoardService;
import com.example.demo.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/join")
    public String getJoin (Customer customer, Model model) {
        log.info("getJoin()");

        return "/customer/join";
    }

    // MVC(Model View Controller) Pattern
    // Model: 다루는 데이터
    // View: 눈에 보이는 화면
    // Controller: URL 제어
    @PostMapping("/join")
    public String postJoin (Customer customer, Model model) throws Exception {
        log.info("postJoin()");
        log.info("customer: " + customer);

        customerService.join(customer);

        // msg 라는 속성값에 "등록이 완료되었습니다!"을 맵핑함
        // key: msg, value: "등록이 완료되었습니다!" 라고 생각하면 편함
        model.addAttribute("msg", "등록이 완료되었습니다!");

        return "/customer/joinsuccess";
    }
}
