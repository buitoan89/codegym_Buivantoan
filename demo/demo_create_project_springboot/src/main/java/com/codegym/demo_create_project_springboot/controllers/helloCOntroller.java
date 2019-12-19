package com.codegym.demo_create_project_springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloCOntroller {
    @GetMapping("/")
    public String testSpringboot(){
        return "hello";
    }
}
