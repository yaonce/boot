package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/test")
    public String hello(){
        System.out.println("this is spring boot 2");
        return "ok";
    }
}
