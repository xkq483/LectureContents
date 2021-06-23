package com.example.SoloProject.controller;

import com.example.SoloProject.entity.Board;
import com.example.SoloProject.entity.Member;
import com.example.SoloProject.entity.Product;
import com.example.SoloProject.service.BoardService;
import com.example.SoloProject.service.ProductService;
import com.example.SoloProject.service.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberSignUpController {

    @Autowired
    private SignUpService signupservice;

    @GetMapping("/signup")
    public String getSignUp (Member member, Model model) {
        log.info("getSignUp()");

        return "/member/signup";
    }

    @PostMapping("/signup")
    public String postSignUp (Member member, Model model) {
        log.info("postSignUp(): " + member);

        signupservice.signup(member);

        model.addAttribute("msg", "가입이 완료되었습니다!");

        return "/member/success";
    }

    @Autowired
    private BoardService boardservice;


    @GetMapping("/register")
    public String getRegister (Board board, Model model) {
        log.info("getRegister()");

        return "/board/register";
    }

    @PostMapping("/register")
    public String postRegister (Board board, Model model) throws Exception {
        log.info("postRegister()");
        log.info("Board: " + board);

        boardservice.boardregister(board);

        model.addAttribute("blt", "등록이 완료되었습니다!");

        return "/board/success";  //이 postMapping은 유저가 게시글을 올리면 등록이 완료되었다는 메시지를 출력해야하기 때문에 success로 간다 
    }

    @Autowired
    private BoardService listservice;

    @GetMapping("/lists")
    public String getLists (Model model) throws Exception {
        log.info("getLists(): " + listservice.list());

        model.addAttribute("lists", listservice.list());

        return "/lists/lists";
    }

    @Autowired
    private ProductService productservice;

    @GetMapping("/productregister")
    public String getProduct (Model model) throws Exception {
        log.info("getProduct(): " + productservice.productlist());

        model.addAttribute("productlists", productservice.productlist());

        return "/product/productregister";
    }

    @PostMapping("/productregister")
    public String postProduct (Product product, Model model) throws Exception {
        log.info("postProduct()");
        log.info("Product: " + product);

        productservice.productregister(product);

        model.addAttribute("pdt", "등록이 완료되었습니다!");

        return "/product/success";
    }

    @GetMapping("/productlist")
    public String getProductlist (Model model) throws Exception {
        log.info("getProductlist(): " + productservice.productlist());

        model.addAttribute("product", productservice.productlist());

        return "/product/productlist";
    }

}
