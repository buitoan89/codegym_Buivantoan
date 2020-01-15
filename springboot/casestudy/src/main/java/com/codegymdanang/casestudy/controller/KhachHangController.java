package com.codegymdanang.casestudy.controller;

import com.codegymdanang.casestudy.entity.FuramaKhachHang;
import com.codegymdanang.casestudy.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class KhachHangController {
    @Autowired
    KhachHangService khachHangService;

    @GetMapping("/dangky")
    public String getTrangdangky(Model model){
        model.addAttribute("khachhang",new FuramaKhachHang());
        return "khachhang/trangdangky";
    }
    @PostMapping("/dangky")
    public String savedangky(@Valid @ModelAttribute("khachhang") FuramaKhachHang furamaKhachHang, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "khachhang/trangdangky";
        }else {
            furamaKhachHang.setIdLoaiKhach((long) 1);
            khachHangService.saveKhachHang(furamaKhachHang);
            return "khachhang/dangkythanhcong";
        }
    }

}
