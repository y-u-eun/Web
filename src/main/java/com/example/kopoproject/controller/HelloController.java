package com.example.kopoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")   // url 요청을 받는 주소
    public String hello(Model model){
        model.addAttribute("username", "개똥이");
        return "hello";
    }

    @GetMapping("/seeyou")   // url 요청을 받는 주소
    public String seeyou(Model model){
        model.addAttribute("username", "개똥이");
        return "seeyou";
    }
}