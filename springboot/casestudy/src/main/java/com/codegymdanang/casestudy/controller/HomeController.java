package com.codegymdanang.casestudy.controller;

import com.codegymdanang.casestudy.entity.FuramaFavorate;
import com.codegymdanang.casestudy.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("favorate")
public class HomeController {
    @Autowired
    DichVuService dichVuService;

    @GetMapping("/index")
    //required = false tham so nay co hoac khong co gia tri truyen vao
    public ModelAndView getHomepage(@RequestParam(value = "fromPrice",required = false) Integer fromPrice,
                                    @RequestParam(value = "toPrice", required = false) Integer toPrice ){
        ModelAndView modelAndView = new ModelAndView("home/index");
        if (fromPrice == null || toPrice == null){
            modelAndView.addObject("listdichvu",dichVuService.getAllDichVu());
        }else {
            modelAndView.addObject("listdichvu",dichVuService.findAllByChiphithueBetween(fromPrice,toPrice));
        }

        return modelAndView;
    }
    @GetMapping("/dichvu/{id}")
//    dung ham PathVariable bat
    public ModelAndView getDichVuService(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("dichvu/dichvuchitiet");
        modelAndView.addObject("dichvuchitiet",dichVuService.getDichVu(id));
        return modelAndView;
    }

    @GetMapping("/favorate/{id}")
    public String saveSessionFavorate(@PathVariable("id") Long id,@ModelAttribute("favorate") FuramaFavorate sessionFavorate){
        sessionFavorate.add(dichVuService.getDichVu(id));
        return "redirect:/index";
    }

    @GetMapping("/favoratepage")
    public String getFavoratePage(){
        return "home/favorite";
    }
//setup session favorate
    @ModelAttribute("favorate")
    public FuramaFavorate setupSession(){
        return new FuramaFavorate();
    }

}
