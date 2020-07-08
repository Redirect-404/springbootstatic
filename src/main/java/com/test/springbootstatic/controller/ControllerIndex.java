package com.test.springbootstatic.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerIndex {

    @RequestMapping("/page")
    public String showPage(){
        return "index.html";
    }
}
