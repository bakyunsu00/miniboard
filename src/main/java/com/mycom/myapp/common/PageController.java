package com.mycom.myapp.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//page 이동만 담당
@Controller
public class PageController {
    @GetMapping("/pages/register")
    public String register(){
        return "register";
    }

    @GetMapping("/pages/login")
    public String login(){
        return "login";
    }

    @GetMapping("/pages/board")
    public String board(){
        return "board";
    }
}
