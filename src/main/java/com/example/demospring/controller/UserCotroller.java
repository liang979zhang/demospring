package com.example.demospring.controller;

import com.example.demospring.pojo.User;
import com.example.demospring.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
// RestController  =@Controller + @ResponseBody
@RestController
public class UserCotroller {


    @RequestMapping(value = "/getuser")
    public Result hello() {
        User user = new User();
        user.setAge(25);
        user.setBirthday(new Date());
        user.setName("Lili");
        user.setPassword("123456");
        user.setDesc("我是最帅的!!!!");
        return Result.success(user);
    }
}
