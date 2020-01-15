package com.codegymdanang.casestudy.controller;

import com.codegymdanang.casestudy.entity.FuramaHopDong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HistoryController {
    @GetMapping("/history")
    public ModelAndView gethistoryPage(HttpServletRequest request, HttpServletResponse response){

        Cookie[] cookies=request.getCookies();
        List<FuramaHopDong> listhopdong = new ArrayList<>();
        System.out.println(cookies.length);
        for(int i = 0; i<cookies.length; i++){
            if (cookies[i].getName().contains("hopdong")){
                FuramaHopDong hopDong=new FuramaHopDong();
                String[] cookeValue=cookies[i].getValue().split("_");
                hopDong.setIdHopDong(Long.parseLong(cookeValue[0]));
                hopDong.setIddichvu(Long.parseLong(cookeValue[1]));
                hopDong.setNgayLamHopDong(Date.valueOf(cookeValue[2]));
                hopDong.setNgayKetThuc(Date.valueOf(cookeValue[3]));
                listhopdong.add(hopDong);
            }

        }
        ModelAndView  modelAndView=new ModelAndView("dichvu/history");
        modelAndView.addObject("historyHopDong", listhopdong);
        for (FuramaHopDong hopDong:listhopdong){
            System.out.println(hopDong.getIdHopDong());
            System.out.println(hopDong.getIddichvu());
            System.out.println(hopDong.getNgayLamHopDong());
            System.out.println(hopDong.getNgayKetThuc());

        }
        return modelAndView;

    }
}
