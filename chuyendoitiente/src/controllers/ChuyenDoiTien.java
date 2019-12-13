package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChuyenDoiTien {
    @GetMapping("/chuyentien")
    public String showform(){
        System.out.println("AAA");
        return "chuyentien";
    }
}
