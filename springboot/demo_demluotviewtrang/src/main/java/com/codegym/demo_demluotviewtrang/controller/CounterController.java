package com.codegym.demo_demluotviewtrang.controller;

import com.codegym.demo_demluotviewtrang.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("mycounter")
public class CounterController {

    /* add MyCounter in model attribute */
    @ModelAttribute("mycounter")
    public MyCounter setUpCounter() {
        return new MyCounter();
    }
//    @GetMapping("/test")
//    public String test(){
//        return "test";
//    }

    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") MyCounter myCounter) {
   // public String get(@ModelAttribute("mycounter") new MyCounter()) {
        myCounter.increment();
        return "index";
    }
}
