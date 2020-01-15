package com.codegym.baithiketthucmodule.controller;

import com.codegym.baithiketthucmodule.model.ThanhPho;
import com.codegym.baithiketthucmodule.service.ThanhPhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ThanhPhoController {
@Autowired
    ThanhPhoService thanhPhoService;

    @GetMapping("/list-thanhpho")
    public ModelAndView listThanhPho(Pageable pageable){
        // System.out.println("ok1");
        Page<ThanhPho> thanhPhos =thanhPhoService.findAll(pageable);
        System.out.println(thanhPhos.get());
        ModelAndView modelAndView = new ModelAndView("thanhpho/list");
        modelAndView.addObject("thanhphos", thanhPhos);
        return modelAndView;
    }

    @GetMapping("/create-thanhpho")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("thanhpho/create");
        modelAndView.addObject("thanhpho", new ThanhPho());
        return modelAndView;
    }
    @PostMapping("/create-thanhpho")
    public ModelAndView saveThanhPho(@ModelAttribute("thanhpho") ThanhPho thanhPho) {
        thanhPhoService.save(thanhPho);
        ModelAndView modelAndView = new ModelAndView("thanhpho/create");
        modelAndView.addObject("thanhpho", new ThanhPho());
        modelAndView.addObject("message", "tao moi thanh cong");
        return modelAndView;
    }

    @GetMapping("/edit-thanhpho/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        //tim thay gia tri id thi thuc hien hien thi id do ra
        ThanhPho thanhPho = thanhPhoService.findById(id);
        if(thanhPho != null) {
            ModelAndView modelAndView = new ModelAndView("thanhpho/edit");
            modelAndView.addObject("thanhpho", thanhPho);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-thanhpho")
    public ModelAndView updateThanhpho(@ModelAttribute("thanhpho") ThanhPho thanhPho){
        thanhPhoService.save(thanhPho);
        ModelAndView modelAndView = new ModelAndView("thanhpho/edit");
        modelAndView.addObject("thanhpho", thanhPho);
        modelAndView.addObject("message", "cap nhat thanh cong");
        return modelAndView;
    }

    @GetMapping("delete-thanhpho/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        ThanhPho thanhPho = thanhPhoService.findById(id);
        if(thanhPho != null) {
            ModelAndView modelAndView = new ModelAndView("thanhpho/delete");
            modelAndView.addObject("thanhpho", thanhPho);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-thanhpho")
    public String deleteCustomer(@ModelAttribute("thanhpho") ThanhPho thanhPho){
        thanhPhoService.remove(thanhPho.getId());
        return "redirect:list-thanhpho";
    }

//    @ModelAttribute("quocgia")
//    public Iterable<quocgia> quocgias(){
//        return provinceService.findAll();
//    }
}
