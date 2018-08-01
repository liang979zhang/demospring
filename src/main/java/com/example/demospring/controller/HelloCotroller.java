package com.example.demospring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotroller {


    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public Object hello() {
        return "hell spingboot~~~~";
    }
}
