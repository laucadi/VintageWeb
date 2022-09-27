package com.vintage.vintage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class indexController {
    @GetMapping("/index")
    public String index (){
        return "index";
    }

    @GetMapping("/index/login")
    public String login (){
        return "login";
    }
}
