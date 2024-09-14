package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
    
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(Model model) {
        return "hello";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }
}
