package com.example.demospring.controller;

import com.example.demospring.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("th")
public class ThymeleafCotroller {

    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("name", "CCCCCCCCCCCCCCC");
        return "thymeleaf/index";
    }

    @RequestMapping("/center")
    public String center() {
        return "thymeleaf/center/center";
    }


    @RequestMapping("/test")
    public String test(ModelMap modelMap) {
        User user = new User();
        user.setAge(25);
        user.setBirthday(new Date());
        user.setName("Lili");
        user.setPassword("123456");
        user.setDesc("<font color='blue'><b> hello I'm Com</b></font>");
        modelMap.addAttribute("user", user);
        return "thymeleaf/test";
    }


    @RequestMapping("/postform")
    public String postform(User modelMap) {
        System.out.println(modelMap.getName());
        return "redirect:/zdl/th/test";
    }

}
