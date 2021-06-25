package com.example.market3.Controller1;

import com.example.market3.Entity.Login;
import com.example.market3.Entity.Market;
import com.example.market3.Entity.Signup;
import com.example.market3.Service.marketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Slf4j
@Controller
class marketcontroller {


    @Autowired
    private marketService service;
    @GetMapping("/register")
    public String getRegister (Market market, Model model) throws Exception{
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
    public String gethomepage (){
        log.info("gethomepage()");
        return "/Market/homepage";
    }



    @GetMapping("/signupcomplete")
    public  String signupcomplete(){
        log.info("signupcomplete()");

        return "/Market/signupcomplete";
    }

    @GetMapping("/MarketPage")
    public  String MarketPage(){
        log.info("MarketPage()");

        return "/Market/MarketPage";
    }
@GetMapping("/read")
    public String getRead(int productNo, Model model) throws  Exception{
        log.info("read");

        model.addAttribute(service.read(productNo));

        return "/Market/read";
}
    @PostMapping("/remove")
    public  String remove(int productNo, Model model) throws  Exception{
        log.info("remove()");
        service.remove(productNo);
        model.addAttribute("msg","삭제가완료되었습니다.");

        return "/market/success";
    }
    //수정할때 기존정보를 가져와야함 그래서 read를 하여 해당정보를 가져왔음.
    @GetMapping("/modify")
public String getModify(int productNo, Model model)throws  Exception{
        log.info("getModify()");

        model.addAttribute(service.read(productNo));
        //수정할때 기존정보를 가져와야함 그래서 read를 하여 해당정보를 가져왔음.
        return "/market/modify";

    }
    @PostMapping("/modify")
    public  String postModify(Market market , Model model) throws  Exception{
        log.info("postModify()");


        service.modify(market);
        model.addAttribute("msg","수정이 완료되었습니다.");
        return "/market/success";
    }
    @GetMapping("/signup")
    public  String getsignup (Signup signup, Model model) throws  Exception{
        log.info("getSignup()");

        return "/Market/signup";
    }
    @PostMapping("/signup")
    public  String postsignup (Signup signup, Model model) throws  Exception{
        log.info("postSignup");

        service.signup(signup);
        model.addAttribute("msg","회원가입을 축하합니다.");

        return "/Market/success";
    }
    @GetMapping("/nagnetshoppingmall")
    public String getnagnetshoppingmall () throws Exception{
        log.info("genagnetshoppingmall()");

        return "/market/nagnetshoppingmall";
    }
    @GetMapping("/login")
    public  String getLogin (Login login , Model model,Signup signup) throws  Exception{
        log.info("getLogin");


        return "/market/login";
    }
    @PostMapping("/login")
    public String postLogin(Login login, Model model) throws  Exception {
      log.info("postLogin()");
        int i = 0;
      service.logincheck(login);

      if(i==1){
          return "/market/success";
      }else{
          return "/market/fail";
      }

    }
    @GetMapping("/fail")
    public  String getFail(){
        log.info("getFail()");

        return "/market/fail";
    }





}
