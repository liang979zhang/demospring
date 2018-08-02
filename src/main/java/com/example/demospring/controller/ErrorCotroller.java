package com.example.demospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("err")
public class ErrorCotroller {


    @RequestMapping("/error")
    public String error() {
        int a = 1 / 0;
        return "thymeleaf/errorss";
    }


    @RequestMapping("/ajaxErr")
    public String ajaxErr() {
        return "thymeleaf/ajaxErr.html";
    }

}
